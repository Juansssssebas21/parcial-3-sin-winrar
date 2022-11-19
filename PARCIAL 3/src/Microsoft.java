
public class Microsoft extends Conexion {

	
	private String lenguajeconsultaorm;
	private boolean isCloud;
	
	private final static int PETICIONES_CONCURRENTES = 1500;
	
	/**
	 * @param lenguajeconsultaorm
	 * @param isCloud
	 */
	public Microsoft(String lenguajeconsultaorm, boolean isCloud) {
		super();
		this.lenguajeconsultaorm = lenguajeconsultaorm;
		this.isCloud = isCloud;
	}

	/**
	 * 
	 */
	public Microsoft() {
		super();
	}

	public String getLenguajeconsultaorm() {
		return lenguajeconsultaorm;
	}

	public void setLenguajeconsultaorm(String lenguajeconsultaorm) {
		this.lenguajeconsultaorm = lenguajeconsultaorm;
	}

	public boolean isCloud() {
		return isCloud;
	}

	public void setCloud(boolean isCloud) {
		this.isCloud = isCloud;
	}
	
	
}
