package paquete;
// Generated 1 feb 2024 13:00:39 by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Alumno generated by hbm2java
 */
public class Alumno implements java.io.Serializable {

	private String dni;
	private String nombre;
	private String apellidos;
	private Integer edad;
	private Set notas = new HashSet(0);
	private Set matriculas = new HashSet(0);

	public Alumno() {
	}

	public Alumno(String dni, String nombre, String apellidos, Integer edad, Set notas, Set matriculas) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.notas = notas;
		this.matriculas = matriculas;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Set getNotas() {
		return this.notas;
	}

	public void setNotas(Set notas) {
		this.notas = notas;
	}

	public Set getMatriculas() {
		return this.matriculas;
	}

	public void setMatriculas(Set matriculas) {
		this.matriculas = matriculas;
	}

}