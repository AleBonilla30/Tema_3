import java.util.Scanner;

public class Ejemplo_menu {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. dividir");
        System.out.println("4. multiplicar");
        System.out.println("5. Salir");
        System.out.println("Introduce la opcion que quieres");
        int opcion= Scanner.nextInt();
        int operando1=0, operando2=0;
        double resultado= 0.0;
        if (opcion>0 && opcion<5){
            System.out.println("introduce operando 1");
            operando1= Scanner.nextInt();
            System.out.println("introduce operando 2");
            operando2= Scanner.nextInt();
        }



        switch (opcion){
            case 1:
                System.out.println("Vas a sumar");
                resultado= operando1+operando2;

                break;
            case 2:
                System.out.println("vas a restar");
                resultado= operando1-operando2;

                break;
            case 3:
                System.out.println("vas a dividir");
                resultado= (double) operando1/operando2;

                break;
            case 4:
                System.out.println("vas a multiplicar");
                resultado= operando1*operando2;

                break;
            case 5:
                System.out.println("saliendo.....");
                break;
        }
        if (operando1>0 && operando2<5){
            System.out.println("El resultado obtendio es: "+resultado);
        }



    }
}
