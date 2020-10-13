import java.util.*;
class Main
{   static boolean check(int ar[],int d,int c)
          {
              int x=1;
              int s=ar[0]+d;
              for(int i=1;i<ar.length;i++)
                  {
                      if(ar[i]>=s)
                        {
                            s=ar[i]+d;
                            x++;
                        }
                  }
                  if(c<=x)
                     return true;
                  else 
                     return false;
          }
        static int bs(int ar[],int l,int h,int d)
                {
                    l=ar[0];
                    h=ar[ar.length-1];
                    int mid=l+(h-l)/2;
                    while(l<=h)
                      {  mid=l+(h-l)/2;
                          if(check(ar,mid,d)==true && check(ar,mid+1,d)==false)
                             return mid;
                          else if(check(ar,mid,d)==false)
                                  h=mid-1;
                          else
                                l=mid+1;
                      }
                    return mid;
            
                }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		int N=sc.nextInt();
		int C=sc.nextInt();
		int ar[]=new int[N];
		for(int i=0;i<N;i++)
		    ar[i]=sc.nextInt();
		 Arrays.sort(ar);
		 System.out.println(bs(ar,0,0,C));
		}
	}
} 