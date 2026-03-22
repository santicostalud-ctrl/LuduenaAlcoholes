import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVUtils {
    static ArrayList<String> listaAlcoholes = new ArrayList<>(Arrays.asList("Whisky", "Ron", "Ginebra", "Vodka", "Licores", "Cerveza", "Vino", "Otros"));
    static ArrayList<Producto> inventario = new ArrayList<>();

    public static void leerListaProductos() {
        String linea;
        try (BufferedReader br = new BufferedReader(new FileReader("src/productos.csv"))) {
            while((linea = br.readLine()) != null) {
                if (!linea.isEmpty()) {
                    String[] dades = linea.split(",");
                    String nombre = dades[0];
                    String tipo = dades[1];
                    double precio = Double.parseDouble(dades[2]);

                    if (listaAlcoholes.contains(tipo)) {
                        Alcohol a1 = new Alcohol(nombre, tipo, precio);
                        inventario.add(a1);
                    } else {
                        Refresco r1 = new Refresco(nombre, tipo, precio);
                        inventario.add(r1);
                    }
                }
            }

            for(Producto p : inventario){
                System.out.println(p);
            }

        } catch (IOException e) {
            System.out.println("Error al llegir el fitxer del mercat: " + e.getMessage());
        }

    }
}
