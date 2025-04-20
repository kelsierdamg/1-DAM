package clases_abstractas;

import java.time.LocalDate;

public class MainEjercicio1 {
	public static void main(String[] args) {
		Lactante lactante = new Lactante(TipoLactancia.Mixta);
		lactante.setNombre("Celia");
		lactante.setFechaNacimiento(LocalDate.of(2024, 5, 18));
		System.out.println("Nombre: "+lactante.getNombre());
		System.out.println("Edad: "+lactante.calcularEdad()+" años");
		System.out.println("COmer: "+lactante.comer());
		System.out.println("Dormir: "+lactante.dormir());
		System.out.println("Hablar: "+lactante.hablar());
		
		Infantil infantil = new Infantil("Guardería Bolaños", true);
		infantil.setNombre("Lucas");
		infantil.setFechaNacimiento(LocalDate.of(2022, 3, 10));
		System.out.println("\nNombre: " + infantil.getNombre());
        System.out.println("Edad: " + infantil.calcularEdad() + " años");
        System.out.println("Comer: " + infantil.comer());
        System.out.println("Dormir: " + infantil.dormir());
        System.out.println("Hablar: " + infantil.hablar());
        System.out.println(infantil.estudioEn());
        
        Escolar escolar = new Escolar("Colegio Pinocho");
        escolar.setNombre("Jorge");
        escolar.setFechaNacimiento(LocalDate.of(2017, 9, 6));
        escolar.setDeportes(new String[] {"Fútbol", "Natación", "Tenis"});
        System.out.println("\nNombre: " + escolar.getNombre());
        System.out.println("Edad: " + escolar.calcularEdad() + " años");
        System.out.println("Comer: " + escolar.comer());
        System.out.println("Dormir: " + escolar.dormir());
        System.out.println("Hablar: " + escolar.hablar());
        System.out.println(escolar.estudioEn());
        System.out.println(escolar.deportes());
	}
}
