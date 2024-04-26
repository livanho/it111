public class GallonsLiters {
    public static void main(String[] args) {
        // 3.79 liters = 1 gallon
        double liters = 3.79;
        int counter = 0;
        for(double gallons = 1; gallons <= 100; gallons +=4) {
        counter++;
        if(gallons == 1){
            System.out.printf("%.2f Liters = %.2f Gallon", liters, gallons);
            System.out.println();
        } else {
            liters = gallons * 3.79;
            System.out.printf("%.2f Liters = %.2f Gallons", liters, gallons);
            System.out.println();
        }
        if(counter == 5){
            System.out.println();
            counter = 0;
        }
        }

    }
}
