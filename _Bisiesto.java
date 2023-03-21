import java.util.Scanner;

public class Bisiesto {


    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);

        //Aqui se va a pedir el año

        System.out.println("Por favor, ingresa el año: ");
        int agno = sn.nextInt();

        //Determina si es divisible entre 4 y si no es divisible entre 100
        //O si es divisible entre 100 y 400

        if((agno%4 ==0 && agno % 100 != 0) || (agno % 100 == 0 && agno % 400 ==0))
        {
            System.out.println(  + agno + ": S");

        } else {
            System.out.println( + agno + ": N");
        }
    }

    }

