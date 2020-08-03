package creation_prototypePattern;

public class Program {

   /**
    * Create a Hospital Employee by Cloning and modifying
    * 
    * @param args
    * @throws CloneNotSupportedException
    */
   public static void main(String[] args) throws CloneNotSupportedException {
      HospitalEmployee employee1 = new HospitalEmployee("Franz", "Bauer",
            new Address("Krankenhausstraﬂe 7a", "4020", "Linz"), "Arzt");

      HospitalEmployee employee2 = employee1.clone();
      employee2.setFirstName("Franziska");
      employee2.setAddress(new Address("Schwesternstrasse 22", "4020", "Linz"));
      employee2.setPosition("Krankenschwester");

      System.out.println(employee1);
      System.out.println(employee2);
   }

}
