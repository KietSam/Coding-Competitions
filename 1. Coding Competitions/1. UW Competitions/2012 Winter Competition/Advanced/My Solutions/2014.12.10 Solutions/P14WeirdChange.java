import java.util.*;
import java.io.*;
public class P14WeirdChange {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/weirdChange.dat")); //StudentData JudgesData
      int num = console.nextInt();
      
      for (int a = 1; a <= num; a++) {
         int progs = console.nextInt();
         System.out.printf("$%.2f ", progs*.03);
         ArrayList<int[]> arr = new ArrayList<int[]>();
         for (int x = 0; x < 6; x++) {
            int [] temp = new int[6];
            int progs2 = progs;
            for (int y = x; y < 6; y++) {
               if (y == 0) {
                  temp[0] = progs2/47;
                  progs2 = progs2 - temp[0]*47;
               }
               else if (y == 1) {
                  temp[1] = progs2/37;
                  progs2 = progs2 - temp[1]*37;
               }
               else if (y == 2) {
                  temp[2] = progs2/23;
                  progs2 = progs2 - temp[2]*23;
               }
               else if (y == 3) {
                  temp[3] = progs2/13;
                  progs2 = progs2 - temp[3]*13;
               }
               else if (y == 4) {
                  temp[4] = progs2/5;
                  progs2 = progs2 - temp[4]*5;
               }
               else if (y == 5) {
                  temp[5] = progs2/1;
                  progs2 = progs2 - temp[5]*1;
               }
            }
            arr.add(temp);
            //System.out.println(Arrays.toString(temp));
         }
         int[] shortest = new int[6];
         int min = 100;
         for (int[] b : arr) { //47 37 23 13 5 1
            int tempMin = 0;
            for (int c : b) {
               tempMin += c;
            }
            if (tempMin < min) {
               min = tempMin;
               shortest=b;
            }
         }
         System.out.println(Arrays.toString(shortest).replace(",","").replace("[","").replace("]",""));
      }
      
      
   } 
   
   public static int[] recursion () {
      return new int[2];
   }
   
}

