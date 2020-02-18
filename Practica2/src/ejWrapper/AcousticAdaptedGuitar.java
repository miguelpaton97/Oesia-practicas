package ejWrapper;

public class AcousticAdaptedGuitar extends Guitarra{
	
	AcousticGuitar acoustic = new AcousticGuitar();
	
	public void setAcousticGuitar(AcousticGuitar acoustic) {
		this.acoustic = acoustic;
	}

	public void onGuitar() {
		acoustic.play();
	}

	public void offGuitar() {
		acoustic.stopPlaying();
	}

}
