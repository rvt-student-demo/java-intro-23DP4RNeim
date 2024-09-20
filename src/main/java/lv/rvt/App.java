package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
   

        Scanner scanner = new Scanner(System.in);


System.out.println("give me the first number:");

int pirmais = Integer.valueOf(scanner.nextLine());


System.out.println("give me the second number");

int otrais = Integer.valueOf(scanner.nextLine());

System.out.println(pirmais + otrais);
System.out.println(pirmais - otrais);
System.out.println(pirmais * otrais);
double result = pirmais / otrais * 1.0;

System.out.println(result);
    }
}
