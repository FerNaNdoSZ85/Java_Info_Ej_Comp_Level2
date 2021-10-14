import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ej_1 {
    
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        Scanner nombresCiudades = new Scanner(System.in);
        int n = 2;
        
        for (int i = 0; i <= n; i++) {
            String ciudad = nombresCiudades.nextLine();
            ciudades.add(ciudad);
        }
        for (int j = 0; j <= n; j++) {

            System.out.println("#"+(j+1)+" - "+ciudades.get(j));
        }
    }
}