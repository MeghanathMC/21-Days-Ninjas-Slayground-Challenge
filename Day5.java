public class Day5 {

    public static int isSorted(int n, int []a) {
        // Write your code here.
        int ans=1;
        for(int i=0;i<n-1;i++){
            if(a[i]<=a[i+1]){
                continue;
            }
            ans=0;
        }
        return ans;
    }
    
}
