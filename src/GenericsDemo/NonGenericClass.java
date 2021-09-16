package GenericsDemo;

public class NonGenericClass {
    public <T extends Comparable<T>> T compare(T first, T second) {
        T variable = null;
        if (first.compareTo(second)>0)
            variable = second;
        if (first.compareTo(second)<0)
            variable = first;
        else
            variable = second;
        return variable;
    }
}
