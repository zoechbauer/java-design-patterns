package structure_composite_pattern;

public class Program {

   public static void main(String[] args) {
      // create dirs and files
      Directory test = new Directory("TestVerzeichnis");

      Directory subdir1 = new Directory("Unterverzeichnis 1");
      test.add(subdir1);

      File file1 = new File("Datei 1", "Hans");
      File file2 = new File("Datei 2", "Hendrik");
      subdir1.add(file1);
      subdir1.add(file2);

      Directory subdir2 = new Directory("Unterverzeichnis 2");
      test.add(subdir2);

      File file3 = new File("Datei 3", "Hendrik");
      File file4 = new File("Datei 4", "Hendrik");
      subdir2.add(file3);
      subdir2.add(file4);

      Directory subdir3 = new Directory("Unterverzeichnis 3");
      subdir1.add(subdir3);

      File file5 = new File("Datei 5", "Franz");
      subdir3.add(file5);

      // print all dirs and files
      test.print("");

      // remove file and print whole structure
      System.out.println();
      subdir3.remove(file5);
      test.print("");

      // print a specific file
      System.out.println();
      System.out.println(subdir1.getComponent(1));

   }

}
