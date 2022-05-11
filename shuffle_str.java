class Solution {
    public String restoreString(String s, int[] indices) {
       /* 
        String ans="";
        for(int i=0;i<indices.length;i++)
        {
            ans+=s.charAt(indices[i]);
        }
        return ans;*/
        String ans="";
        int n=s.length();
       // char ch[]=new char[n];
        char ch[]=new char[n];
        for(int i=0;i<indices.length;i++)
        {
            int m=indices[i];
            ch[m]=s.charAt(i);
           
        }
        for(char c:ch)
        {
            ans+=c;
        }
        return ans;
        
    }
}