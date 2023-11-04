import java.util.Scanner;

public class Ejemplo_switch {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Introduce el valor");
        int valor= Scanner.nextInt();
        switch (valor){
            case 1:
                System.out.println("El valor es 1");
                break;
            case 5:
                System.out.println("El valor vale 5");
                break;
            case 10:
                System.out.println("El valor vale 10");
                break;
            default:
                System.out.println("El valor no esta contemplado");
                break;

        }
        System.out.println("El switch termina");
    }
}
