
public class Vista {
public int menuInicial(){
    return Utils.pideInt("""
            Bienvenido a la fiesta de los acabados\s
             \
            ¿Que deseas hacer?
            1.- Registrar persona
            2.- Ver estado de las personas
            3.- Acabar con persona
            4.- Cargar los de siempre
            0.- Salir del programa""");
}
public static void print(String print){
    System.out.println(print);
}

}
