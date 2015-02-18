import java.util.*;
import java.io.*;
public class P3ForeignShoes {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/ForeignShoes.dat")); //StudentData JudgesData
      int num = console.nextInt();
      console.nextLine();
      
      for (int a = 1; a <= num; a++) {
         String gender = console.next();
         String country = console.next();
         int shoeSize = console.nextInt();
         System.out.print(gender + " ");
         System.out.print(country.equals("US") ? "UK " : "US ");
         if (gender.equals("Women")) {
            System.out.println(country.equals("US") ? shoeSize-2 : shoeSize+2);
         }
         else {
            System.out.println(country.equals("US") ? shoeSize-1 : shoeSize+1);
         }
      }
      
   } 
}

