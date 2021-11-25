import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList(2);

        list.add(new Human("name"));
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        ArrayList list2;

        Human h = (Human) list.get(2);
        System.out.println(h.getName());
        System.out.println(list.get(1));
        System.out.println(list.get(4));
        System.out.println(list.size());

    }
}