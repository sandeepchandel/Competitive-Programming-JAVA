import java.util.*;
public class Main
{   public static String sortString(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
          
        Arrays.sort(tempArray); 
          
        return new String(tempArray); 
    } 
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int T=sc.nextInt();
     while(T-->0)
     {
         int N=sc.nextInt();
         sc.nextLine();
         String st=sc.nextLine();
         System.out.println(sortString(st));
     }
	}
}