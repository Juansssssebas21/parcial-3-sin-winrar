
public class Conexion {
	//atributos privados
		private String Nombre;
		private long Puerto;
		private String Host;
		private String Usuario;
		private String password;
		private String tipo;
		
protected final static double TAMAÑO = 8;

public Conexion(String nombre, long puerto, String host, String usuario, String password, String tipo) {
		super();
		Nombre = nombre;
		Puerto = puerto;
		Host = host;
		Usuario = usuario;
		this.password = password;
		this.tipo = tipo;
	}
	public Conexion(String nombre, long puerto, String host, String tipo) {
		super();
		Nombre = nombre;
		Puerto = puerto;
		Host = host;
		this.tipo = tipo;
	}
	public Conexion(String nombre, String host, String password, String tipo) {
		super();
		Nombre = nombre;
		Host = host;
		this.password = password;
		this.tipo = tipo;
	}

	public Conexion(String nombre, long puerto, String host, String usuario, String password) {
		super();
		Nombre = nombre;
		Puerto = puerto;
		Host = host;
		Usuario = usuario;
		this.password = password;
	}
	public Conexion() {
		super();
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public long getPuerto() {
		return Puerto;
	}
	public void setPuerto(long puerto) {
		Puerto = puerto;
	}
	public String getHost() {
		return Host;
	}
	public void setHost(String host) {
		Host = host;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
