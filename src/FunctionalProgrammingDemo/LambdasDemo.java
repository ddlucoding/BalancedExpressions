package FunctionalProgrammingDemo;

public class LambdasDemo {
    public static void main(String[]args) {
        show();
    }
    public static void show() {
        greet(new ConsolePrinter());
    }
    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
