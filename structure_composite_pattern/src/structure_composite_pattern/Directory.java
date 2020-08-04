package structure_composite_pattern;

import java.util.ArrayList;

public class Directory extends FileSystemComponent {
   private ArrayList<FileSystemComponent> includedFiles = new ArrayList<>();

   public Directory(String name) {
      this.setName(name);
   }

   @Override
   public void print(String spacing) {
      System.out.printf("%sVerzeichnis: %s %n", spacing, this.getName());
      for (FileSystemComponent c : this.includedFiles) {
         c.print(spacing + "   ");
      }
   }

   public void add(FileSystemComponent component) {
      this.includedFiles.add(component);
   }

   public void remove(FileSystemComponent component) {
      this.includedFiles.remove(component);
   }

   public FileSystemComponent getComponent(int index) {
      return this.includedFiles.get(index);
   }

}
