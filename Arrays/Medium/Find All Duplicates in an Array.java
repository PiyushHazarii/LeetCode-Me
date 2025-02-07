class Solution {
    public List<Integer> findDuplicates(int[] nums) {

            // Brute force method does not work because time limit exceeded other wise
            // my code is very much suitable for brute force.

    // List<Integer> list = new ArrayList<>();
    // for(int i=0;i<nums.length-1;i++)
    // {
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         if(nums[i] == nums[j])
    //         {
    //             list.add(nums[i]);
    //         }
    //     }
    // }
    // return list;




            // Using sorting we can do this 




    //  List<Integer> list = new ArrayList<>();
    //  Arrays.sort(nums);
    // for(int i=0;i<nums.length-1;i++)
    // {
    //     if(nums[i] == nums[i+1])
    //         {
    //             list.add(nums[i]);
    //         }
    // }
    // return list;




   List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int x = Math.abs(nums[i]);
            if (nums[x - 1] < 0) {
                ans.add(x);
            }
            nums[x - 1] *= -1;
        }
        return ans;
     
    }
}