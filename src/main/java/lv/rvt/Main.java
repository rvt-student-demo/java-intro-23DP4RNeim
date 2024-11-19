  package lv.rvt;
import lv.rvt.Book;
// // public class DecreasingCounter {
// //    private int value;

// //     public DecreasingCounter(int initialValue) {
// //         this.value = initialValue;

// //     }


// //     public void printValue() {
// //         System.out.println("value: " + this.value);
// //     }

// //     public void decrement() {
// //         if (this.value > 0){
// //             this.value -= 1;
// //         }
// //     }



// //     public void reset() {
// //         this.value = 0;

// //     }
// // }

// public class Main {
//     public static void main(String[] args) {

//         PaymentCard paulsCard = new PaymentCard(20);
//         PaymentCard mattsCard = new PaymentCard(30);

//         paulsCard.eatHeartily();

//         mattsCard.eatAffordably();

//         System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
//         System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");

//         paulsCard.topUp(20);

//         mattsCard.eatHeartily();

//         System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
//         System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");

//         paulsCard.eatAffordably();
//         paulsCard.eatAffordably();

//         mattsCard.topUp(50);

//         System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
//         System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");
//     }
// }



import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    int pages;
    int year;

    public Book(String title, int pages, int year) {
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }
}

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            ArrayList<Book> books = new ArrayList<>();
            books.add(new Book("To Kill a Mockingbird", 281, 1960));
            books.add(new Book("A Brief History of Time", 256, 1988));
            books.add(new Book("Beautiful Code", 593, 2007));
            books.add(new Book("The Name of the Wind", 662, 2007));
    
            System.out.println("Choose a book (1-4):");
            for (int i = 0; i < books.size(); i++) {
                System.out.println((i + 1) + ". " + books.get(i).getTitle());
            }
    
            int choice = Integer.parseInt(scanner.nextLine());
    
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
            }
    
            Book selectedBook = books.get(choice - 1);  
    
            System.out.print("What information will be printed? ");
            String infoChoice = scanner.nextLine();
    
            if (infoChoice.equals("everything")) {
                System.out.println(selectedBook.getBookInfo());
            } else if (infoChoice.equals("name")) {
                System.out.println(selectedBook.getTitle());
            } else {
                System.out.println("Invalid option.");
            }
    
            scanner.close();
        }
    }


