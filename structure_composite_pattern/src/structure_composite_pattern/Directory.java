package structure_composite_pattern;

import java.util.ArrayList;

public class Directory extends FileSystemComponent {
   private ArrayList<FileSystemComponent> includedFiles = new ArrayList<>();

   public Directory(String name) {
      setName(name);
   }

   @Override
   public void print(String spacing) {
      System.out.printf("%sVerzeichnis: %s %n", spacing, getName());
      for (FileSystemComponent c : includedFiles) {
         c.print(spacing + "   ");
      }
   }

   public void add(FileSystemComponent component) {
      includedFiles.add(component);
   }

   public void remove(FileSystemComponent component) {
      includedFiles.remove(component);
   }

   public FileSystemComponent getComponent(int index) {
      return includedFiles.get(index);
   }

}
