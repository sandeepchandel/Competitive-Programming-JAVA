import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    sc.nextLine();
		    String str=sc.nextLine();
		    int count=0;
		    for(int i=N-1;i>=0;i--)
		    {
		        if(str.charAt(i)==')')
		          count++;
		        else{break;}
		    }
		    if(count>(N-count))
		      System.out.println("Yes");
		    else 
		     System.out.println("No");
		}
	}
}
