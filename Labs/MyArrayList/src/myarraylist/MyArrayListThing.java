public class MyArrayListThing {

    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList();

        for (int i = 0; i < 10; i++) {
            list.add(43 + i);
        }

        display(list);
        
        //list.add(4);  // overfills!
    }

    private static void display(MyArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("list.get(" + i + ") = " + list.get(i));
        }
    }
    
}
    
public class MyArrayList<T> {

    final static int INITIAL_CAPACITY = 10;
    Object[] list;
    int last;
    int capacity;

    MyArrayList() {
        list = new Object[10];
        last = -1;
        capacity = INITIAL_CAPACITY;
    }

    T get(int i) {
        return (T) list[i];
    }

    void add(T nuOne) {
        if (size() >= capacity) {
            doubleCapacity();
        }
        
        list[++last] = nuOne;  // you know there is space now!
    }

    public int size() {
        return last + 1;
    }

    private void doubleCapacity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}