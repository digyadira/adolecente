import java.util.Scanner;

public class Adolecente {
    public static void main(String args[]){
    int Edad;
    String Nombre;
    Scanner imput = new Scanner(System.in);
    System.out.println("Ingrese Nombre");
    Nombre = imput.next();
    System.out.println("Ingrese Edad");
    Edad = imput.nextInt();
    if (Edad>=12&& Edad<=18){
        System.out.println("Es un adoleccentes: ");           
    }            
}
    

}