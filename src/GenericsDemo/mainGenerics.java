package GenericsDemo;

public class mainGenerics {
    public static void main(String[]args){
        NonGenericClass obj = new NonGenericClass();
        System.out.println(obj.compare(new User(1), new User(8)));
        var items = new GenericClass<Integer>(3);
        items.add(5);
        items.add(6);
        items.add(7);
        for (var item : items)
            System.out.println(item);
    }
}
