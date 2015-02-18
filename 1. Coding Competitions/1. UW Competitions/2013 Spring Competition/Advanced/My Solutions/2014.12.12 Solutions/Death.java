public class Death implements Comparable<Death> {
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