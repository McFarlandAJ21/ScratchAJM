import java.util.Scanner;

public class ScannerErrors {
    public static void main(String[] args) {
        // create a new scanner that reads from System.in (console input)
        Scanner scan =new Scanner(System.in);
        // read the next line from that input source
        int num = 0;
        System.out.println("Enter Something: ");

        try {
             num = scan.nextInt();
        }catch (Exception e){
            System.out.println("I said an integer ");
            System.out.print("REEEE");
            for(int i = 0; i < 1; i++){
                System.out.print("E");
            }
            System.out.println(" ");
            System.out.printf("you enetered %s\n", scan.nextLine());
            System.out.println("you have one more try");
            System.out.println("enter an integer");
            num = scan.nextInt();

        }
        //print the line you just read
        System.out.println(num);
    }
}
