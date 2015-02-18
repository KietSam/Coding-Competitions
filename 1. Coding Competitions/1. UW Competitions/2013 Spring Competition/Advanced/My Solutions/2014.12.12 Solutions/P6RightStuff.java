import java.util.*;
import java.io.*;
public class P6RightStuff {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/rightstuff.dat")); //StudentData JudgesData
      int num = console.nextInt();
      
      for (int a = 1; a <= num; a++) {
         double acceptedValue = console.nextDouble();
         double high = acceptedValue;
         double low = acceptedValue;
         int count = 1;
         double sum = acceptedValue;
         Scanner input = new Scanner(console.nextLine());
         while (input.hasNextDouble()) {
            count++;
            double temp = input.nextDouble();
            sum += temp;
            high = temp > high ? temp: high;
            low = temp < low ? temp: low;
         }
         double average = sum/count;
         if ((average >= acceptedValue * 0.95 && average <= acceptedValue * 1.05) && (high-low) <= average*.1) {
            System.out.println("Both");
         }
         else if (average >= acceptedValue * 0.95 && average <= acceptedValue * 1.05) {
            System.out.println("Accurate");
         }
         else if ((high-low) <= average*.1) {
            System.out.println("Precise");
         }
         else {
            System.out.println("Neither");
         }
      }
      
   } 
}

