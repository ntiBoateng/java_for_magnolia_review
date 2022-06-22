public class App {
String name;
int age;
char gender;
//creating a constructor for the class App
public App(String name, int age, char gender){
    this.name = name;
    this.age = age;
    this.gender = gender;
}

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        boolean haveMoney = false;
        System.out.println(haveMoney);
        final int year = 1995;
        System.out.println("I was born in the year "+year);

        App hello = new App("Gideon", 34,'M');
        System.out.println("Hello everyone, nice to meet you all my name is "+hello.name+" and I am "+hello.age+"yrs old and to talk about my gender, I am a "+hello.gender+" for male.");
    }
}
