package LinkedList;

import java.util.function.Function;

public interface ListInterface<T> {
    void insert(T data);
    void insert(int pos ,T data);
    void print();
    public T find(Function<T,Boolean> func);
    public T delete(Function<T,Boolean> func);
}
