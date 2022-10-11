package Models.DTOs;

public class AsignaturaDTO {

	// ATRIBUTOS
	int asignatura_id;
	String asignatura_nombre;
	
	
	// CONSTRUCTORES
	public AsignaturaDTO(int asignatura_id, String asignatura_nombre) {
		super();
		this.asignatura_id = asignatura_id;
		this.asignatura_nombre = asignatura_nombre;
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
	
	
	// ToString
    @Override
    public String toString() {
    	return 
    		"\t" + asignatura_id + 
    		"\t\t" + asignatura_nombre;
    }
}
