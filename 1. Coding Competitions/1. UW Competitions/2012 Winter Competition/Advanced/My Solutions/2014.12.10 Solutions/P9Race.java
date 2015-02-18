import java.util.*;
import java.io.*;
public class P9Race {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/gender_race.dat")); //StudentData JudgesData
      int num = console.nextInt();
      console.nextLine();
      
      String winner = "";
      String second = "";
      String fastFemale = "";
      String secondFastFemale = "";
      String fastMale = "";
      String secondFastMale = "";
      
      int winnerTime = 10000000;
      int secondTime = 10000000;
      int fastFemaleTime = 10000000;
      int secondFastFemaleTime = 10000000;
      int fastMaleTime = 10000000;
      int secondFastMaleTime = 10000000;
      
      for (int a = 1; a <= num; a++) {
         String name = console.next();
         int time = console.nextInt();
         String gender = console.next();
         if (gender.equals("M")) {
            if (time < winnerTime) {
               secondTime = winnerTime;
               second = winner;
               winnerTime = time;
               winner = name + " " + time + " " + gender;
            }
            else if (time < secondTime) {
               secondTime = time;
               second = name + " " + time + " " + gender;
            }
            if (time < fastMaleTime) {
               secondFastMale = fastMale;
               secondFastMaleTime = fastMaleTime;
               fastMaleTime = time;
               fastMale = name + " " + time + " " + gender;
            }
            else if (time < secondFastMaleTime){
               secondFastMaleTime = time;
               secondFastMale = name + " " + time + " " + gender;
            }
         }
         else if (gender.equals("F")) {
            if (time < winnerTime) {
               secondTime = winnerTime;
               second = winner;
               winnerTime = time;
               winner = name + " " + time + " " + gender;
            }
            else if (time < secondTime) {
               secondTime = time;
               second = name + " " + time + " " + gender;
            }
            if (time < fastFemaleTime) {
               secondFastFemale = fastFemale;
               secondFastFemaleTime = fastFemaleTime;
               fastFemaleTime = time;
               fastFemale = name + " " + time + " " + gender;
            }
            else if (time < secondFastFemaleTime){
               secondFastFemaleTime = time;
               secondFastFemale = name + " " + time + " " + gender;
            }
         }
      }

      System.out.println(winner);
      System.out.println(second);
      System.out.println(fastFemale);
      System.out.println(secondFastFemale);
      System.out.println(fastMale);
      System.out.println(secondFastMale);
   } 
}

