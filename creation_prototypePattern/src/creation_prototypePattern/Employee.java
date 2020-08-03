package creation_prototypePattern;

public abstract class Employee implements Cloneable {
   private String firstName;
   private String lastName;
   private Address address;

   public Employee(String firstName, String lastName, Address address) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.address = address;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public Address getAddress() {
      return address;
   }

   public void setAddress(Address address) {
      this.address = address;
   }

   @Override
   public String toString() {
      return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
   }

   @Override
   public Employee clone() throws CloneNotSupportedException {
      try {
         Employee empCopy = (Employee) super.clone();
         empCopy.address = empCopy.address.clone();
         return empCopy;
      } catch (CloneNotSupportedException e) {
         System.err.println("Employee konnte nicht geklont werden");
         e.printStackTrace();
      }
      return null;
   }
}
