
public class DanielFerreiraFutbol {
	
	public String nombreEquipo;
	public int nJugadores;
	public String nombreJugador;
	
	public DanielFerreiraFutbol(String nombreEquipo, int nJugadores, String nombreJugador) {
		this.nombreEquipo=nombreEquipo;
		this.nJugadores=nJugadores;
		this.nombreJugador=nombreJugador;
	}

	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo=nombreEquipo;
	}
	
}
