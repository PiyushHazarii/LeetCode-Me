class Solution {
    int result=0;
    boolean check(int [] arr)
    {
        for(int a:arr)
        {
            if(a!=0)
            {
                return false;
            }
        }
        return true;
    }

    void solve(int[][] req,int[] arr,int ind,int count)
    {
        if(check(arr))
        {
            result=Math.max(result,count);
        }

        for(int i=ind;i<req.length;i++)
        {
          int addI=req[i][1];
          int removeI=req[i][0];

          arr[addI]=arr[addI]+1;
          arr[removeI]=arr[removeI]-1;

          solve(req,arr,i+1,count+1);

          arr[addI]=arr[addI]-1;
          arr[removeI]=arr[removeI]+1;
        }
    }
    public int maximumRequests(int n, int[][] requests) {
        int [] arr=new int[n];
        solve(requests,arr,0,0);
        return result;
    }
}