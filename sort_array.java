class Solution {
    public int[] sortArrayByParity(int[] nums) {
       /* int l=0;
        int r=nums.length-1;
        int temp;
        while(l<r)
        {
            if(nums[l]%2!=0 && nums[r]%2==0)
            {
                temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
            }
            else if(nums[l]%2==0)
            {
                l++;
            }
            else if(nums[r]%2!=0)
            {
                r--;
            }
        }
        return nums;*/
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]%2==0)
                {
                    even.add(nums[i]);
                }
                else
                {
                    odd.add(nums[i]);
                }
            }
        int res[]=new int[nums.length];
      //  int k=0;
        int cnt=0;
        for(int i=0;i<even.size();i++)
        {
            res[cnt]=even.get(i);
            cnt++;
        }
        int m=cnt;
        for(int i=0;i<odd.size();i++)
        {
            res[m]=odd.get(i);
            m++;
                
        }
        return res;
        
    }
}