package my_interface_project;

public class Main_printer {

    public static void main(String[]args){
        var printer = new Printer1(true, 3);
        var printer2 = new printer();
        printer2.show(printer);
        printer2.show(new Printer1(false, 321));


    }
}
