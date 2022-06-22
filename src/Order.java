import java.util.Arrays;

public class Order {
String nam;
int pri;
String des;
//constructor method
public Order(String name, int price, String destination){
    nam = name;
    pri = price;
    des = destination;
}

public void description(){
    System.out.println("We are offering you with "+ priceVerify());
}
public int priceVerify(){
    if(pri >= 54){
        return 23;
    }else{
        return 50;
    }
}

public String[] getTopics(){
    String[] topics = {"Science","E-math","Economics","Social Studies"};
    return topics;
}

    public static void main(String[] args) {
        Order order = new Order("Express", 34, "Bantama");
        order.description();

        String[] topics = order.getTopics();
        System.out.println(topics[0]);
        System.out.println(Arrays.toString(topics));

        int[] numbers = new int[5];
        numbers[0] = 12;
        numbers[1] = -5;
        numbers[2] = 98;
        numbers[3] = 12;
        numbers[4] = 45;
        System.out.println(Arrays.toString(numbers));

        //knowing more about main(String[] args){}
        System.out.println("Hello "+args[1]);
    }
}
