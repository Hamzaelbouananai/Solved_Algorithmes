import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> tot = new ArrayList<>();
        int test,test2;
         Double result =0.0 ;

        if (nums1 !=null || nums2 != null)
        {
          int comt1=nums1.length;
          int comt2=nums2.length;
          
          if(nums1 != null)
          {
              for(int i =0;i<comt1;i++)
              {
                tot.add(nums1[i]);
                }

          }   

           if(nums2 != null)
          {
              for(int i =0;i<comt2;i++)
              {
                tot.add(nums2[i]);
                }

          }   
           
          Collections.sort(tot);
          int length =tot.size();
          int check=length % 2; 
          int exec =0;
       
         if(check==0)
         {
               exec =length/2;
             int res=exec-1;
        result = (tot.get(exec) + tot.get(res)) / 2.0;

        
           
         }
         else
         {
              exec =(length-1)/2;
           result = tot.get(exec).doubleValue();

         }
              

        }
    
        return result;
    }
}