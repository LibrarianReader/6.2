import java.util.ArrayList;

public class MyArrayList {
    private Object[] value;
    private int size;

    public MyArrayList() {
        this(10);

    }

    public MyArrayList(int size) {
        value = new Object[size];
    }

    public int size() {
        return size;
    }

    public void add(Object obj) {
        value[size] = obj;
        size++;

        if (size >= value.length) {
            //Расширение
            int newCapacity = value.length * 2;
            Object[] newList = new Object[newCapacity];
            for (int i = 0; i < value.length; i++) {
                newList[i] = value[i];
            }

            value = newList;
        }
    }


    public Object get(int index) {
        rangeCheck(index);
        return value[index];
    }


    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            for (int i = 0; i < value.length; i++) {
                if (obj == value[i]) {
                    return i;
                }
            }
            return -1;
        }
    }


    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        } else {
            for (int i = value.length - 1; i >= 0; i--) {
                if (obj == value[i]) {
                    return i;

                }
            }
            return -1;
        }
    }

    public void rangeCheck(int index) {
        if (index < 0 || index > size - 1) {
            try {
                throw new Exception();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public Object set(int index, Object object) {
        rangeCheck(index);
        Object old = value[index];
        value[index] = object;
        return old;

    }
}