class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer , String> hs = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            hs.put(heights[i] , names[i]);
        }
        Arrays.sort(heights);
        String[] sorted= new String[n];
        int index =0;
        for(int i=heights.length-1;i>=0;i--)
        {
            sorted[index] = hs.get(heights[i]);
            index++;
        }
        return sorted;
    }
}