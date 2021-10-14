import java.util.*;

public class ej_5 {

    public static void main(String[] args) {
        List<Integer> hTrabajadas = Arrays.asList(6,7,8,4,5);
        List<Integer> costoHora = Arrays.asList(350, 345, 550, 600, 320);
        List<Integer> totalpago = new ArrayList<Integer>(5);
        int pago = 0;
        int total = 0;
        
        for (int i = 0; i <= hTrabajadas.size() - 1; i++) {
            pago = hTrabajadas.get(i) * costoHora.get(i);
            totalpago.add(pago);
        }
        for (int j = 0; j < costoHora.size(); j++) {
            total = total + totalpago.get(j);
        }
        System.out.println(totalpago);
        System.out.println("Total Final: $" + total);
    }
}