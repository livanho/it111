import java.util.Scanner;

public class MyEnum {
    enum WhoWin {HOME, VISITOR, NEITHER}

    public static void main(String[] args) {
        //now I am going to declare a variable
        WhoWin who;
        int seahawks, broncos;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Seahawks");
        broncos = input.nextInt();

        // If the seahawks score is greater than the broncos
        if (seahawks > broncos) {
            who = WhoWin.HOME; // WhoWin.HOME is an object of the WhoWins type
            System.out.println(who+ " team wins!");
            System.out.print("Seahawks wins by ");
            System.out.println(seahawks - broncos + " points");
        } else if (broncos > seahawks) {
            who = WhoWin.VISITOR; // WhoWin.VISITORS is an object of the WhoWins type
            System.out.println(who+ " team wins!");
            System.out.print("Broncos wins by ");
            System.out.println(broncos - seahawks + " points");
        } else {
            who = WhoWin.NEITHER; // WhoWin.NEITHER is an object of the WhoWins type
            System.out.println(who+ " team wins!");
            System.out.println("It's a tie!");
        }
    }
}
