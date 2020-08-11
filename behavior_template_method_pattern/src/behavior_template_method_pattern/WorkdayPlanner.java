package behavior_template_method_pattern;

public abstract class WorkdayPlanner {

   public void createWorkdayPlan() {
      morningToilet();
      breakfast();
      if (!isHoliday()) {
         work();
      }
      dinner();
      freeTimeActivities();
   }

   abstract void work();

   public boolean isHoliday() {
      return false;
   }

   public void morningToilet() {
      System.out.println("Morgentoilette...");
   }

   public void breakfast() {
      System.out.println("Frühstück...");
   }

   public void dinner() {
      System.out.println("Abendessen...");
   }

   public void freeTimeActivities() {
      System.out.println("Freizeit-Aktivitäten...");
   }

}
