package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
                Scanner scanner = new Scanner(System.in);
                
                int total = 0;
                int count = 0;
                int evenCount = 0;
                int oddCount = 0;
        
                System.out.println("Give numbers:");
                
                while (true) {
                    int number = scanner.nextInt();
                    if (number == -1) {
                        break;
                    }
                    total += number;
                    count++;
        
                    if (number % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
        
                scanner.close();
        
                double average = (count > 0) ? (double) total / count : 0;
        
                System.out.println("Thx! Bye!");
                System.out.println("Sum: " + total);
                System.out.println("Numbers: " + count);
                System.out.println("Average: " + average);
                System.out.println("Even: " + evenCount);
                System.out.println("Odd: " + oddCount);
            }
        }
        
        
            
    
