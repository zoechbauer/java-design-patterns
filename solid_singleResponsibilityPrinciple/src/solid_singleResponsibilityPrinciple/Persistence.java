package solid_singleResponsibilityPrinciple;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistence {

   public void saveToDisk(ArrayList<String> list, File fileName) {
      PrintWriter pw = null;
      try {
         pw = new PrintWriter(new FileWriter(fileName));
         pw.println(list);
      } catch (IOException e) {
         e.printStackTrace();
      } finally {
         if (pw != null)
            pw.close();
      }
   }
}
