package Personas;

public class Personas {
    public static void main(String[] args) {
        Personaprivada persona = new Personaprivada("Marco", 22, 1.23);
        persona.mostrarDatos();
        persona.mayordeedad(persona.edad);
    }
}
