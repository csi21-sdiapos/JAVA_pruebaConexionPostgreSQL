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
    public static List<AlumnoDTO> ConsultaSelectAlumnos(Connection conexionGenerada)
    {
        List<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Realiza consulta a PostgreSQL");
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"alumnos\"");
				listaAlumnos = PostgreSQLtoDTOs.ConsultaSelectAlumnosToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Cierre conexión, declaración y resultado");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
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
		
		System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Realiza consulta a PostgreSQL");
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"asignaturas\"");
				listaAsignaturas = PostgreSQLtoDTOs.ConsultaSelectAsignaturasToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Cierre conexión, declaración y resultado");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
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
		
		System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Realiza consulta a PostgreSQL");
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"profesores\"");
				listaAlumnos = PostgreSQLtoDTOs.ConsultaSelectProfesoresToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Cierre conexión, declaración y resultado");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
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
		
		System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Realiza consulta a PostgreSQL");
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"rel_alum_asig\"");
				listaRelAlumAsig = PostgreSQLtoDTOs.ConsultaSelectRelAlumAsigToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Cierre conexión, declaración y resultado");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
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
		
		System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Realiza consulta a PostgreSQL");
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("SELECT * FROM \"EjemploInicial\".\"rel_prof_asig\"");
				listaRelProfAsig = PostgreSQLtoDTOs.ConsultaSelectRelProfAsigToDTO(resultadoConsulta);

				System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Cierre conexión, declaración y resultado");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			}
		}
		
		return listaRelProfAsig;
    }
    
    /************************************ INSERTS ******************************************/
    public static void ConsultaInsertAlumnos(Connection conexionGenerada)
    {
        Statement declaracionSQL = null;
		ResultSet resultadoConsulta = null;
		ConexionPostgreSQL conexionPostgresql = new ConexionPostgreSQL();
		
		conexionGenerada = conexionPostgresql.generaConexion(VariablesConexionPostgreSQL.getHost(),VariablesConexionPostgreSQL.getPort(),VariablesConexionPostgreSQL.getDb(),VariablesConexionPostgreSQL.getUser(),VariablesConexionPostgreSQL.getPass());
		
		System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Realiza consulta a PostgreSQL");
		if(conexionGenerada != null) {
			
			try {
				declaracionSQL = conexionGenerada.createStatement();
				resultadoConsulta = declaracionSQL.executeQuery("INSERT INTO \"EjemploInicial\".\"alumnos\" (alumno_id, alumno_nombre, alumno_apellidos, alumno_email) VALUES (DEFAULT, 'ivan', 'iglesias', 'ivan@gmail.com')");

				System.out.println("\n[INFORMACIÓN-conexionPostgresql-main] Cierre conexión, declaración y resultado");
				
			    resultadoConsulta.close();
			    declaracionSQL.close();
			    conexionGenerada.close();
				
			} catch (SQLException e) {
				System.out.println("\n[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
			}
		}
		
    }
    
    
}
