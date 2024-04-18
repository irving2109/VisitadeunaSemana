import java.util.Scanner;

public class VisitadeunaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese el nombre del visitante:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad del visitante:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el género del visitante (M/F):");
        char genero = scanner.next().charAt(0);

        System.out.println("¿Es residente? (true/false):");
        boolean esResidente = scanner.nextBoolean();


        System.out.println("Ingrese la cantidad de visitas que realizó el visitante durante una semana:");
        int cantidadVisitas = scanner.nextInt();


        System.out.println("Ingrese la duración de cada visita en minutos:");
        int[] duracionVisitas = new int[cantidadVisitas];
        for (int i = 0; i < cantidadVisitas; i++) {
            System.out.println("Duración de la visita " + (i + 1) + ":");
            duracionVisitas[i] = scanner.nextInt();
        }


        int totalVisitas = cantidadVisitas;


        int totalDuracion = 0;
        for (int duracion : duracionVisitas) {
            totalDuracion += duracion;
        }
        double promedioDuracion = totalDuracion / (double) cantidadVisitas;


        String mensajeEdad;
        if (edad >= 18) {
            mensajeEdad = "El visitante es mayor de edad.";
        } else {
            mensajeEdad = "El visitante es menor de edad.";
        }


        System.out.println("Resultados:");
        System.out.println("Cantidad total de visitas: " + totalVisitas);
        System.out.println("Tiempo promedio de estadía de todas las visitas: " + promedioDuracion + " minutos");
        System.out.println(mensajeEdad);


        scanner.close();
    }
}
