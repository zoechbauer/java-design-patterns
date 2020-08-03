package creation_prototypePattern;

public class HospitalEmployee extends Employee {
   private String position;

   public HospitalEmployee(String firstName, String lastName, Address address, String position) {
      super(firstName, lastName, address);
      this.position = position;
   }

   public String getPosition() {
      return position;
   }

   public void setPosition(String position) {
      this.position = position;
   }

   @Override
   public String toString() {
      return super.toString() + " [position=" + position + "]";
   }

   @Override
   public HospitalEmployee clone() throws CloneNotSupportedException {
      return (HospitalEmployee) super.clone();
   }

}
