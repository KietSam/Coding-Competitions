import java.util.*;
import java.io.*;
public class P9RaceRedo {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/1. contest_winter_2012/JudgesData/gender_race.dat")); //StudentData JudgesData
      int num = console.nextInt();
      console.nextLine();
      
      ArrayList<String> femaleNames = new ArrayList<String>();
      ArrayList<Integer> femaleTimes = new ArrayList<Integer>();
      
      ArrayList<String> maleNames = new ArrayList<String>();
      ArrayList<Integer> maleTimes = new ArrayList<Integer>();

      for (int a = 1; a <= num; a++) {
         String name= console.next();
         int time = console.nextInt();
         String gender = console.next();
         
         if (gender.equals("F")) {
            femaleNames.add(name);
            femaleTimes.add(time);
         }
         else {
            maleNames.add(name);
            maleTimes.add(time);
         }
      }
      
      ArrayList<Integer> sortedFTimes = new ArrayList<Integer>();
      ArrayList<Integer> sortedMTimes = new ArrayList<Integer>();
      for (int a: femaleTimes) sortedFTimes.add(a); 
      for (int a: maleTimes) sortedMTimes.add(a); 
      Collections.sort(sortedFTimes);
      Collections.sort(sortedMTimes);
      
      System.out.println(sortedFTimes.get(0)<sortedMTimes.get(0) ? femaleNames.get(femaleTimes.indexOf(sortedFTimes.get(0))) + " " + 
         sortedFTimes.get(0) + " F\n" +  maleNames.get(maleTimes.indexOf(sortedMTimes.get(0))) + " " + sortedMTimes.get(0) + " M": 
         maleNames.get(maleTimes.indexOf(sortedMTimes.get(0))) + " " + sortedMTimes.get(0) + " M\n" + 
         femaleNames.get(femaleTimes.indexOf(sortedFTimes.get(0))) + " " + sortedFTimes.get(0) + " F");
      System.out.println(femaleNames.get(femaleTimes.indexOf(sortedFTimes.get(0))) + " " + sortedFTimes.get(0) + " F");
      System.out.println(femaleNames.get(femaleTimes.indexOf(sortedFTimes.get(1))) + " " + sortedFTimes.get(1) + " F");
      System.out.println(maleNames.get(maleTimes.indexOf(sortedMTimes.get(0))) + " " + sortedMTimes.get(0) + " M");
      System.out.println(maleNames.get(maleTimes.indexOf(sortedMTimes.get(1))) + " " + sortedMTimes.get(1) + " M");
   } 
}

