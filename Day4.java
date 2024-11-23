public class Day4 {

    public static boolean isPrime(int n) {
        //Your code goes here
        if(n==1){
            return false;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if( n%i==0 ){
                return false;
            }
        }
        return true;
    }
}
