package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
                Scanner scanner = new Scanner(System.in);

                System.out.print("How many times do you want to print your text? ");
                int times = scanner.nextInt();
    
                int count = 0;
    
                while (count < times) {
                    printText();
                    count++;
                }
                scanner.close();
            }
        
            public static void printText() {
                System.out.println("In a hole in the ground there lived a method");
            }
        }
        
    
        
            
    
