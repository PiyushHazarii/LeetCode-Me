class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int x =0;
        for(int i=0;i<n;i++)
        { 
            if(operations[i].charAt(1)=='+')
            {
                x++;
            }
            else 
            {
                x--;
            }
        }
        return x;


        // for(int i=0;i<n;i++)
        // {
        // if(operations[i].equals("++X"))
        // {
        //     x++;
        // }
        // if(operations[i] .equals( "X++"))
        // {
        //     x++;
        // }
        // if(operations[i].equals("--X"))
        // {
        //     x--;
        // }
        // if(operations[i].equals ("X--"))
        // {
        //     x--;
        // }
        // }
        // return x;
    }
} 