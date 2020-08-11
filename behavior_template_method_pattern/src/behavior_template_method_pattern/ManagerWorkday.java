package behavior_template_method_pattern;

public class ManagerWorkday extends WorkdayPlanner {

   @Override
   void work() {
      System.out.println("Meetings abhalten...");
   }

}
