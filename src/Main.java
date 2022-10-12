import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import Models.Consultas.ConsultasPostgreSQL;
import Models.DTOs.AlumnoDTO;
import Models.DTOs.AsignaturaDTO;
import Models.DTOs.ProfesorDTO;
import Models.DTOs.RelAlumAsigDTO;
import Models.DTOs.RelProfAsigDTO;

public class Main { // esta clase Main.java sería el equivalente al CONTROLADOR en ASP.NET (HomeController.cs) !!

	public static void main(String[] args) {
		
		// Lo primero de todo será declarar un objeto de la clase Connection de java.sql. e inicializarlo como nulo (ya que esta clase no tiene un constructor vacío y no se puede dejar sólo declarado)
		Connection conexionGenerada = null; // este objeto será el que iremos pasando como parámetro a los métodos de consultas
		
		/****************** Obtener y mostrar la tabla alumnos de la BBDD *******************/
		
        List<AlumnoDTO> listaAlumnos = new ArrayList<AlumnoDTO>();

        listaAlumnos = ConsultasPostgreSQL.ConsultaSelectAlumnos(conexionGenerada);

        System.out.println("\n\n\tID\tNombre\tApellidos\tEmail");
        System.out.println("\t-----------------------------------------------");

        for(AlumnoDTO alumno : listaAlumnos) {
        	System.out.println(alumno.toString());
        }
        
        /****************** Obtener y mostrar la tabla asignaturas de la BBDD *******************/
		
        List<AsignaturaDTO> listaAsignaturas = new ArrayList<AsignaturaDTO>();

        listaAsignaturas = ConsultasPostgreSQL.ConsultaSelectAsignaturas(conexionGenerada);

        System.out.println("\n\n\tID Asig.\tNombre Asig.");
        System.out.println("\t-----------------------------------------------");

        for(AsignaturaDTO asignatura : listaAsignaturas) {
        	System.out.println(asignatura.toString());
        }
        
        /****************** Obtener y mostrar la tabla profesores de la BBDD *******************/
        
        List<ProfesorDTO> listaProfesores = new ArrayList<ProfesorDTO>();

        listaProfesores = ConsultasPostgreSQL.ConsultaSelectProfesores(conexionGenerada);

        System.out.println("\n\n\tID\tNombre\t\tApellidos\tEmail");
        System.out.println("\t--------------------------------------------------");

        for(ProfesorDTO profesor : listaProfesores) {
        	System.out.println(profesor.toString());
        }
        
        /****************** Obtener y mostrar la tabla RelAlumAsig de la BBDD *******************/
        
        List<RelAlumAsigDTO> listaRelAlumAsig = new ArrayList<RelAlumAsigDTO>();

        listaRelAlumAsig = ConsultasPostgreSQL.ConsultaSelectRelAlumAsig(conexionGenerada);

        System.out.println("\n\n\tID Alum.\tNombre Alum.\tID Asig.\tNombre Asig.");
        System.out.println("\t----------------------------------------------------------");

        for(RelAlumAsigDTO relAlumAsig : listaRelAlumAsig) {
        	System.out.println(relAlumAsig.toString());
        }
        
        /****************** Obtener y mostrar la tabla RelAlumAsig de la BBDD *******************/
        
        List<RelProfAsigDTO> listaRelProfAsig = new ArrayList<RelProfAsigDTO>();

        listaRelProfAsig = ConsultasPostgreSQL.ConsultaSelectRelProfAsig(conexionGenerada);

        System.out.println("\n\n\tID Profesor.\tNombre Profesor.\tID Asig.\tNombre Asig.");
        System.out.println("\t-----------------------------------------------------------------");

        for(RelProfAsigDTO relProfAsig : listaRelProfAsig) {
        	System.out.println(relProfAsig.toString());
        }
        
        /************************* Hacemos un insert de un alumno *********************/
        
        ConsultasPostgreSQL.ConsultaInsertAlumnos(conexionGenerada);
        
        /****************** Volvemos a obtener y mostrar la tabla alumnos de la BBDD *******************/
		
        listaAlumnos = new ArrayList<AlumnoDTO>();

        listaAlumnos = ConsultasPostgreSQL.ConsultaSelectAlumnos(conexionGenerada);

        System.out.println("\n\n\tID\tNombre\tApellidos\tEmail");
        System.out.println("\t-----------------------------------------------");

        for(AlumnoDTO alumno : listaAlumnos) {
        	System.out.println(alumno.toString());
        }
        
	}

}
