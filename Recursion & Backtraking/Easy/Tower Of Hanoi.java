class Solution {

    public int towerOfHanoi(int n, int from, int to, int aux) {
       if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
            return 1;
        }

        long count = toh(N - 1, from, aux, to);

        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        count++;

        count += toh(N - 1, aux, to, from);

        return count;
    }
}
