package Models.ToDTOs;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Models.DTOs.AlumnoDTO;
import Models.DTOs.AsignaturaDTO;
import Models.DTOs.ProfesorDTO;
import Models.DTOs.RelAlumAsigDTO;
import Models.DTOs.RelProfAsigDTO;

public class PostgreSQLtoDTOs {

	public static List<AlumnoDTO> ConsultaSelectAlumnosToDTO(ResultSet resultadoConsulta)
    {
        List<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();
		
        try {
        	while ( resultadoConsulta.next() ) {
    			listaAlumnos.add
    				(
    					new AlumnoDTO
    						(
    								resultadoConsulta.getInt("alumno_id"),
    								resultadoConsulta.getString("alumno_nombre"),
    						        resultadoConsulta.getString("alumno_apellidos"),
    						        resultadoConsulta.getString("alumno_email")
    						)					
    				);
    	    }

        } catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		}
        
        return listaAlumnos;
    }
	
	public static List<AsignaturaDTO> ConsultaSelectAsignaturasToDTO(ResultSet resultadoConsulta)
    {
        List<AsignaturaDTO> listaAsignaturas = new ArrayList<AsignaturaDTO>();
		
        try {
        	while ( resultadoConsulta.next() ) {
    			listaAsignaturas.add
    				(
    					new AsignaturaDTO
    						(
    								resultadoConsulta.getInt("asignatura_id"),
    								resultadoConsulta.getString("asignatura_nombre")
    						)					
    				);
    	    }

        } catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		}
        
        return listaAsignaturas;
    }
	
	public static List<ProfesorDTO> ConsultaSelectProfesoresToDTO(ResultSet resultadoConsulta)
    {
        List<ProfesorDTO> listaProfesores = new ArrayList<ProfesorDTO>();
		
        try {
        	while ( resultadoConsulta.next() ) {
    			listaProfesores.add
    				(
    					new ProfesorDTO
    						(
    								resultadoConsulta.getInt("profesor_id"),
    								resultadoConsulta.getString("profesor_name"),
    						        resultadoConsulta.getString("profesor_apellidos"),
    						        resultadoConsulta.getString("profesor_email")
    						)					
    				);
    	    }

        } catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		}
        
        return listaProfesores;
    }
	
	public static List<RelAlumAsigDTO> ConsultaSelectRelAlumAsigToDTO(ResultSet resultadoConsulta)
    {
        List<RelAlumAsigDTO> listaRelAlumAsig = new ArrayList<RelAlumAsigDTO>();
		
        try {
        	while ( resultadoConsulta.next() ) {
    			listaRelAlumAsig.add
    				(
    					new RelAlumAsigDTO
    						(
    								resultadoConsulta.getInt("alumno_id"),
    								resultadoConsulta.getString("alumno_nombre"),
    						        resultadoConsulta.getInt("asignatura_id"),
    						        resultadoConsulta.getString("asignatura_nombre")
    						)					
    				);
    	    }

        } catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		}
        
        return listaRelAlumAsig;
    }
	
	public static List<RelProfAsigDTO> ConsultaSelectRelProfAsigToDTO(ResultSet resultadoConsulta)
    {
        List<RelProfAsigDTO> listaRelProfAsig = new ArrayList<RelProfAsigDTO>();
		
        try {
        	while ( resultadoConsulta.next() ) {
    			listaRelProfAsig.add
    				(
    					new RelProfAsigDTO
    						(
    								resultadoConsulta.getInt("asignatura_id"),
    								resultadoConsulta.getString("asignatura_nombre"),
    						        resultadoConsulta.getInt("profesor_id"),
    						        resultadoConsulta.getString("profesor_nombre")
    						)					
    				);
    	    }

        } catch (Exception e) {
			// TODO: handle exception
			System.out.println("[ERROR-conexionPostgresql-main] Error generando la declaracionSQL: " + e);
		}
        
        return listaRelProfAsig;
    }
	
}
