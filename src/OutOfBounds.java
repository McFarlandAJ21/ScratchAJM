import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OutOfBounds {
    ArrayList<Integer> tooLowV = new ArrayList<>();
    ArrayList<Integer> tooHighV = new ArrayList<>();
    int tooHighCount;
    int tooLowCount;
    int minimum;
    int maximum;

    public  OutOfBounds(int min, int max)  {
    maximum = max;
    minimum = min;
}
public void process (int value) {
        if ( value < minimum) {
            //tooLowV.add(min);
            tooLowCount++;
        }
        if (maximum < value) {
            // tooHighV.add(max)
            tooHighCount++;
        }
    }










public void process(ArrayList <Integer> values) {
    for (int i = 0; i < values.size(); i++) {

            if ( values.get(i) < minimum) {
                //tooLowV.add(min);
                tooHighCount++;

            }
            if (maximum < values.get(i)) {
                // tooHighV.add(max)
                tooLowCount++;


            }

        }
    }


    public int tooLow(){
        return tooLowV.size();
        }
    public int tooHigh(){
        return tooHighV.size();
    }


    public static void main(String[] args) throws IOException {
        FileInputStream fintMain = new FileInputStream("values.txt");
        FileOutputStream foutMain  = new FileOutputStream("counts.txt");
        PrintWriter print = new PrintWriter(foutMain);
        Scanner in = new Scanner(fintMain);
        in.useDelimiter("//");
        Scanner parser = new Scanner(in.nextLine());
        int x =0;
while (parser.hasNextInt()){
    if(!parser.hasNextInt()){
        print.println("invalid");
    }else{
        print.println(parser.nextInt());
        x++;
    }
}







        ///////////////////////////////////////////////////////////////////

       print.flush();
       print.close();
       fintMain.close();
       foutMain.close();

    }

}
// while (scanLine.hasNextInt()) {
//            Scanner parser = new Scanner(scanLine.nextLine());
//            value = parser.nextInt();
//
//            if ( value < minimum) {
//                //tooLowV.add(min);
//                tooHighCount++;
//
//            }
//            if (maximum < value) {
//                // tooHighV.add(max)
//                tooLowCount++;
//
//
//            }
//
//
//
//
//        }
