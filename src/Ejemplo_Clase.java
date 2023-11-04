import java.util.Scanner;

public class Ejemplo_Clase {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero= Scanner.nextInt();
        if (numero>=0 && numero<=1000){
            System.out.println("El numero esta entre el 0 & 1000");
        } else if (numero>1000 && numero<9999) {
            System.out.println("El numero es mas grande que 1000");

        } else {
            System.out.println("El numero es incorrecto");
        }

    }
}
