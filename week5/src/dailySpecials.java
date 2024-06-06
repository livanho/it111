import java.util.Arrays;
import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {
        String specials = "";
        String[] week;
        week = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        boolean weekend = true;
        Scanner input = new Scanner(System.in);

        while(weekend){
            System.out.println("Please enter a day of week excluding weekends (Monday - Friday only!)");
            specials = input.next();
            if (specials.equals("Sunday" )|| specials.equals("Saturday")){
                System.out.println("Please enter a weekday, not weekend");
            }

            String coffee;
            double price;
            double order;

            switch (specials) {
                //my cases wil be the day of the week
                case "Monday":
                    weekend = false;
                    coffee = "Latte";
                    price = 4.95;

                    break;
                case "Tuesday":
                    weekend = false;
                    coffee = "Frap";
                    price = 5.95;

                    break;

                case "Wednesday":
                    weekend = false;
                    coffee = "Cappuccino";
                    price = 4.35;

                    break;

                case "Thursday":
                    weekend = false;
                    coffee = "Regular's Joe";
                    price = 2.95;

                    break;

                case "Friday":
                    weekend = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;

                    break;

            }//end case

            if (Arrays.asList(week).contains(specials)){
                System.out.println(specials+ "'s coffee of the day is a " +coffee+ " and the price will be $" +price);
                System.out.println("How many " +coffee+ " would you like to order?");
                order = input.nextInt();
                double discount;
                if (order == 0){
                    System.out.println("Looks like you don't like " +coffee+ "s! So sad!!!");
                } else if (order == 1) {
                    System.out.println("Looks like you will be ordering only 1 " +coffee+ " today!");
                }else if(order < 5){
                    System.out.print(order + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f dollars!", order*price);
                } else if (order < 10){
                    System.out.printf("Looks you qualify for a group discount! Your regular price is $%.2f dollars\n",order*price);
                    discount = order * price * 0.10;
                    System.out.print("You ordered "+order+" "+coffee);
                    System.out.printf("s but will be only charged $%.2f!",(order*price) - discount);
                } else {
                    System.out.printf("A bigger group discount! Your regular price is $%.2f dollars\n",order*price);
                    discount = order * price * 0.20;
                    System.out.print("You ordered "+order+" "+coffee);
                    System.out.printf("s but will be only charged $%.2f!",(order*price) - discount);
                }
            }
        }//end while

        }//end main()

    }//end Main class

