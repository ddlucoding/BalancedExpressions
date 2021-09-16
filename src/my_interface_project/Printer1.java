package my_interface_project;

public class Printer1 implements my_interface {

    public boolean state;
    public int printNumPages;

    public Printer1(boolean state, int printNumPages) {
        this.state = state;
        this.printNumPages = printNumPages;
    }

    @Override
    public int returnNumPages() {
        return printNumPages;
    }
}
