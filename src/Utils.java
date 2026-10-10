import java.util.Scanner;

public class Utils {
    private static final Scanner keyboard = new Scanner(System.in);
    /**
     * pide un numero entero a partir de un mensaje del usuario
     *
     * @param mensaje mensaje del usuario
     * @return numero entero pedido
     */
    public static int pideInt(String mensaje) {
        boolean esValido = false;
        int num = 0;
        while (!esValido) {
            try {
                Vista.print(mensaje);
                num = keyboard.nextInt();
                esValido = true;
            } catch (Exception e) {
                Vista.print("el parametro introducido no es un numero entero");
                keyboard.nextLine();
            }
        }
        return num;
    }

    /**
     * pide un String al usuario
     * @param mensaje mensaje del usuario
     * @return String con la primera letra en mayuscula
     */
    public static String pideStringCapitalize(String mensaje){
        Vista.print(mensaje);
        String entrada = keyboard.next();
        if (entrada == null || entrada.isEmpty()) {
            return entrada;
        }
        return entrada.substring(0, 1).toUpperCase() + entrada.substring(1).toLowerCase();

}
}
