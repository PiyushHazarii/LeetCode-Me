class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0])); // Min-heap
        Set<String> visited = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        pq.offer(new int[]{nums1[0] + nums2[0], 0, 0});
        visited.add("0,0");

        while (k-- > 0 && !pq.isEmpty()) {
            int[] temp = pq.poll();
            int i = temp[1];
            int j = temp[2];

            result.add(Arrays.asList(nums1[i], nums2[j]));

            // Push (i, j+1) if possible
            if (j + 1 < n && visited.add(i + "," + (j + 1))) {
                pq.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }

            // Push (i+1, j) if possible
            if (i + 1 < m && visited.add((i + 1) + "," + j)) {
                pq.offer(new int[]{nums1[i + 1] + nums2[j], i + 1, j});
            }
        }

        return result;
    }
}