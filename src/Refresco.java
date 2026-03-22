public class Refresco extends Producto {
    String tipoRefresco;

    public Refresco(String nombre, String tipoRefresco, double precio){
        super(nombre, precio);
        this.tipoRefresco = tipoRefresco;
    }

    @Override
    public String toString() {
        return "Refresco{" +
                "tipoRefresco='" + tipoRefresco + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
