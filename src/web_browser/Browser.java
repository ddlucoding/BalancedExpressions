package web_browser;

public abstract class Browser {

   private boolean power = true;
   private String text;

//   public Browser(boolean power){
//       this.power = power;
//   }

    public abstract void render();

   public void enable() {
       power = true;
   }

   public void disable() {
       power = false;
   }

   public boolean isEnabled() {
       return power;
   }

   public void setText(String prompt){
       text = prompt;
   }


   public String getText() {
       return text;
   }
}
