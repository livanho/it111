package package_person_homework;

    public class Person {
        String name;
        int age;
        char gender;
        int car;
        boolean violations;
        double creditScore;

        public  void display(){
            System.out.println("Customer name: " +name);
            System.out.println("Age: " +age);
            System.out.println("Gender: " +gender);
            System.out.println("Car Year: " +car);
            System.out.println("Violations: " +violations);
            System.out.println("Credit Score: " +creditScore);
        }

        public  double getRate(double monthlyRate){
            if (violations == true && creditScore <= 700){
                monthlyRate = 500.00;
            } else {
                monthlyRate = 100.00;
            }
            return monthlyRate;
        }

        public  double assumeGender(double adjustedRate){
            if (gender == 'M' || age <= 25){
                adjustedRate = 100;
            } else {
                adjustedRate = 0;
            }
            return adjustedRate;
        }

        //this method return a negative rate to apply a discount for older cars and positive rate
        // to penalize car having less than 3 years of age
        public int getCarAge(int year){
            int carAge = year - this.car;
            if (carAge <= 3) {
                return  (carAge + 3)*10;
            } else {
                return -carAge*2;
            }
        }
    }

