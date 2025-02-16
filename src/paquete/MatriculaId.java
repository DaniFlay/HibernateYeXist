package paquete;
// Generated 1 feb 2024 13:00:39 by Hibernate Tools 6.3.1.Final

/**
 * MatriculaId generated by hbm2java
 */
public class MatriculaId implements java.io.Serializable {

	private int cursoAcademico;
	private String dniEstudiante;
	private String nombreCiclo;
	private String nombreModulo;

	public MatriculaId() {
	}

	public MatriculaId(int cursoAcademico, String dniEstudiante, String nombreCiclo, String nombreModulo) {
		this.cursoAcademico = cursoAcademico;
		this.dniEstudiante = dniEstudiante;
		this.nombreCiclo = nombreCiclo;
		this.nombreModulo = nombreModulo;
	}

	public int getCursoAcademico() {
		return this.cursoAcademico;
	}

	public void setCursoAcademico(int cursoAcademico) {
		this.cursoAcademico = cursoAcademico;
	}

	public String getDniEstudiante() {
		return this.dniEstudiante;
	}

	public void setDniEstudiante(String dniEstudiante) {
		this.dniEstudiante = dniEstudiante;
	}

	public String getNombreCiclo() {
		return this.nombreCiclo;
	}

	public void setNombreCiclo(String nombreCiclo) {
		this.nombreCiclo = nombreCiclo;
	}

	public String getNombreModulo() {
		return this.nombreModulo;
	}

	public void setNombreModulo(String nombreModulo) {
		this.nombreModulo = nombreModulo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MatriculaId))
			return false;
		MatriculaId castOther = (MatriculaId) other;

		return (this.getCursoAcademico() == castOther.getCursoAcademico())
				&& ((this.getDniEstudiante() == castOther.getDniEstudiante())
						|| (this.getDniEstudiante() != null && castOther.getDniEstudiante() != null
								&& this.getDniEstudiante().equals(castOther.getDniEstudiante())))
				&& ((this.getNombreCiclo() == castOther.getNombreCiclo())
						|| (this.getNombreCiclo() != null && castOther.getNombreCiclo() != null
								&& this.getNombreCiclo().equals(castOther.getNombreCiclo())))
				&& ((this.getNombreModulo() == castOther.getNombreModulo())
						|| (this.getNombreModulo() != null && castOther.getNombreModulo() != null
								&& this.getNombreModulo().equals(castOther.getNombreModulo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCursoAcademico();
		result = 37 * result + (getDniEstudiante() == null ? 0 : this.getDniEstudiante().hashCode());
		result = 37 * result + (getNombreCiclo() == null ? 0 : this.getNombreCiclo().hashCode());
		result = 37 * result + (getNombreModulo() == null ? 0 : this.getNombreModulo().hashCode());
		return result;
	}

}
