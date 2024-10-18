package Personas;

public class Personaprivada {
    String nombre;
    int edad;
    double altura;
    public Personaprivada(String nombre, int edad, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.altura=altura;

    }
    public void mostrarDatos(){
        System.out.println("su nombre es: "+nombre+" su edad es: "+edad+" Su altura es: "+altura);

    }
    public void mayordeedad(int edad){
        if(edad>18) {
            System.out.println(edad+"Es myor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
    }
}
