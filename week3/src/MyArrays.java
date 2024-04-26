import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        String[] cars = new String[4];
        //in many computer programs, we start counting with zero

        cars[0] = "Volvo";
        cars[1] = "Ford";
        cars[2] = "Toyota";
        cars[3] = "Honda";

        System.out.println(cars[0]);
        System.out.println(Arrays.toString(cars));

        //Cabernet
        //Merlot
        // Syrah
//        Malbec
//        Cabernet-Franc
        //String[] books = {"The Handmaid's Tale", "Slenderman", "The Joy Luck Club", "East of Eden", "The Looming Tower"};
        String[] books = new String[5];
        books[0] = "The Handmaid's Tale";
        books[1] = "Slenderman";
        books[2] = "The Joy Luck Club";
        books[3] = "East of Eden";
        books[4] = "The Looming Tower";
        System.out.println(Arrays.toString(books));
        for(String book : books){
            System.out.println(book);
        }


    }//end main()
}//end Main class
