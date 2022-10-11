package Models.DTOs;

public class ProfesorDTO {

	// ATRIBUTOS
	public int profesor_id;
	public String profesor_nombre;
	public String profesor_apellidos;
	public String profesor_email;
	
	
	// CONSTRUCTORES
	public ProfesorDTO(int profesor_id, String profesor_nombre, String profesor_apellidos, String profesor_email) {
		super();
		this.profesor_id = profesor_id;
		this.profesor_nombre = profesor_nombre;
		this.profesor_apellidos = profesor_apellidos;
		this.profesor_email = profesor_email;
	}
	
	
	// GETTERS Y SETTTERS
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


	public String getProfesor_apellidos() {
		return profesor_apellidos;
	}


	public void setProfesor_apellidos(String profesor_apellidos) {
		this.profesor_apellidos = profesor_apellidos;
	}


	public String getProfesor_email() {
		return profesor_email;
	}


	public void setProfesor_email(String profesor_email) {
		this.profesor_email = profesor_email;
	}
	
	// ToString
    @Override
    public String toString() {
    	return 
    		"\t" + profesor_id + 
    		"\t" + profesor_nombre +
    		"\t" + profesor_apellidos +
    		"\t" + profesor_email;
    }
}
