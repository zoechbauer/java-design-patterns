package behavior_memento_pattern_exercise;

public class Memento {
   private String title;
   private String content;
   private String isbn;

   public Memento(String title, String isbn, String content) {
      this.title = title;
      this.isbn = isbn;
      this.content = content;
   }

   public String getTitle() {
      return title;
   }

   public String getContent() {
      return content;
   }

   public String getIsbn() {
      return isbn;
   }

}
