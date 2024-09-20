package main;
import hibernate.Predeterminados;

public class Main {

	public static void main(String[] args) {
		Predeterminados p= new Predeterminados();
		System.out.println(p.buscarProfesor("12345678S").getApellidos());

	}

}
