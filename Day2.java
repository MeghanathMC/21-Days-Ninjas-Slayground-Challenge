
import java.util.*;
public class Day2 {

	public static int fibonocci(int num){
		if(num==0){
			return 0;
		}
		else if(num==1){
			return 1;
		}
		else{
			return fibonocci(num-1)+fibonocci(num-2);
		}
	}

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int ans =fibonocci(num);
		System.out.println(ans);

		
	}

}
