import java.util.*;

public class ej_6 {

    public class empleados {
        String nombre, dni;
        int horasTrabajo, valorHora;

        empleados(String nombre, String dni, int horasTrabajo, int valorHora) {
            this.nombre = nombre;
            this.dni = dni;
            this.horasTrabajo = horasTrabajo;
            this.valorHora = valorHora;
        }
    }

    public static void main(String[] args) {

        HashSet<empleados> listaEmpleados = new HashSet<>();

        empleados persona1 = new empleados("Fernando", "31396792", 6, 45);
        empleados persona2 = new empleados("Andres", "45123210", 8, 25);
        empleados persona3 = new empleados("javier", "58115406", 10, 65);

        listaEmpleados.add(persona1);
        listaEmpleados.add(persona2);
        listaEmpleados.add(persona3);

        Map<String, Integer> sueldo = new HashMap<String, Integer>();

        sueldo.put(persona1.dni, (persona1.horasTrabajo * persona1.valorHora));
        sueldo.put(persona2.dni, (persona2.horasTrabajo * persona2.valorHora));
        sueldo.put(persona3.dni, (persona3.horasTrabajo * persona2.valorHora));

        for (String key : sueldo.keySet()) {
            System.out.println("DNI: " + key + "Sueldo a Cobrar: " + sueldo.get(key));
        }
    }
}
