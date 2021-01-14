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
	    int result=0;
	    ArrayList<Integer> al=new ArrayList<>();
	    while(data-->0){
		for(int i=0;i<3;i++){
		    int value=sc.nextInt();
		    if(value==1) al.add(value);
		}
		if(al.size()>1) result++;
	        al.clear();
	    }
		System.out.println(result);
	}
}