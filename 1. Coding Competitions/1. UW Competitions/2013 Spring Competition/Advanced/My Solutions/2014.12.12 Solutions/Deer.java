public class Deer implements Comparable {
   int id;
   boolean alive = true;
   String causeOfDeath;
   
   public Deer (int id, String status) {
      this.id = id;
      
   }
   public Deer (int id, String status, String death) {
      this.id = id;
      if (status.equals("DEAD")) {
         alive = false;
      }
   }
   
   public int compareTo (Deer a) {
   
   }
}