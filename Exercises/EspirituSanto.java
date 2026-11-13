    package Exercises;

public class EspirituSanto extends Hijo {
    public String apellidoReal;

    public EspirituSanto(String apellido, String nombre, String apellidoReal) {
        super(apellido, nombre);
        this.apellidoReal = apellidoReal;
    }

    public boolean pruebaPaternidad() {
        // Asegúrate de que devuelva false para cumplir con la prueba
        return !this.apellido.equals(this.apellidoReal);
    }
}

    