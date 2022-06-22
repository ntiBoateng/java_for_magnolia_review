public class CheckPrime {

    public static boolean isPrime(int number){
        if(number == 2){
            return true;
        }else if(number < 2){
            return false;
        }
        for(int i = 2;i<number;i++){
            if(number % i ==0){
                return false;
            }
                
            

        }
        return true;
        
    }
    public static void main(String[] args) {
        System.out.println(isPrime(11));
    }
}
