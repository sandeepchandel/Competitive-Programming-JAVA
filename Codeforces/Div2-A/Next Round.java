import java.util.*;
public class Main
{   static int solve(int n, int k, int arr[]){
    int value=arr[k-1];
    int result=0;
    for(int i=0;i<n;i++)
    {
        if(value==0)
        {
            if(arr[i]>value) result++;
        }
        else{
            
            if(arr[i]>=value) result++;
        }
    }
    return result;
}
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int k=sc.nextInt();
	   int ar[]=new int[n];
	   for(int i=0;i<n;i++){
	       ar[i]=sc.nextInt();
	   }
		System.out.println(solve(n,k,ar));
	}
}