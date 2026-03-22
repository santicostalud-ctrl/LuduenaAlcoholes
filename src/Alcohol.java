public class Alcohol extends Producto {
    String tipoAlcohol;

    public Alcohol(String nombre, String tipoAlcohol, double precio){
        super(nombre, precio);
        this.tipoAlcohol = tipoAlcohol;
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "tipoAlcohol='" + tipoAlcohol + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
