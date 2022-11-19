
public class Oracle extends Conexion {
    
	
	private int cantidaddeusuariospermitidos;
	private boolean plsql;

	private final static int PETICIONES_CONCURRENTES = 1000;
	 
	
/**
 * @param cantidaddeusuariospermitidos
 * @param plsql
 */
public Oracle(int cantidaddeusuariospermitidos, boolean plsql) {
	super();
	this.cantidaddeusuariospermitidos = cantidaddeusuariospermitidos;
	this.plsql = plsql;
}


/**
 * 
 */
public Oracle() {
	super();
   }


public int getCantidaddeusuariospermitidos() {
	return cantidaddeusuariospermitidos;
}


public void setCantidaddeusuariospermitidos(int cantidaddeusuariospermitidos) {
	this.cantidaddeusuariospermitidos = cantidaddeusuariospermitidos;
}


public boolean isPlsql() {
	return plsql;
}


public void setPlsql(boolean plsql) {
	this.plsql = plsql;
}
}

