public class CelsiusFarConverter {
    public static void main(String[] args) {
        // far = (cel * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel + 2) {
            far = (cel * 9/5) + 32;
            System.out.println(cel + " degrees Celsius is equal to " +far+ " degrees Farenheit");
        }//end for loop
    }
}
