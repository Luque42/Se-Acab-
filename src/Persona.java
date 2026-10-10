import java.util.Objects;

public class Persona {
    private final String nombre;
    private boolean estaAcabado;

    public String getNombre() {
        return nombre;
    }

    public void setEstaAcabado(boolean estaAcabado) {
        this.estaAcabado = estaAcabado;
    }

    public boolean isEstaAcabado() {
        return estaAcabado;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.estaAcabado = false;
    }

    public Persona(String nombre, boolean estaAcabado) {
        this.nombre = nombre;
        this.estaAcabado = estaAcabado;
    }

    @Override
    public String toString() {
        if (this.estaAcabado) {
            return "se acabó para " + this.nombre;
        }else{ return "Aun no se acabó para "+this.nombre;}

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombre);
    }
}
