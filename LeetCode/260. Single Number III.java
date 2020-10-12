class Solution {
    public int[] singleNumber(int[] nums) {
        int l=nums.length;
        int val=nums[0];
        for(int i=1;i<l;i++)
        {
            val=val^nums[i];
        }
        int data=1;
        while((data&val)==0)
        {
            data=data<<1;
        }
        boolean b1=false;
        boolean b2=false;
        int ar[]=new int[2];
        for(int i=0;i<l;i++)
        {
            if((data&nums[i])==0)
            {  if(b1==false)
               {ar[0]=nums[i];
                b1=true;
               }
               else{
                   ar[0]=ar[0]^nums[i];
               }
            }
            else
            {
                if(b2==false)
               {ar[1]=nums[i];
                b2=true;
               }
               else{
                   ar[1]=ar[1]^nums[i];
               }
            }
        }
        return ar;
    }
}