package EGenerics;

public interface GenericDao<T> {
    void insert(T obj);
    void update(T object);

}
