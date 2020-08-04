package structure_composite_pattern;

public class File extends FileSystemComponent {
   private String owner;

   public File(String name, String owner) {
      this.setName(name);
      this.owner = owner;
   }

   @Override
   public void print(String spacing) {
      System.out.printf("%sDatei: %s (erstellt von %s)%n", spacing, this.getName(), this.owner);
   }

   @Override
   public String toString() {
      return String.format("Datei: %s (erstellt von %s)%n", this.getName(), this.owner);
   }

}
