package DoAnThuVien.service;
import java.util.*;

public class GenericRepository<T> {
    private Map<String, T> items;

    public GenericRepository() {
        items = new HashMap<>();
    }

    public void addItem(String id, T item) {
        items.put(id, item);
    }

    public void removeItem(String id) {
        items.remove(id);
    }

    public T getItem(String id) {
        return items.get(id);
    }

    public List<T> getAllItems() {
        return new ArrayList<>(items.values());
    }
}
