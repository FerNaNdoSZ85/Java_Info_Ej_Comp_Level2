import java.util.*;

public class ej_4 {

    public static void main(String[] args) {
        ArrayList<String> listaAlumno = new ArrayList<String>(12);
        List<String> curso1 = new ArrayList<String>(4);
        List<String> curso2 = new ArrayList<String>(4);
        List<String> curso3 = new ArrayList<String>(4);
        Scanner alumno = new Scanner(System.in);

        System.out.println("Ingrese los nombres de los alumnos");

        for (int i = 0; i <= 11; i++) {
            String curso = alumno.nextLine();
            listaAlumno.add(i, curso);
        }
        curso1 = listaAlumno.subList(0, 4);
        curso2 = listaAlumno.subList(4, 8);
        curso3 = listaAlumno.subList(8, 12);

        System.out.println("alumnos en el curso de Programación: " + curso1);
        System.out.println("alumnos en el curso de Matemáticas: "+curso2);
        System.out.println("alumnos en el curso de Ciencia de datos: "+curso3);
        }
    }

