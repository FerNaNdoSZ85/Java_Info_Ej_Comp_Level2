import java.util.*;

public class ej_3 {
    public static void main(String[] args) {
        ArrayList<String> maso = new ArrayList<String>(12);
    Scanner carta = new Scanner(System.in);

    for (int i = 0; i <= 12; i++) {
        String figura = carta.nextLine();
        maso.add(i, figura + " de corazones");
    }
    System.out.println("IMPRIMO MAZO DE CORAZONES COMO EJEMPLO, ORDENADO");
    System.out.println(maso);

    System.out.println("IMPRIMO MAZO DE CORAZONES EN REVERSA");
    Collections.reverse(maso);
    System.out.println(maso);

    System.out.println("IMPRIMO MAZO DE CORAZONES EN FORMA ALEATORIA");
    Collections.shuffle(maso);
    System.out.println(maso);

    }
}
