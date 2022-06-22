import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> myArr = new ArrayList<Integer>(5);
        myArr.add(23);
        myArr.add(34);
        myArr.remove(1);
        System.out.println(myArr.size());

        // Arrays that holds different values
        ArrayList names = new ArrayList<>();
        names.add("Emma");
        names.add(34);
        System.out.println(names);

        System.out.println("");
        ArrayList<String> females = new ArrayList<String>();
        females.add("Freda");
        females.add("Jennifer");
        females.add("Constance");
        females.add("Jossy Nursn");
        System.out.println(females.get(2));

        //changing values in ArrayList
        females.set(1, "Grace");
        females.set(2, "Gifty");
        System.out.println(females);

        //locating index of an item
        System.out.println(females.indexOf("Grace"));
    }
}
