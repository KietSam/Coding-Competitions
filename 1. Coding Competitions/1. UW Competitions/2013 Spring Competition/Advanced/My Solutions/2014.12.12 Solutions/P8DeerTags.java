import java.util.*;
import java.io.*;
public class P8DeerTags {
   public static void main (String[] args) throws FileNotFoundException {
      Scanner console = new Scanner (new File("E:/Google Drive/Cleveland/3. Senior Year/8. Computer Competition/2. contest_spring_2013/JudgesData/deertags.dat")); //StudentData JudgesData
      int[] count = new int[5];
      String[] types = {"ALIVE", "MOUNTAIN LION", "NATURAL CAUSES", "COYOTE", "BEAR"};
      while (console.hasNextLine()) {
         String tag = console.next().substring(1);
         count[0] = Integer.parseInt(tag)>count[0] ? Integer.parseInt(tag) : count[0];
         String status = console.next();
         if (status.equals("DEAD")){
            console.next();
            String animal = console.nextLine().substring(1);
            for (int x = 1; x < 5; x++) {
               if (types[x].equals(animal)){
                  count[x]++;
               }
            }
         }
      }
      int dead = 0;
      for (int x = 1; x < 5; x++) {
         dead+=count[x];
      }
      ArrayList<Death> temp = new ArrayList<Death>();
      for (int x = 1; x < 5; x++) {
         temp.add(new Death(count[x], types[x], count[0]));
      }
      Collections.sort(temp);
      Collections.reverse(temp);
      System.out.println("ALIVE " + Math.round((count[0]-dead)/(double)count[0]*100) + "%");
      for (Death a : temp) {
         System.out.println(a.toString() + "%");
      }
     
   } 
}

class Death implements Comparable<Death> {
   int deathCount;
   String by;
   int total;
   int percent;
   public Death (int deathCount, String predator, int total) {
      by = predator;
      this.deathCount = deathCount;
      this.total = total;
      getPercent();
   }
   public void getPercent () {
      percent = (int)Math.round((double)deathCount/total*100);
   }
   public String toString () {
      return by + " " + percent;
   }
   public int compareTo (Death a) {
      if (this.percent == a.percent) {
         return 0;
      }
      else if (this.percent > a.percent) {
         return 1;
      }
      else {
         return -1;
      }
   }
}

