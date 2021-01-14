import java.util.*;
public class Main
{   
    // public static long lcm_of_array_elements(int[] element_array) 
    // { 
    //     long lcm_of_array_elements = 1; 
    //     int divisor = 2; 
          
    //     while (true) { 
    //         int counter = 0; 
    //         boolean divisible = false; 
              
    //         for (int i = 0; i < element_array.length; i++) { 
  
    //             // lcm_of_array_elements (n1, n2, ... 0) = 0. 
    //             // For negative number we convert into 
    //             // positive and calculate lcm_of_array_elements. 
  
    //             if (element_array[i] == 0) { 
    //                 return 0; 
    //             } 
    //             else if (element_array[i] < 0) { 
    //                 element_array[i] = element_array[i] * (-1); 
    //             } 
    //             if (element_array[i] == 1) { 
    //                 counter++; 
    //             } 
  
    //             // Divide element_array by devisor if complete 
    //             // division i.e. without remainder then replace 
    //             // number with quotient; used for find next factor 
    //             if (element_array[i] % divisor == 0) { 
    //                 divisible = true; 
    //                 element_array[i] = element_array[i] / divisor; 
    //             } 
    //         } 
  
    //         // If divisor able to completely divide any number 
    //         // from array multiply with lcm_of_array_elements 
    //         // and store into lcm_of_array_elements and continue 
    //         // to same divisor for next factor finding. 
    //         // else increment divisor 
    //         if (divisible) { 
    //             lcm_of_array_elements = lcm_of_array_elements * divisor; 
    //         } 
    //         else { 
    //             divisor++; 
    //         } 
  
    //         // Check if all element_array is 1 indicate  
    //         // we found all factors and terminate while loop. 
    //         if (counter == element_array.length) { 
    //             return lcm_of_array_elements; 
    //         } 
    //     } 
    // } 
    static void fillThisArray(int arr[],String N)
    {   Arrays.fill(arr,1);
        for(int i=0;i<N.length();i++)
		    {
		        if(N.charAt(i)!='0')
		        {   int data=Integer.parseInt(String.valueOf(N.charAt(i)));
		            arr[data]=data;
		        }
		    }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0){
		    String N=sc.nextLine();
		    int arr[]=new int[10];
		    Arrays.fill(arr,1);
		    int x=0;
		    
		    //long data=lcm_of_array_elements(arr);
		    long file=Long.parseLong(N);
		     outer: while(true){
		         boolean value=true;
		         fillThisArray(arr,Long.toString(file));
		        for(int i=1;i<10;i++){
		            if(file%arr[i]!=0) value=false;
		        }
		        if(value==true)
		           break outer;
		        else file++;
		    }
		    System.out.println(file);
		}
	}
}