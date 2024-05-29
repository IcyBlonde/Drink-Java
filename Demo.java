import java.util.Scanner;
public class Demo {
    public static void main(String[] args){
        Scanner scanny = new Scanner(System.in);
        Drink drink;

        System.out.println("Do you want Tea or Coffee?");
        String answer = scanny.nextLine().toLowerCase();
        while (!answer.equals("tea") && !answer.equals("coffee")) {
            System.out.println("Invalid selection, please try again.");
            System.out.println("Do you want Tea or Coffee?");
            answer = scanny.nextLine().toLowerCase();
        }
        scanny.close();
        if(answer.equals("tea")){
            drink = new Tea();
            System.out.println("Your tea is " + drink.seeColor());
        } else {
            drink = new Coffee();
            System.out.println("Your coffee is " + drink.seeColor());
    }
    }
}
