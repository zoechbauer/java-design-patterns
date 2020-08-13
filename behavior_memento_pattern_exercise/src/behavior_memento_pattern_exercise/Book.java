package behavior_memento_pattern_exercise;

public class Book {
   private String title;
   private String content;
   private String isbn;

   public Book(String title, String isbn) {
      this.title = title;
      this.isbn = isbn;
      content = "";
   }

   // getter/setter
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

   public String getIsbn() {
      return isbn;
   }

   public void setIsbn(String isbn) {
      this.isbn = isbn;
   }

   // memento
   public Memento setStateToMemento() {
      return new Memento(title, isbn, content);
   }

   public void getStateFromMemento(Memento memento) {
      title = memento.getTitle();
      isbn = memento.getIsbn();
      content = memento.getContent();
      System.out.println("Der ursprüngliche Zustand des Buches wurde wiederhergestellt");
   }

   @Override
   public String toString() {
      int extractedCharacters = Math.min(50, content.length());
      return String.format("Buch Titel: %s, ISBN=%s, Buchinhalt: %d Zeichen %nText-Anfang: %s%nText-Ende:   %s%n",
            title, isbn, content.length(), content.substring(0, extractedCharacters),
            content.substring(content.length() - extractedCharacters));
   }
}
