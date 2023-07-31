import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double resultado = 0;
        double numero1;
        double numero2;


        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenidos a la calculadora Java");
        System.out.println("¿Que operacion desea realizar?");
        System.out.println("1- Suma");
        System.out.println("2- Resta");
        System.out.println("3- Multiplicacion");
        System.out.println("4- Division");
        System.out.println("0- Salir");

        int opcion = sc.nextInt();

        while(opcion !=0){

            System.out.println("Ingrese el primer numero: ");
            numero1 = sc.nextDouble();

            System.out.println("Ingrese el segundo numero: ");
            numero2 = sc.nextDouble();

            switch (opcion){

                case 1:

                    resultado = suma(numero1,numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                case 2:

                    resultado = resta(numero1,numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                case 3:

                    resultado = multiplicacion(numero1,numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                case 4:

                    resultado = division(numero1,numero2);
                    System.out.println("El resultado de la operacion es: " + resultado);
                    break;

                default:
                    System.out.println("Operacion no valida");
            }

            System.out.println("Bienvenidos a la calculadora Java");
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("0- Salir");

            opcion = sc.nextInt();
        }
        System.out.println("Gracias por utilizar la calculadora Java.");
    }

    public static double suma(double numero1, double numero2){

        return numero1 + numero2;
    }

    public static double resta(double numero1, double numero2){

        return numero1 - numero2;
    }

    public static double multiplicacion(double numero1, double numero2){

        return numero1 * numero2;
    }

    public static double division(double numero1, double numero2){

        if (numero2 != 0){
            return numero1 / numero2;
        }else{
            System.out.println("Error: No es posible dividir entre cero.");
            return 0;
        }

    }
}