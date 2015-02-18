import java.util.*;
import java.io.*;
public class P4Taxation {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/Taxation.dat")); //StudentData JudgesData
      int num = console.nextInt();
      console.nextLine();
      double total = 0;
      for (int a = 1; a <= num; a++) {
         boolean tax = false;
         if (console.hasNextDouble() == false) {
            tax = true;
            console.next();
         }
         total += tax ? console.nextDouble() * 1.0825 : console.nextDouble();
      }
      System.out.printf("The total is $%.2f", total);
   } 
}

