class Day3{
    public static int countDigits(int n){
        // Write your code here.
        int count=0;
        while(n>0){
            
            count++;
            n=n/10;
        }
        return count;
    }
}