class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int currUnsat = 0;

        // this is the first window size where we find the unsat cus
        for(int i=0; i<minutes; i++){
            if(grumpy[i] == 1){
                currUnsat += customers[i];
            }
        }

        int maxUnsat = currUnsat;
        int left =0;
        int right = minutes;
        // har baar ek window size badhake plus kr rahe hain and minus kr rahe hain
        while(right < n){
            currUnsat += customers[right] * grumpy[right];
            currUnsat -= customers[left] * grumpy[left];

            maxUnsat = Math.max(maxUnsat, currUnsat);
            left++;
            right++;
        }
        int totalUnsat = maxUnsat;
        // then totalUnsat ko jitna satisfied hai usme add kr rahe hain
        for(int i=0; i<n; i++){
            if(grumpy[i] == 0){
                totalUnsat += customers[i];
            }
        }
        return totalUnsat;
    }
}