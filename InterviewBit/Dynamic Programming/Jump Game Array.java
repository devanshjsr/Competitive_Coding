public class Solution {
    
    
    public int canJump(ArrayList<Integer> A) 
    {
        int last=A.size()-1;
        
        if(A.size()==1)
        {
            return 1;
        }
        
        for(int i=A.size()-2;i>=0;i--)
        {
            if((A.get(i)+i>=A.size()-1) || (A.get(i)+i>=last))
            {
                last=i;
            }
        }
        
        if(last==0)
        {
            return 1;
        }
        else
        {
           return 0; 
        }
        
        
    }
}
