import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Hello " + s + "!");
    }
}
