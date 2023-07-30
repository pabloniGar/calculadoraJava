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
            }
        }
    }

    public static double suma(double numero1, double numero2){
        
        return numero1 + numero2;
    }
}