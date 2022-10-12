import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import Models.Consultas.ConsultasPostgreSQL;
import Models.DTOs.AlumnoDTO;
import Models.DTOs.AsignaturaDTO;
import Models.DTOs.ProfesorDTO;
import Models.DTOs.RelAlumAsigDTO;
import Models.DTOs.RelProfAsigDTO;

public class Main { // esta clase sería el CONTROLADOR !!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		/****************** Obtener y mostrar la tabla alumnos de la BBDD *******************/
		
        Connection conexionGenerada = null;
        List<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();

        listaAlumnos = ConsultasPostgreSQL.ConsultaSelectAlumnos(conexionGenerada);

        System.out.println("\n\n\tID\tNombre\tApellidos\tEmail");
        System.out.println("\t-----------------------------------------------");

        for(AlumnoDTO alumno : listaAlumnos) {
        	System.out.println(alumno.toString());
        }
        
        /****************** Obtener y mostrar la tabla asignaturas de la BBDD *******************/
		
        conexionGenerada = null;
        List<AsignaturaDTO> listaAsignaturas = new ArrayList<AsignaturaDTO>();

        listaAsignaturas = ConsultasPostgreSQL.ConsultaSelectAsignaturas(conexionGenerada);

        System.out.println("\n\n\tID Asig.\tNombre Asig.");
        System.out.println("\t-----------------------------------------------");

        for(AsignaturaDTO asignatura : listaAsignaturas) {
        	System.out.println(asignatura.toString());
        }
        
        /****************** Obtener y mostrar la tabla profesores de la BBDD *******************/
        
        conexionGenerada = null;
        List<ProfesorDTO> listaProfesores = new ArrayList<ProfesorDTO>();

        listaProfesores = ConsultasPostgreSQL.ConsultaSelectProfesores(conexionGenerada);

        System.out.println("\n\n\tID\tNombre\t\tApellidos\tEmail");
        System.out.println("\t--------------------------------------------------");

        for(ProfesorDTO profesor : listaProfesores) {
        	System.out.println(profesor.toString());
        }
        
        /****************** Obtener y mostrar la tabla RelAlumAsig de la BBDD *******************/
        
        conexionGenerada = null;
        List<RelAlumAsigDTO> listaRelAlumAsig = new ArrayList<RelAlumAsigDTO>();

        listaRelAlumAsig = ConsultasPostgreSQL.ConsultaSelectRelAlumAsig(conexionGenerada);

        System.out.println("\n\n\tID Alum.\tNombre Alum.\tID Asig.\tNombre Asig.");
        System.out.println("\t----------------------------------------------------------");

        for(RelAlumAsigDTO relAlumAsig : listaRelAlumAsig) {
        	System.out.println(relAlumAsig.toString());
        }
        
        /****************** Obtener y mostrar la tabla RelAlumAsig de la BBDD *******************/
        
        conexionGenerada = null;
        List<RelProfAsigDTO> listaRelProfAsig = new ArrayList<RelProfAsigDTO>();

        listaRelProfAsig = ConsultasPostgreSQL.ConsultaSelectRelProfAsig(conexionGenerada);

        System.out.println("\n\n\tID Profesor.\tNombre Profesor.\tID Asig.\tNombre Asig.");
        System.out.println("\t-----------------------------------------------------------------");

        for(RelProfAsigDTO relProfAsig : listaRelProfAsig) {
        	System.out.println(relProfAsig.toString());
        }
        
        /************************* Hacemos un insert de un alumno *********************/
        
        conexionGenerada = null;
        ConsultasPostgreSQL.ConsultaInsertAlumnos(conexionGenerada);
        
        /****************** Volvemos a obtener y mostrar la tabla alumnos de la BBDD *******************/
		
        conexionGenerada = null;
        listaAlumnos = new ArrayList<AlumnoDTO>();

        listaAlumnos = ConsultasPostgreSQL.ConsultaSelectAlumnos(conexionGenerada);

        System.out.println("\n\n\tID\tNombre\tApellidos\tEmail");
        System.out.println("\t-----------------------------------------------");

        for(AlumnoDTO alumno : listaAlumnos) {
        	System.out.println(alumno.toString());
        }
        
	}

}
