 package lv.rvt;

// public class DecreasingCounter {
//    private int value;

//     public DecreasingCounter(int initialValue) {
//         this.value = initialValue;

//     }


//     public void printValue() {
//         System.out.println("value: " + this.value);
//     }

//     public void decrement() {
//         if (this.value > 0){
//             this.value -= 1;
//         }
//     }



//     public void reset() {
//         this.value = 0;

//     }
// }

public class Main {
    public static void main(String[] args) {
        // Create the cards with initial balances
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        // Paul eats heartily
        paulsCard.eatHeartily();

        // Matt eats affordably
        mattsCard.eatAffordably();

        // Print the card balances
        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");

        // Paul tops up 20 euros
        paulsCard.topUp(20);

        // Matt eats heartily
        mattsCard.eatHeartily();

        // Print the card balances
        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");

        // Paul eats affordably twice
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        // Matt tops up 50 euros
        mattsCard.topUp(50);

        // Print the card balances
        System.out.println("Paul: The card has a balance of " + paulsCard.getBalance() + " euros");
        System.out.println("Matt: The card has a balance of " + mattsCard.getBalance() + " euros");
    }
}


