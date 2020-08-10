package behavior_observer_pattern;

public class Newsletter {
   private String topic;
   private String content;

   public Newsletter(String topic, String content) {
      this.topic = topic;
      this.content = content;
   }

   public String getTopic() {
      return topic;
   }

   public void setTopic(String topic) {
      this.topic = topic;
   }

   public String getContent() {
      return content;
   }

   public void setContent(String content) {
      this.content = content;
   }

}
