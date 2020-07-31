package solid_DependencyInversionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Program {

   public static void main(String[] args) {
      List<Developer> developers = new ArrayList<Developer>();
      developers.add(new JavaDeveloper());
      developers.add(new JavaScriptDeveloper());

      SoftwareProject project = new SoftwareProject(developers);
      project.implement();
   }

}
