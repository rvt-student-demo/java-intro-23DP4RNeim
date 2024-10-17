package lv.rvt;

import java.util.*;

public class App 
{
    public class DivisibleByThree {

        public static void divisibleByThreeInRange(int beginning, int end) {
            for (int i = beginning; i <= end; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        }
    
        public static void main(String[] args) {
            // Example usage
            divisibleByThreeInRange(3, 6);
            System.out.println();
            divisibleByThreeInRange(2, 10);
        }
    }
    
    }
    
        
    
        
            
    
