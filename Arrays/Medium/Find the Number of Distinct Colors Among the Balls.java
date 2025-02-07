class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> ballMap =new HashMap<>();
        Map<Integer, Integer> colorMap = new HashMap<>();

        int[] result = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int ball = queries[i][0];
            int color= queries[i][1];

            if(ballMap.containsKey(ball)){
                int previous = ballMap.get(ball);
                colorMap.put(previous, colorMap.get(previous)-1);

                if(colorMap.get(previous) == 0){
                    colorMap.remove(previous);
                }
            }
            ballMap.put(ball, color);
            colorMap.put(color, colorMap.getOrDefault(color,0)+1);
            result[i] = colorMap.size();
        }
        return result;
    }
}