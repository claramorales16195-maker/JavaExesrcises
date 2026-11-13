package Exercises;

public class Tests {
    public static void main(String[] args) {
        boolean success = true;
        String errorMsg = "";

        DataTypes emptyDataTypes = new DataTypes();
        DataTypes dataTypes = new DataTypes("String", 5, 3.2f, 'B');

        if (! (emptyDataTypes.cadena == "Hola Mundo"))
            success = false;
        if (! (emptyDataTypes.caracter == 'A'))
            success = false;
        if (! (emptyDataTypes.entero == 10))
            success = false;
        if (! (emptyDataTypes.flotante == 5.9f))
            success = false;
        if (! (emptyDataTypes.boleano))
            success = false;
        if (! (dataTypes.cadena == "String"))
            success = false;
        if (! (dataTypes.entero == 5))
            success = false;
        if (! (dataTypes.flotante == 3.2f))
            success = false;
        if (! (dataTypes.boleano))
            success = false;
        
        if (success == false)
            errorMsg = errorMsg.concat(" DataTypes");

        Colecciones coleccion = new Colecciones();
        coleccion.inicializar();
        coleccion.obtenerHash();
        if (coleccion.transport.size() != 10) {
            success = false;
            errorMsg = errorMsg.concat(" Colecciones");
        }

        Padre papa = new Padre("Perez");
        if (papa.test()) {
            success = false;
            errorMsg = errorMsg.concat(" Padre");
        }

        Sobrecarga sbc = new Sobrecarga("Pepe", "Progra", 5);
        Alumno alumno = new Alumno("Pepe", "Progra", 0);
        if (alumno.reprobar() != ":(") {
            success = false;
            errorMsg = errorMsg.concat(" Sobrecarga");
        }

        if (success) {
            System.out.println(success);
        } else {
            System.out.println(errorMsg);
        }
    }
}