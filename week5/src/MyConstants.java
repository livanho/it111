import java.util.Scanner;

public class MyConstants {
    public static void main(String[] args) {
        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        int td,con,tg;

        //ask the end user to enter the touchdowns, conversions and fieldgoals
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of touchdowns!");
        td = input.nextInt() * TOUCHDOWN;
        System.out.println("Please enter the number of conversions!");
        con = input.nextInt() * CONVERSION;
        System.out.println("Please enter the number of fieldgoals!");
        tg = input.nextInt() * FIELDGOAL;

        System.out.println(td);
        System.out.println(con);
        System.out.println(tg);
        System.out.print("Our total score is ");
        System.out.println(td + con + tg);
    }
}
