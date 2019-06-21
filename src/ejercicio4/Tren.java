package ejercicio4;

public class Tren {

	public static final int CAPACIDAD_MAXIMA = 400;
	public static final int ACTIVIDAD_MAXIMA = 40;

	private String tipo;
	private String referencia;
	private int asientosOcupados;
	private int aniosActivo;

	public Tren(String tipo, String referencia, int asientosOcupados, int aniosActivo) {
		this.tipo = tipo;
		this.referencia = referencia;
		this.asientosOcupados = asientosOcupados;
		this.aniosActivo = aniosActivo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	public int getAniosActivo() {
		return aniosActivo;
	}

	public void setAnyosActivo(int aniosActivo) {
		this.aniosActivo = aniosActivo;
	}

	/**
	 * Comprueba la capacidad maxima
	 * 
	 * @see CAPACIDAD_MAXIMA
	 * @return true si es mayor o igual a la CAPACIDAD_MAXIMA, false en caso
	 *         contrario
	 */
	public boolean estaLleno() {
		boolean res = false;

		if (this.asientosOcupados >= CAPACIDAD_MAXIMA) {
			res = true;
		}
		return res;
	}

	/**
	 * Comprueba si es viejo
	 * 
	 * @see ACTIVIDAD_MAXIMA
	 * @return true si es mayor o igual a la ACTIVIDAD_MAXIMA, false en caso
	 *         contrario
	 */
	public boolean esViejo() {
		boolean res = false;

		if (this.aniosActivo >= ACTIVIDAD_MAXIMA) {
			res = true;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Tren [tipo=" + tipo + ", referencia=" + referencia + ", asientosOcupados=" + asientosOcupados
				+ ", anyosActivo=" + aniosActivo + "]";
	}
}