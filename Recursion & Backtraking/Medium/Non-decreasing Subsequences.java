class Solution {
    int n;
    public List<List<Integer>> findSubsequences(int[] nums) {
        n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backTrack(result,curr,nums,0);
        return result;
    }
    public void backTrack(List<List<Integer>> result, List<Integer> curr, int nums[], int index){
        if(curr.size() > 1)
        result.add(new ArrayList<>(curr));

        Set<Integer> set = new HashSet<>();

        for(int i=index; i<n; i++){
            if((curr.isEmpty() || nums[i] >= curr.get(curr.size() - 1)) && !set.contains(nums[i])){
                curr.add(nums[i]);
                backTrack(result,curr,nums,i+1);
                curr.remove(curr.size()-1);

                set.add(nums[i]);
            }
        }
    }
}

// explaination of this code here


// pehele to question mein ye diya hua hai ki ek element ko include nahi karenge 
// karenge to sirf 2 element ya usse zyda kp include karenge 


// aur haan set hum is liye use kr rahe hai ki hum repeated element ko na le jaise ki 
// 1st question mein diya hai 7 ke baad 7 then usko include nahi karege hum...


// nums[i] >= curr.get(curr.size() - 1)) here in this kyi liye aisa pata hai kyu ki har bar jab 
// nums [i] aaye to comapre karega wo apne se pehele wala ka means 4 6 7 7 hai to nums [i] agar 
// 6 mein hai to wo check karega apne se pehele wale ka ki wo humse chota hai ki nahi.. iss liye ye use hua