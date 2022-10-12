package Models.Consultas;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Models.Conexiones.ConexionPostgreSQL;
import Models.DTOs.AlumnoDTO;
import Models.DTOs.AsignaturaDTO;
import Models.DTOs.ProfesorDTO;
import Models.DTOs.RelAlumAsigDTO;
import Models.DTOs.RelProfAsigDTO;
import Models.ToDTOs.PostgreSQLtoDTOs;
import Util.VariablesConexionPostgreSQL;

public class ConsultasPostgreSQL {

	// MÉTODOS
	
	/**************************************** CONSULTAS SELECT *********************************************/
	
    public static List<AlumnoDTO> ConsultaSelectAlumnos(Connection conexionGenerada)
    {
        List<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();
        
        // Declaramos el Statement(declaraciónSQL) y el ResultSet(resultadoSQL) y los inicializamos como null
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		
		// También declaramos un objeto de nuestra clase ConexionPostgreSQL y lo inicializamos con su constructor vacío
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		// creamos la conexión a nuestra BBDD con el objeto de la clase Connection, y utilizando el método de generaConexion() de nuestra clase ConexionPostgreSQL, el cual nos pedirá los parámetros de conexión...
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				// Definimos la consulta y la ejecutamos
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"alumnos\"");
				
				// Recogemos en una lista los datos resultantes de llamar a nuestra consulta 
				listaAlumnos = PostgreSQLtoDTOs.ConsultaSelectAlumnosToDTO(resultadoConsulta);

				// Cerramos el resultado y la declaración de la consulta
				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    // Cerramos la conexión con la BBDD
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
		return listaAlumnos;
    }
    
    public static List<AsignaturaDTO> ConsultaSelectAsignaturas(Connection conexionGenerada)
    {
        List<AsignaturaDTO> listaAsignaturas = new ArrayList<AsignaturaDTO>();
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"asignaturas\"");
				listaAsignaturas = PostgreSQLtoDTOs.ConsultaSelectAsignaturasToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
		return listaAsignaturas;
    }
    
    public static List<ProfesorDTO> ConsultaSelectProfesores(Connection conexionGenerada)
    {
        List<ProfesorDTO> listaAlumnos = new ArrayList<ProfesorDTO>();
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"profesores\"");
				listaAlumnos = PostgreSQLtoDTOs.ConsultaSelectProfesoresToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
		return listaAlumnos;
    }
    
    public static List<RelAlumAsigDTO> ConsultaSelectRelAlumAsig(Connection conexionGenerada)
    {
        List<RelAlumAsigDTO> listaRelAlumAsig = new ArrayList<RelAlumAsigDTO>();
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"rel_alum_asig\"");
				listaRelAlumAsig = PostgreSQLtoDTOs.ConsultaSelectRelAlumAsigToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
		return listaRelAlumAsig;
    }
    
    public static List<RelProfAsigDTO> ConsultaSelectRelProfAsig(Connection conexionGenerada)
    {
        List<RelProfAsigDTO> listaRelProfAsig = new ArrayList<RelProfAsigDTO>();
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"rel_prof_asig\"");
				listaRelProfAsig = PostgreSQLtoDTOs.ConsultaSelectRelProfAsigToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
		return listaRelProfAsig;
    }
    
    /*************************************** CONSULTAS INSERTS ******************************************/
    public static void ConsultaInsertAlumnos(Connection conexionGenerada)
    {
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Realiza consulta a PostgreSQL");
		
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("INSERT INTO \"EjemploInicial\".\"alumnos\" (alumno_id, alumno_nombre, alumno_apellidos, alumno_email) VALUES (DEFAULT, 'ivan', 'iglesias', 'ivan@gmail.com')");

				System.out.println("\n[INFORMACIÓN-Consultas-ConsultasPostgreSQL.java] Cierre del resultado, de la declaración, y de la conexión");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-Consultas-ConsultasPostgreSQL.java] Error generando la declaracionSQL: " + e);
			}
		}
		
    }
    
    
}
