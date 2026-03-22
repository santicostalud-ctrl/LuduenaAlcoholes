public class Constantes {

    // Configuración visual
    public static final int DEFAULT_COLUMN_NUMBER = 5;
    public static final String MESSAGE_SEPARATOR = "---------------------------------------------------------------------------------------";

    // Mensajes de Entrada de Datos (Scanner)
    public static final String MESSAGE_DEFAULT_ASK_STRING = "Introduce el nombre del producto:";
    public static final String MESSAGE_DEFAULT_ERROR_STRING = "Error: El nombre no puede estar vacío.";
    public static final String MESSAGE_DEFAULT_ASK_FLOAT = "Introduce el precio del producto:";
    public static final String MESSAGE_DEFAULT_ERROR_FLOAT = "Error: El valor introducido no es un precio válido.";

    // Mensajes de Tiendas y Búsqueda
    public static final String MESSAGE_ASK_STORE = "Introduce la tienda (Mercadona, Lidl, Carrefour...):";
    public static final String MESSAGE_NOT_FOUND = "Producto no encontrado en ninguna tienda.";
    public static final String MESSAGE_PRODUCT_ADDED = "Producto añadido correctamente al inventario.";
    public static final String MESSAGE_PRODUCT_EXISTS = "Este producto ya está registrado en esta tienda.";

    // Mensajes del Carrito y Sumaje
    public static final String MESSAGE_CART_ADDED = "¡Añadido al carrito!";
    public static final String MESSAGE_CART_EMPTY = "Tu carrito está vacío. ¡Añade algo para la fiesta!";
    public static final String MESSAGE_TOTAL_SUM = "El total de tu compra es: ";
    public static final String MESSAGE_DELETED_FROM_CART = "Producto eliminado del carrito.";

    // Recomendaciones de Mezclas
    public static final String MESSAGE_SUGGEST_MIX = "¿Buscas una mezcla? Estos refrescos combinan bien:";
    public static final String MESSAGE_NO_MIX_FOUND = "No tenemos recomendaciones de mezcla para esta bebida.";

    // Errores de Archivos (Persistencia)
    public static final String MESSAGE_ERROR_FILE_NOT_EXIST = "Archivo de precios no encontrado.";
    public static final String MESSAGE_ERROR_READING_FILE = "Error al leer la base de datos de bebidas.";
    public static final String MESSAGE_ERROR_WRITING_FILE = "Error al guardar tu lista de la compra.";

    // Menú Principal
    public static final String START_MENU_HEADER = "--- LUDUEÑA ALCOHOLES ---";
    public static final String START_MENU = """
                                    1) Ver catálogo de bebidas (Alcohol).
                                    2) Ver catálogo de refrescos (Mezcla).
                                    3) Buscar producto por tienda (Mercadona, Lidl...).
                                    4) Añadir al carrito.
                                    5) Ver carrito y total (Sumaje).
                                    0) Salir.
                                    """;

    // Formatos de Tabla
    public static final String LIST_HEADER = "PRODUCTO         TIENDA          PRECIO (€)    CATEGORÍA";
    public static final String TEMP_LIN = "--------------------------------------------------------------------";
    // Formato: Nombre (15 char), Tienda (15 char), Precio (8.2 float), Categoría (12 char)
    public static final String PRODUCT_BOARD_FORMAT = "%-15s %-15s %8.2f€    %-12s";

    public static final String ERROR_HEADER = " [!] ERROR";
    public static final String INFO_HEADER = " [i] INFO";
}