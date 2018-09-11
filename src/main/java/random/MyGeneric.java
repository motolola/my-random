package random;

import java.util.List;

public class MyGeneric<T> {
    private List<T> values;

    void add(T value){
        values.add(value);
    }

    void remove(T value){
        values.remove(value);
    }
    T get(int index) {
        return values.get(index);
    }
}
