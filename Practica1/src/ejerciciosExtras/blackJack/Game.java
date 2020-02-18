package ejerciciosExtras.blackJack;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		Juego();

	}

	private static void Juego() {
		String jugar = "yes";
		Scanner sc = new Scanner(System.in);
		int dineroUser = 100;
		int dineroDealer = 50000000;

		System.out.println("-----------------------------");
		System.out.println("|    Bienvenido al Casino   |");
		System.out.println("-----------------------------");
		esperar();

		System.out.print("\n¿Cuánto quiere apostar? ---> ");
		int apuesta = sc.nextInt();
		while (apuesta > dineroUser) {
			System.out.println("Apuesta no correcta: ");
			apuesta = sc.nextInt();
		}
		limpiaConsola();
		while (jugar.equals("yes")) {
			BlackjackHand user = new BlackjackHand("Usuario");
			BlackjackHand dealer = new BlackjackHand("Consola");

			Boolean winner = true;
			Boolean turno = true;

			Deck deck = new Deck(false);
			deck.shuffle();
			
//			Card ace = new Card(1, 2);
//			Card ace1 = new Card(1, 1);
//			Card rey1 = new Card(13, 1);
//			Card rey = new Card(13, 2);
//			
//			user.addCard(ace);
//			dealer.addCard(ace1);
//			user.addCard(rey1);
//			dealer.addCard(rey);

			user.addCard(deck.dealCard());
			dealer.addCard(deck.dealCard());
			user.addCard(deck.dealCard());
			dealer.addCard(deck.dealCard());

			muestraMano(user, turno);
			muestraMano(dealer, turno);
			
			System.out.print("\n\n¿Continua o pasa?");
			String decision = sc.next();
			if (!decision.equals("hit") && !decision.equals("pass")) {
				System.out.println("No ha sido posible determinar su decision de juego");
				decision = sc.next();
			}

			while (!decision.equals("pass")) {

				if (decision.equals("hit")) {
					user.addCard(deck.dealCard());
					muestraMano(user, turno);
					muestraMano(dealer, turno);
					System.out.print("\n\n¿Continua o pasa?");
				} else {
					System.out.println("No ha sido posible determinar su decision de juego");
				}
				if (user.getBlackjackValue() > 21) {
					winner = false;
					break;
				}
				decision = sc.next();
//			System.out.flush();
			}
			turno = false;

			if (winner) {
				while (dealer.getBlackjackValue() <= 16) {
					dealer.addCard(deck.dealCard());
					muestraMano(user, turno);
					muestraMano(dealer, turno);
				}
			}

			limpiaConsola();

			if ((dealer.getBlackjackValue() >= user.getBlackjackValue() && dealer.getBlackjackValue() <= 21)
					|| user.getBlackjackValue() > 21) {
				muestraMano(user, turno);
				System.out.println("Valor de la mano: " + user.getBlackjackValue());
				muestraMano(dealer, turno);
				System.out.println("Valor de la mano: " + dealer.getBlackjackValue());

				dineroUser -= apuesta;
				dineroDealer += apuesta;
				System.out.println("\nHas perdido, ¿quieres volver a jugar?");
			} else {
				muestraMano(user, turno);
				System.out.println("Valor de la mano: " + user.getBlackjackValue());
				muestraMano(dealer, turno);
				System.out.println("Valor de la mano: " + dealer.getBlackjackValue());

				dineroDealer -= apuesta;
				dineroUser += apuesta;
				System.out.println("\nHas ganado, ¿quieres volver a jugar?");
			}
			Scanner pregunta = new Scanner(System.in);
			jugar = pregunta.next();
//			while(!jugar.equals("yes") || !jugar.equals("no")) {
//				Scanner repeticion = new Scanner(System.in);
//				System.out.print("\nRepita su respuesta: ");
//				jugar = repeticion.next();
//			}

			if (jugar.equals("no") || dineroDealer == 0 || dineroUser == 0) {
				System.out.printf("Le queda dinero: " + dineroUser);
				System.out.println("\n");
				break;
			}

			limpiaConsola();
			System.out.printf("Tiene " + dineroUser + " ud. de dinero\n\n");

			System.out.print("¿Cuanto desea apostar? ---> ");
			apuesta = sc.nextInt();
			while (dineroUser - apuesta < 0 && dineroDealer - apuesta < 0) {
				System.out.println("La apuesta no es válida");
				apuesta = sc.nextInt();
			}

		}

	}

	private static void limpiaConsola() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}

	private static void muestraMano(BlackjackHand jugador, Boolean turno) {
		System.out.print("La mano del jugador " + jugador.getName() + " es: ");
		if (turno) {
			for (int posicion = 0; posicion < jugador.getCardCount(); posicion++) {
				if (posicion != jugador.getCardCount() - 1) {
					if (jugador.getName() == "Usuario" || (jugador.getName() == "Consola" && posicion != 0)) {
						System.out.print("[" + jugador.getCard(posicion) + "]" + ", ");
					} else if (jugador.getName() == "Consola" && posicion == 0) {
						System.out.print("[Card not shown], ");
					}

				} else {
					System.out.println("[" + jugador.getCard(posicion) + "]");
				}
			}
		} else {
			for (int posicion = 0; posicion < jugador.getCardCount(); posicion++) {
				if (posicion != jugador.getCardCount() - 1) {
					System.out.print("[" + jugador.getCard(posicion) + "]" + ", ");
				} else {
					System.out.println("[" + jugador.getCard(posicion) + "]");
				}
			}
		}
	}

	private static void esperar() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
	}

}
