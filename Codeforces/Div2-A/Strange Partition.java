import java.util.*;
public class Main
{   static void solve(int n, double k, long arr[]){
    long result=0;
    double min=0;
    double max=0;
    for(int i=0;i<n;i++)
    {
        max+=(long)(Math.ceil(arr[i]/k));
        result+=arr[i];
    }
    min=(long)Math.ceil(result/k);
    System.out.println((long)min+" "+(long)max);
}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int T=sc.nextInt();
	   while(T-->0){
	   int n=sc.nextInt();
	   double k=sc.nextInt();
	   long ar[]=new long[n];
	   for(int i=0;i<n;i++){
	       ar[i]=sc.nextInt();
	   }
	     solve(n,k,ar);
	   }
	}
}