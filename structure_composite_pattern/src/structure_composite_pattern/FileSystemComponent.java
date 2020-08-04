package structure_composite_pattern;

public abstract class FileSystemComponent {
   private String name;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public abstract void print(String spacing);
}
