package Personas;

public class Personapublica {
    String direccion;
    int telefono;
    String email;
    public Personapublica(String direccion, int telefono, String email){
        this.direccion="Chillogallo";
        this.telefono=telefono;
        this.email=email;
    }
    private void cambiarDireccion(String direccion){
        System.out.println("la direccion es: "+ direccion);
    }
    private void mostarTelefono(int telefono){
        System.out.println("Su telefono es: "+telefono);
    }
}
