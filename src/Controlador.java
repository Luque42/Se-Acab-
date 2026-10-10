import java.util.ArrayList;

public class Controlador {
    ArrayList<Persona> gente = new ArrayList<>();
    Vista vista = new Vista();
    Persona david = new Persona("David",true);
    Persona dasha = new Persona("Dasha",false);
    Persona luque = new Persona("Luque",false);
    Persona diana = new Persona("Diana",false);
    public void iniciarPrograma(){


    int opcion= vista.menuInicial();
    switch (opcion){
        case 1 -> {
            gente.add(crearPersona());
            Vista.print("\npersona registrada correctamente\n");
            iniciarPrograma();
        }
        case 2 -> {
            if (!gente.isEmpty()) {
                for (Persona persona : gente) {
                    Vista.print(persona.toString());
                }
            }else{Vista.print("\nno hay personas registradas\n");}
            iniciarPrograma();
        }
        case 3 -> {
            if (!gente.isEmpty()){
            Vista.print("\nLa gente que no está acabada son:");
            listarPersonas();
            Vista.print("");

            acabarConPersona(Utils.pideStringCapitalize("¿con quien quieres acabar?"));

            }else{
                Vista.print("\nNo hay personas registradas\n");
            }
            iniciarPrograma();
        }
        case 4 -> {
            cargarPersonas();
            Vista.print("Las personas se han cargado correctamente");
            iniciarPrograma();
        }
        case 0 -> {
            Vista.print("Se acabó para todos");
            System.exit(0);
        }

    }
}

    private void cargarPersonas() {
        gente.add(david);
        gente.add(dasha);
        gente.add(luque);
        gente.add(diana);
    }

    public void listarPersonas(){
    for (Persona persona : gente){
        if (!persona.isEstaAcabado()) {
            Vista.print(persona.getNombre());
        }
    }
}

    /**
     * crea un objeto de la clase persona
     * @return la persona creada con el nombre
     */
    public Persona crearPersona() {
        do {
            String nombre = Utils.pideStringCapitalize("Dime el nombre de la persona");
            if (validaPersonaNombre(nombre)) {
                return new Persona(nombre);
            } else {
                Vista.print("Esta persona ya existe");


            }
        }while(true);
    }
    public void acabarConPersona(String nombre){
    for (Persona persona : gente){
        if (persona.getNombre().equals(nombre)){
            persona.setEstaAcabado(true);
        }
    }
    }
    public boolean validaPersonaNombre(String nombre){
        for (Persona persona : gente){
            if (persona.getNombre().equals(nombre)){
                return false;
            }
        }
        return true;
    }

}
