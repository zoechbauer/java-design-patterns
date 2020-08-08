package behavior_memento_pattern_exercise;

public class Program {

   public static void main(String[] args) {
      Caretaker bookCaretaker = new Caretaker();

      Book book = new Book("Java Design Patterns", "978-1-4842-4077-9");
      System.out.println(book);

      book.setContent(
            "Get hands-on experience implementing 26 of the most common design patterns using Java and Eclipse.");
      System.out.println(book);

      bookCaretaker.saveMemento(book);

      book.setContent(
            "Get hands-on experience implementing 26 of the most common design patterns using Java and Eclipse. "
                  + "In addition to Gang of Four (GoF) design patterns, you will also learn about alternative design patterns, "
                  + "and understand the criticisms of design patterns with an overview of anti-patterns. "
                  + "For each pattern you will see at least one real-world scenario, a computer-world example, "
                  + "and a complete implementation including output.");
      System.out.println(book);

      // restore
      bookCaretaker.restoreMemento(book);
      System.out.println(book);
   }
}

//Output Console
//Buch Titel: Java Design Patterns, ISBN=978-1-4842-4077-9, Buchinhalt: 0 Zeichen 
//Text-Anfang: 
//Text-Ende:   
//
//Buch Titel: Java Design Patterns, ISBN=978-1-4842-4077-9, Buchinhalt: 98 Zeichen 
//Text-Anfang: Get hands-on experience implementing 26 of the mos
//Text-Ende:   ost common design patterns using Java and Eclipse.
//
//Buch Titel: Java Design Patterns, ISBN=978-1-4842-4077-9, Buchinhalt: 426 Zeichen 
//Text-Anfang: Get hands-on experience implementing 26 of the mos
//Text-Ende:   e, and a complete implementation including output.
//
//Der ursprüngliche Zustand des Buches wurde wiederhergestellt
//Buch Titel: Java Design Patterns, ISBN=978-1-4842-4077-9, Buchinhalt: 98 Zeichen 
//Text-Anfang: Get hands-on experience implementing 26 of the mos
//Text-Ende:   ost common design patterns using Java and Eclipse.
