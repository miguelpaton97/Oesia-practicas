package ejWrapper;

public class Musico {

	public static void main(String[] args) {

		AcousticGuitar acoustic = new AcousticGuitar();
//		acoustic.onGuitar();
		
		AcousticAdaptedGuitar acousticAdapted = new AcousticAdaptedGuitar();
		acousticAdapted.setAcousticGuitar(acoustic);
		
		acousticAdapted.onGuitar();
		acousticAdapted.offGuitar();
		
	}

}
