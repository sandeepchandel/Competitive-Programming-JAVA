import java.util.*;
public class Main
{   static void sol(int i,int j,double l,int n,double data[][])
                {
                    if(n==0)
                      return;
                    data[i][j]+=l;
                    if(data[i][j]<=1.0)
                       return;
                    else
                     {
                         l=data[i][j]-1.0;
                         data[i][j]=1.0;
                         sol(i+1,j,l/2,n-1,data);
                         sol(i+1,j+1,l/2,n-1,data);
                     }
                }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double L=sc.nextDouble();
		double data[][]=new double[N][N];
		int c=0;
		sol(0,0,L,N,data);
		for(int i=0;i<N;i++)
		    for(int j=0;j<N;j++)
		      {
		          if(data[i][j]==1.0)
		            c++;
		      }
		System.out.println(c);
	}
}