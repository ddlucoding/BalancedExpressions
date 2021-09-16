package my_interface_project;

public class printer {

    public my_interface Printer;

//    public printer(my_interface newPrinter) {
//        this.Printer = newPrinter;
//    }
    public void show(my_interface Interface) {
        var new_Calculator = Interface.returnNumPages();
        System.out.println(new_Calculator);
    }

    public void setPrinter(my_interface printer) {
        Printer = printer;
    }
}
