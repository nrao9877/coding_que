class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int res[]=new int[nums.length];
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(index[i],nums[i]);
        }
        int k=0;
        for(int i=0;i<al.size();i++)
        {
            res[k]=al.get(i);
            k++;
        }
       
        return res;
    }
}