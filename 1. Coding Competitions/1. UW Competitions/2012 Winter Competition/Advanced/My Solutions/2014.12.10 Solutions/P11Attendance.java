import java.util.*;
import java.io.*;
public class P11Attendance {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner 
         (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/attendance.dat")); //StudentData JudgesData
      int totalEnroll = 0;
      int totalTardies = 0;
      
      
      double [] attendance = new double[7];
      for (int a = 1; a <= 6; a++) {
         int students = console.nextInt();
         int absent = console.nextInt();
         int tardies = console.nextInt();
         
         totalEnroll += students;
         totalTardies += tardies;
         
         attendance[a] = (double)absent/students;
      }
      
      int bestAttendance = 1;
      for (int a = 2; a <= 6; a++) {
         if (attendance[a] < attendance[bestAttendance]) {
            bestAttendance = a;
         }
      }
      double [] sorted = new double[7];
      
      for (int x = 1; x <= 6; x++) {
         sorted[x] = attendance[x];
      }
      Arrays.sort(sorted);
      
      System.out.println(totalEnroll);
      System.out.println(totalTardies);
      System.out.println(bestAttendance);
      for (int x = 1; x <= 6; x++) {
         for (int a = 1; a <= 6; a++) {
            if (sorted[x] == attendance[a]) {
               System.out.print(a + " ");
               attendance[a] = 2;
               a = 7;
            }
         }
      }
      
      
   } 
}

