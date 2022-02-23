import java.util.Scanner;

public class classStuff {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("enter a username");
        String username = console.next();
        //holds a string so you can do numbers or words
        System.out.println("your username is: " + username);
        System.out.println("enter a password, only digits");
        int pw = console.nextInt();
        /*cannot do words only integers because it is int
        If the number is too big it will yell at you
         */
        System.out.println("password is: " + pw);

    }
}
