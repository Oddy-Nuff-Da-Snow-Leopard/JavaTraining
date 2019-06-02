package by.epam.javatraining.alekseev.lesson05.extraTask.view;

public class Scanner {
    
    private static final java.util.Scanner SCANNER 
            = new java.util.Scanner(System.in);
    
    public static String scan(){
        return SCANNER.next();
    }
}
