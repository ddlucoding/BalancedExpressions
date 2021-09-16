package web_browser;

public class main_Browser {

    public static void main(String[] args){
        Browser[] obj_array = {new Browser_Version_2(), new Windows_Browser()};

        for (Browser object : obj_array)
            object.render();

    }
}
