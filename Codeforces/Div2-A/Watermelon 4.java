import java.util.*;
public class Main
{   static String solve(int weight){
    if(weight<=2) return "No";
    if((weight&1)==0) return "Yes";
    return "No";
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int data=sc.nextInt();
		System.out.println(solve(data));
	}
}