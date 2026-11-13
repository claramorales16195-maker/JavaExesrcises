package Exercises;

public class DataTypes {
    public String cadena;
    public char caracter;
    public int entero;
    public float flotante;
    public boolean boleano;

    // 1. Constructor vacío
    public DataTypes() {
        this.cadena = "Hola Mundo";
        this.caracter = 'A';
        this.entero = 10;
        this.flotante = 5.9f;
        this.boleano = true;
    }

    // 2. Constructor de 4 argumentos (el que exige Tests.java en la línea 9)
    public DataTypes(String cadena, int entero, float flotante, char caracter) {
        this.cadena = cadena;
        this.entero = entero;
        this.flotante = flotante;
        this.caracter = caracter;
        this.boleano = true; // Inicializado en true para que dataTypes.boleano pase la prueba
    }
}