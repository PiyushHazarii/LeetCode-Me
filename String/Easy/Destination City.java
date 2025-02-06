class Solution {
    public String destCity(List<List<String>> paths) {
        int n = paths.size();
       Set<String> sets = new HashSet<>();
       for(int i=0;i<n;i++)
       {
            sets.add(paths.get(i).get(0));
       }
       for(int j=0;j<n;j++)
       {
            String destination = paths.get(j).get(1);
            if(!sets.contains(destination))
            {
                return destination;
            }
       }
       return "";
    }
}