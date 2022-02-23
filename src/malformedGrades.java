import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class malformedGrades {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("malformedGrades.txt"));

        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
        String minName = null;
        String maxName = null;
        double total  = 0.0;
        int gradeCount = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        while (in.hasNextLine()){
            Scanner parser = new Scanner(in.nextLine());
            int grade = 0;
            String name = " ";
            while (parser.hasNext()){
            if(parser.hasNextInt()){
            grade = parser.nextInt();
            numList.add(grade);

            }else {
                name = name + " " + parser.next();
            }
            }
            parser.close();
        }
        Collections.sort(numList);
        System.out.println(numList);
//for(int j = 0; j < numList.size(); j++ ) {
//    for (int i = 0; i < numList.size(); i++) {
//        if (numList.get(0) > numList.get(i)) {
//            numList.set(0, numList.get(i));
//
//        }
//    }
//}
        System.out.println("new " + numList);
        //determine if this is a minimum or maximum grade
        //add this grade to average computation
        in.close();
    }
}
