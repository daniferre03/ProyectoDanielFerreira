
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
	
	public int getNJugadores() {
		return nJugadores;
	}

	public void setnJugadores(int nJugadores) {
		this.nJugadores = nJugadores;
	}
	
	public String getNombreJugador() {
		return nombreJugador;
	}
	
	public void setNombreJugador(String nombreJugador) {
		this.nombreJugador=nombreJugador;
	}
	
	public static void nombreEquipo(String nombreEquipo) {
		for(int i=0;i<1000;i++) {
			System.out.println("Riojasala");
		}
	}
}
