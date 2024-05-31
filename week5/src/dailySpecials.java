import java.util.Arrays;
import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        String specials;
        String[] week;
        week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Please enter a day of week excluding weekends (Monday - Friday only!)");
            specials = input.next();
        }while(!Arrays.asList(week).contains(specials));



        //In the world of coffee, I need a name of a coffee beverage and a price
        String coffee;
        double price;
        double order;

        switch (specials) {
            //my cases wil be the day of the week
            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "Tuesday":
                coffee = "Frap";
                price = 5.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "Wednesday":
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "Thursday":
                coffee = "Regular's Joe";
                price = 2.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;
            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else {
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                }
                break;

            default:
                System.out.println("Please enter a valid day or check your spelling");
        }

    }//end main()
}//end Main class
