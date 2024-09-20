package hibernate;

import java.util.ArrayList;
import java.util.Comparator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import paquete.Alumno;
import paquete.Ciclo;
import paquete.HibernateUtil;
import paquete.Matricula;
import paquete.MatriculaId;
import paquete.Modulo;
import paquete.Nota;
import paquete.NotaId;
import paquete.Profesor;


public class Predeterminados {
	public Alumno buscarAlumno(String dni) {
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Alumno alumno =(Alumno) session.get(Alumno.class, dni);
		transaction.commit();
		return alumno;
	}
	public Ciclo buscarCiclo(String abreviatura) {
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Ciclo ciclo =(Ciclo) session.get(Ciclo.class, abreviatura);
		transaction.commit();
		return ciclo;
	}
	public Profesor buscarProfesor(String dni) {
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session= sessionFactory.openSession();
		
		Profesor profesor = null;
		try {
			Transaction transaction= session.beginTransaction();
			profesor = (Profesor) session.get(Profesor.class, dni);
			transaction.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return profesor;
	}
	public Modulo buscarModulo(String nombre) {
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		Modulo modulo =(Modulo) session.get(Modulo.class, nombre);
		transaction.commit();
		return modulo;
	}
	public Matricula buscarMatricula(String nombreModulo, String nombreCiclo,String dniEstudiante,int cursoAcademico) {
		Matricula matricula = null;
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		MatriculaId id= new MatriculaId(cursoAcademico,dniEstudiante,nombreModulo,nombreCiclo);
		matricula= (Matricula) session.get(Matricula.class, id);
		transaction.commit();
		return matricula;
		
	}
	public Nota buscarNota(int cursoAcademico, String dniEstudiante, String nombreCiclo, String nombreModulo, String tipoNota) {
		Nota nota = null;
		SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
		Session session= sessionFactory.openSession();
		Transaction transaction= session.beginTransaction();
		NotaId id= new NotaId(cursoAcademico,dniEstudiante,nombreCiclo,nombreModulo, tipoNota);
		nota= (Nota) session.get(Nota.class, id);
		transaction.commit();
		return nota;
		
	}
	public void profesorHoras(String dni) {
		Profesor p= buscarProfesor(dni);
		ArrayList<Modulo> modulos= new ArrayList<Modulo>();
		modulos.addAll(p.getModulos());
		ComparatorHoras ch= new ComparatorHoras();
		modulos.sort(ch);
		System.out.println(p.toString());
		for(Modulo m:modulos) {
			System.out.println(m.toString());
		}
	}
	class ComparatorHoras implements Comparator<Modulo>{

		@Override
		public int compare(Modulo o1, Modulo o2) {
			return o1.getHorasSemanales().compareTo(o2.getHorasSemanales());
		}
		
	}
}
