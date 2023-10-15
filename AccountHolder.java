import java.util.Scanner;
public class AccountHolder {
    String cardType;
    void whichCard(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter account number: ");
        System.out.println("Which type of card would you like to use today:");
        System.out.println("1. Debit Card");
        System.out.println("2. Credit Card");
        int typeOption = scan.nextInt();
        scan.close();
        if (typeOption ==1){
            System.out.println("You chose Debit");
        }else if(typeOption ==2){
            System.out.println("You chose Credit");
        }else{
            System.out.println("Invalid chose.");
        }
    }
    public static void main(String[] args){
        AccountHolder ah = new AccountHolder();
        ah.whichCard();
    }
    
}
