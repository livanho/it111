package package_person_homework;

public class PersonDetails {
    // this file will have a main method
    public static void main(String[] args) {
        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;
        //in the process of creating an object from my Person class
        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

        // we will be entering the inform assigning values to our fields

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = 2023;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;


        double monthlyRate = 0;
        double adjustedRate = 0;
        int actualYear = 2024;
        firstPerson.display();
        System.out.println("Preliminary Rate for " + firstPerson.name + ": "+ firstPerson.getRate(monthlyRate) + " dollars.");
        System.out.println("Adjustments: "+ firstPerson.assumeGender(adjustedRate) +" dollars");
        System.out.print("Here is " + firstPerson.name + "s total monthly premium: $");
        System.out.println(firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate) + firstPerson.getCarAge(actualYear));
        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " + secondPerson.name + ": "+ secondPerson.getRate(monthlyRate) + " dollars.");
        System.out.println("Adjustments: "+ secondPerson.assumeGender(adjustedRate) +" dollars");
        System.out.print("Here is " + secondPerson.name + "s total monthly premium: $");
        System.out.println(secondPerson.getRate(monthlyRate) + secondPerson.assumeGender(adjustedRate) + secondPerson.getCarAge(actualYear));
        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " + thirdPerson.name + ": "+ thirdPerson.getRate(monthlyRate) + " dollars.");
        System.out.println("Adjustments: "+ thirdPerson.assumeGender(adjustedRate) +" dollars");
        System.out.print("Here is " + thirdPerson.name + "s total monthly premium: $");
        System.out.println(thirdPerson.getRate(monthlyRate) + thirdPerson.assumeGender(adjustedRate) + thirdPerson.getCarAge(actualYear));
        System.out.println();

    }
}
