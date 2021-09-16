package point;

import java.util.ArrayList;

public class main_Point {

    public static void main(String[]args){
        var point1 = new Point(1,2);
        var point2 = new Point(1,2);

        var list = new ArrayList<Integer>();
        list.add(5);

        System.out.println(point1.equals(list));

    }
}
