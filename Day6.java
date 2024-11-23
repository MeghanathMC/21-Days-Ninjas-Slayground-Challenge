class Day6{
    public static int reverseNumber(int n) {
        // Write your code here
        int rev=0;
        while(n>0){
            int temp=n%10;
            rev=temp+rev*10;
            n=n/10;

        }

        return rev;
    }
}