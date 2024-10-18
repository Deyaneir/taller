package ejersicio;
//sE IMPORTA EL SCANER EN EL MAIN Y LAS PREGUNTAS DE ENTRADA SE UBICAN EN DONDE ESTA EL SCANER CONJUNTO ESO EN LOS PARENTESIS SE UBICA LOS OBJETOS
import java.util.Scanner;

public class informacion {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar el nombre de usuario del jugador: ");
        String avatar=sc.nextLine();
        System.out.println("Ingresar la edad del jugador: ");
        int edad= sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresar el pais del jugador: ");
        String pais= sc.nextLine();
        System.out.println("Ingresar el numero de saltos del jugador: ");
        int s= sc.nextInt();
        sc.nextLine();
        Jugador jugador1=new Jugador(avatar,edad,pais,s);
        Jugador jugador2=new Jugador();
        jugador1.correr();
        jugador1.patear();
        System.out.println("--------------------------------------------------------------------");
        jugador2.correr();
        jugador2.patear();
        jugador2.saltar();
    }
}
