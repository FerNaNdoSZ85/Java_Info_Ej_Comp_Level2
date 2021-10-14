import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ej_2 {

    public static void main(String[] args) {
        List<Integer> enteros = new ArrayList<Integer>(4);
        List<Integer> enteros2 = new ArrayList<Integer>(4);
        Scanner valores = new Scanner(System.in);

        for (int i = 0; i <= 4; i++)
        {
            int valor = valores.nextInt();
            enteros.add(valor);
            enteros2.add(valor);
        }
        int v1 = valores.nextInt();
        enteros.add(0, v1);
        int v2 = valores.nextInt();
        enteros.add(v2);

        for (int j = 0; j <= 4; j++) {
            System.out.print(enteros2.get(j)+" ");
        }
            System.out.println("Longitud del Arreglo es: " + enteros2.size());

        for (int j = 0; j <= enteros.size()-1; j++) {
            System.out.print(enteros.get(j)+" ");
        }
        System.out.println("Longitud del Arreglo es: " + enteros.size());
        
    }
}
