import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int output[] = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> countMap = new HashMap<>(); // To track the frequency of elements
        int left = 0;
        int right = 0;
        int index = 0;

        while (right < n) {
            pq.offer(nums[right]);
            countMap.put(nums[right], countMap.getOrDefault(nums[right], 0) + 1);

            if (right - left + 1 == k) {
                // Get the maximum element in the current window
                while (countMap.get(pq.peek()) == null || countMap.get(pq.peek()) == 0) {
                    pq.poll();
                }
                output[index++] = pq.peek();

                // Remove the leftmost element from the window
                countMap.put(nums[left], countMap.get(nums[left]) - 1);
                left++;
            }
            right++;
        }
        return output;
    }
}



import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return new int[0];

        Deque<Integer> deque = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Remove elements from the front that are out of the window
            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            // Maintain the deque in descending order
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to deque
            deque.offerLast(i);

            // Store the maximum element when window size is at least `k`
            if (i >= k - 1) {
                result.add(nums[deque.peekFirst()]);
            }
        }

        // Convert List to int array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}


