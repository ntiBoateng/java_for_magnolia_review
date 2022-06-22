import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.tree.MutableTreeNode;

public class Loops {

    public Loops(){

    }
    public String GetData(){
        Scanner scan = new Scanner(System.in);
        String passcode = scan.next();
        return passcode;
    }

public static String sayHello(String names){
    return "Hello "+names;
}

    public static void main(String[] args) {
        int num = 9;
        while (num>5){
            System.out.println(num);
            num --;
        }

        Loops loop = new Loops();
        //loop.GetData();
        String password = "aladdin";
        while(password != "aladdin"){
            System.out.println("You need to enter a correct password");
            password = loop.GetData();
        }
    //for loops
    for(int i=0;i<5;i++){
        System.out.println("Hello Gideon");
    }


    ArrayList<String> myNames = new ArrayList<String>();
        myNames.add("Erica");
        myNames.add("Lucy");
        myNames.add("Jemima");
        myNames.add("Abigail");
        myNames.add("LInda");
        for(int i=0;i<myNames.size();i++){
            System.out.println(myNames.get(i));
        }

        for(String nm : myNames){
            System.out.println(nm+" is my friend");
        }
    System.err.println(myNames.size());

for(int i=0;i<=10;i++){
    if((i % 2) ==0){
        continue;
    }else{
        System.out.println(i);
    }
}
System.out.println(sayHello("Gideon"));
    }


       
  
}
