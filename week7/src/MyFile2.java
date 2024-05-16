import java.io.File;

import static java.lang.System.out;

public class MyFile2 {
    public static void main(String[] args) {
        File dir = new File("NewFolder");

        //start with an if else statement
        if (dir.exists()) {// we are going to be happy
            String[] files = dir.list();
            //new keyword, named assert
            assert files != null;
            out.println(files.length + " files found!");
            for (int i = 0; i < files.length; i++){
                out.println(files[i]);
            }

        } else {//we are going to be sad
            out.println("Directory di not exists");
        }
    }
}
