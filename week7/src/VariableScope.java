public class VariableScope {
    public static void main(String[] args) {
        //We are inside the main method
        String txt = "This is my local variable in the main method";
        System.out.println(txt);
        //in order for the sub method to run, we need to call it in the main method
        sub();
    }

    public  static void sub() {
        String txt = "This is my local variable in the sub method";
        System.out.println(txt);

    }
}
