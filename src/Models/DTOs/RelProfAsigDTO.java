package Models.DTOs;

public class RelProfAsigDTO {

	// ATRIBUTOS
	int asignatura_id;
	String asignatura_nombre;
	int profesor_id;
	String profesor_nombre;
	
	
	// CONSTRUCTOR
	public RelProfAsigDTO(int asignatura_id, String asignatura_nombre, int profesor_id, String profesor_nombre) {
		super();
		this.asignatura_id = asignatura_id;
		this.asignatura_nombre = asignatura_nombre;
		this.profesor_id = profesor_id;
		this.profesor_nombre = profesor_nombre;
	}


	// GETTERS Y SETTERS
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


	public int getProfesor_id() {
		return profesor_id;
	}


	public void setProfesor_id(int profesor_id) {
		this.profesor_id = profesor_id;
	}


	public String getProfesor_nombre() {
		return profesor_nombre;
	}


	public void setProfesor_nombre(String profesor_nombre) {
		this.profesor_nombre = profesor_nombre;
	}
	
	
	// ToString
    @Override
    public String toString() {
    	return 
    		"\t" + profesor_id + 
    		"\t\t" + profesor_nombre +
    		"\t\t" + asignatura_id +
    		"\t\t" + asignatura_nombre;
    }
}
