public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Use a Min-Heap (PriorityQueue) to keep the top k frequent elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> frequencyMap.get(a) - frequencyMap.get(b)
        );

        for (int num : frequencyMap.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the element with the lowest frequency
            }
        }

        // Step 3: Extract the elements from the heap and return as an array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
