import java.util.*;

public class ej_7 {

    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        System.out.println("ingrese el inicio");
        int a = valores.nextInt();
        System.out.println("ingrese el final");
        int b = valores.nextInt();

        FizzBuzzFuncion(a, b);
    }

    public static int FizzBuzzFuncion(int a, int b) {
        ArrayList<String> cadena = new ArrayList<String>();
        for (int i = a + 1; i <= b - 1; i++) {
            if (i % 2 == 0 & i % 3 == 0)
                cadena.add("FizzBuzz");
            else if (i % 2 == 0)
                cadena.add("Fizz");
            else if (i % 3 == 0)
                cadena.add("Buzz");
            else if (i % 2 != 0 & i % 3 != 0)
                cadena.add(String.valueOf(i));
        }
        String aa= String.valueOf(a);
        cadena.add(0, aa);
        Iterator<String> recorrer = cadena.iterator();
        while (recorrer.hasNext()) {
            String elemento = recorrer.next();
            System.out.print(elemento + " / ");

        }
        return 0;
    }
}

