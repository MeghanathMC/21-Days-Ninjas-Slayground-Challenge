class Day1{

    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        double ans=0;
        switch(ch){
            case 1 : double r=a[0];
                    ans= Math.PI * r * r;
                    break;
            case 2 : double l=a[0];double b=a[1];
                        ans=l*b;
                        break;
            

        }
        return ans;

    }
}