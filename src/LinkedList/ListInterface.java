package LinkedList;

import java.util.function.Function;

public interface ListInterface<T> {
    void insert(T data);
    void insert(int pos ,T data);
    void print();
    T find(Function<T,Boolean> func);
    T delete(Function<T,Boolean> func);
}
