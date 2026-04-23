public class DynamicStringList implements StringList {
    int size;
    int capacity;

    public DynamicStringList(int size, int capacity) {
        this.size = size;
        this.capacity = capacity;
    }

    public String get(int index) {
        return "";
    }

    public void set(int index, String value) {

    }

    public void add(String value) {

    }

    public String remove(int index) {
        return "";
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }
}