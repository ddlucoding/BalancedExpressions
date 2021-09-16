package web_browser;

public class Browser_Version_2 extends Browser {
    private String text = "";

//    public Browser_Version_2(){
//        super(true);
//
//    }


    @Override
    public void render() {
        System.out.println("Browser_Version_2");
    }

    @Override
    public String getText() {
        return text;
    }


}
