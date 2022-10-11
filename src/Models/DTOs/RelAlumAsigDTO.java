package Models.DTOs;

public class RelAlumAsigDTO {

	// ATRIBUTOS
	int alumno_id;
	String alumno_nombre;
	int asignatura_id;
	String asignatura_nombre;
	
	
	// CONSTRUCTORES
	public RelAlumAsigDTO(int alumno_id, String alumno_nombre, int asignatura_id, String asignatura_nombre) {
		super();
		this.alumno_id = alumno_id;
		this.alumno_nombre = alumno_nombre;
		this.asignatura_id = asignatura_id;
		this.asignatura_nombre = asignatura_nombre;
	}


	// GETTERS Y SETTERS
	public int getAlumno_id() {
		return alumno_id;
	}


	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}


	public String getAlumno_nombre() {
		return alumno_nombre;
	}


	public void setAlumno_nombre(String alumno_nombre) {
		this.alumno_nombre = alumno_nombre;
	}


	public int getAsignatura_id() {
		return asignatura_id;
	}


	public void setAsignatura_id(int asignatura_id) {
		this.asignatura_id = asignatura_id;
	}


	public String getAsignatura_nombre() {
		return asignatura_nombre;
	}


	public void setAsignatura_nombre(String asignatura_nombre) {
		this.asignatura_nombre = asignatura_nombre;
	}
	
	
	// ToString
    @Override
    public String toString() {
    	return 
    		"\t" + alumno_id + 
    		"\t\t" + alumno_nombre +
    		"\t\t" + asignatura_id +
    		"\t\t" + asignatura_nombre;
    }
}
