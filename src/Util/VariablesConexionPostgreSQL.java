package Util;

/** variablesConexionPostgreSQL - Clase que recoger las variables de conexión a PostgreSQL.
 * @author garfe
 * 29/09/2022
 */
public class VariablesConexionPostgreSQL {
	
	//Datos de conexión a PostgreSQL
	static final String USER = "postgres";
	static final String PASS = "12345";
	static final String PORT = "5432";
	static final String HOST = "localhost";
	static final String DB = "postgres";	
	
	public static String getUser() {
		return USER;
	}
	public static String getPass() {
		return PASS;
	}
	public static String getPort() {
		return PORT;
	}
	public static String getHost() {
		return HOST;
	}
	public static String getDb() {
		return DB;
	}

}
