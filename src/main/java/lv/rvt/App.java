package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {


                Scanner scanner = new Scanner(System.in);
                
                System.out.print("Ievadiet skaitli zem 100: ");
                int userInput = scanner.nextInt();
    
                for (int i = userInput; i <= 100; i++) {
                    System.out.println(i);
                }
                
                scanner.close();
            
        }
        

}

