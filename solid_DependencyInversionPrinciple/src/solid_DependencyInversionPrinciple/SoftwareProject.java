package solid_DependencyInversionPrinciple;

import java.util.List;

public class SoftwareProject {

   // This implementation violates against the Dependency Inversion Principle
   // because classes are interdependent

//   private JavaDeveloper backendDeveloper = new JavaDeveloper();
//   private JavaScriptDeveloper frontendDeveloper = new JavaScriptDeveloper();
//
//   public void implement() {
//      backendDeveloper.writeJavaCode();
//      frontendDeveloper.writeJavaScriptCode();
//   }

   private List<Developer> developers;

   public SoftwareProject(List<Developer> developers) {
      this.developers = developers;
   }

   public void implement() {
      for (Developer dev : developers) {
         dev.develop();
      }
   }

}
