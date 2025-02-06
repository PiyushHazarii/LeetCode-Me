class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // first add all the element of first arr in the set
        for(int i : nums1)
        {
            set1.add(i);
        }
        // agar contains karega to hi add karenge 
        for(int i : nums2){
            if(set1.contains(i)) set2.add(i);
        }

        int[] res = new int[set2.size()];
        int index = 0;
        for(int n : set2)
        {
            res[index++] = n;
        }
        return res;
    }
}
// we can solve the question by many ways