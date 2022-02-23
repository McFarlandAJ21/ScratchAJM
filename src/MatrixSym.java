//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class MatrixSym {
//    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(new File("matrix.txt"));
//        int numRows = in.nextInt();
//        //nextInt() --> 3 || nextLine() --> "3"
//        String firstRow = in.nextLine();
//        in.nextLine(); //throw awary rest of first line
//        //cout number of columns
//        int numCols = 0;
//        Scanner parse = new Scanner(firstRow);
//        while (parse.hasNextDouble()) {
//            parse.nextDouble();
//            numCols++;
//
//        }
//        //create our array and fill it with numbers from file
//        // check if it is symmetrical
//        System.out.println("numCols = %d\n" + numCols);
//        System.out.println("numRows = %d\n" + numRows);
//        int[][] twoDARR = new int[numRows][3];
//
//        for (int i = 0; i < 3; i++) { // rows
//            in.nextLine();
//            //this makes it go to the next line after the ints are added 3 times
//
//            for (int j = 0; j < 3; j++) { //cols
//
//                in.nextDouble();
//                twoDARR[i][j] = (int) in.nextDouble();
//
//                //needs to do three nex doubles
//            }
//
//
//        }
//
//    }
//}