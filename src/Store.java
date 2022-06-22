public class Store {
    String loc ;
    String nme;
    int yr;
    public Store(String name, String location, int age){
        nme = name;
        loc = location;
        yr = age;
    }

    public String toString(){
        return "This is a general info about the Class we are creating";
    }
    public void Story(){
        System.out.println("This Store was built by to old men "+ this.nme);
    }

    public String Drive(String name){
        return "This is coming from "+name;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Glad go");

        Store store = new Store("Maa Peace","Anyinam",23);
        store.Story();
        System.out.println(store.Drive("Aladdin"));
        System.out.println(store);


        //Conditionals review
        String name = "Mansah";
        if(name.equals("Erica")){
            System.out.println("This is incorrect");
        }else{
            System.out.println("Good one there "+name);
        }

    }
}
