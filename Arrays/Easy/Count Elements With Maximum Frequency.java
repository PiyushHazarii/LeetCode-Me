class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int count = 0;
        int maxFreq = Integer.MIN_VALUE;
        for (int freq : mp.values()) {
            maxFreq = Math.max(maxFreq, freq);
        }

        for (int freq : mp.values()) {
            if (freq == maxFreq)
                count += maxFreq;
        }
        return count;
    }
}



public class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frequencies = new HashMap<>();
        int maxFrequency = 0;
        int totalFrequencies = 0;

        // Find the frequency of each element
        // Determine the maximum frequency
        // Calculate the total frequencies of elements with the maximum frequency
        for (int num : nums) {
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
            int frequency = frequencies.get(num);

            // If we discover a higher frequency element
            // Update maxFrequency
            // Re-set totalFrequencies to the new max frequency
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                totalFrequencies = frequency;
                // If we find an element with the max frequency, add it to the total
            } else if (frequency == maxFrequency) {
                totalFrequencies += frequency;
            }
        }
        return totalFrequencies;
    }
}


// we can do this question by the help of count array of 101 size
// because the size is so small 
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int freqArray[] = new int[101];
        int maxFreq = 0;
        int sumFreq = 0;
        for(int element: nums){
            freqArray[element]++;
            int curFreq = freqArray[element];
            if(curFreq>maxFreq){
                maxFreq = curFreq;
                sumFreq = curFreq;
            }else if(curFreq == maxFreq){
                 sumFreq += curFreq;
            }
        }
        return sumFreq;
    }
}