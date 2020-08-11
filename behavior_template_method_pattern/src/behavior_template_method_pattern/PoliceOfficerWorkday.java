package behavior_template_method_pattern;

public class PoliceOfficerWorkday extends WorkdayPlanner {

   @Override
   public boolean isHoliday() {
      return true;
   }

   @Override
   void work() {
      System.out.println("Verkehrskontrollen durchführen...");
   }

}
