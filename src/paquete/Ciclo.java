package paquete;
// Generated 1 feb 2024 13:00:39 by Hibernate Tools 6.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Ciclo generated by hbm2java
 */
public class Ciclo implements java.io.Serializable {

	private String abreviatura;
	private String nombreCompleto;
	private Integer cursos;
	private Set notas = new HashSet(0);
	private Set modulos = new HashSet(0);
	private Set matriculas = new HashSet(0);

	public Ciclo() {
	}

	public Ciclo(String abreviatura, String nombreCompleto, Integer cursos, Set notas, Set modulos, Set matriculas) {
		this.abreviatura = abreviatura;
		this.nombreCompleto = nombreCompleto;
		this.cursos = cursos;
		this.notas = notas;
		this.modulos = modulos;
		this.matriculas = matriculas;
	}

	public String getAbreviatura() {
		return this.abreviatura;
	}

	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getCursos() {
		return this.cursos;
	}

	public void setCursos(Integer cursos) {
		this.cursos = cursos;
	}

	public Set getNotas() {
		return this.notas;
	}

	public void setNotas(Set notas) {
		this.notas = notas;
	}

	public Set getModulos() {
		return this.modulos;
	}

	public void setModulos(Set modulos) {
		this.modulos = modulos;
	}

	public Set getMatriculas() {
		return this.matriculas;
	}

	public void setMatriculas(Set matriculas) {
		this.matriculas = matriculas;
	}

}
