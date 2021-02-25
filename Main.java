package sample;

import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        int dato1, dato2, res=0;
        int op;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. mULT");
        System.out.println("4. Div");

        System.out.println("Ingrese el numero de la Op");

        op = scan.nextInt();
        System.out.println("Ingrese el dato1");
        dato1 = scan.nextInt();
        System.out.println("Ingrese el dato2");
        dato2 = scan.nextInt();

        switch (op) {
            case 1:
                res = dato1 + dato2;
                break;

            case 2:
                res = dato1 - dato2;
                break;

            case 3:
                res = dato1 * dato2;
                break;

            case 4:
                res = dato1 / dato2;
                break;

            default:
                System.out.println(" Ingresa otro valor");
                break;


        }

        System.out.println(" Respuesta=  "+ res);

    }}