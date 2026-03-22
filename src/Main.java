//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<String> listaAlcoholes = new ArrayList<>(Arrays.asList("Whisky", "Ron", "Ginebra", "Vodka", "Licores", "Cerveza", "Vino", "Otros"));
    Scanner scanner = new Scanner(System.in);
    iniciarMenu();
    CSVUtils csv = new CSVUtils();
    csv.leerListaProductos();

}

public void iniciarMenu(){
    System.out.println(Constantes.MESSAGE_SEPARATOR);
    System.out.println(Constantes.START_MENU_HEADER);
    System.out.println(Constantes.MESSAGE_SEPARATOR);
    System.out.println(Constantes.START_MENU);
}
