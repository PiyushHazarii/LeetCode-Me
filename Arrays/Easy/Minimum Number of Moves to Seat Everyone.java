class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        // this is the brute force approach
        
        // int n = seats.length;
        // Arrays.sort(seats);
        // Arrays.sort(students);
        // int count=0;
        // for(int i=0;i<n;i++)
        // {
        //     count += Math.abs(seats[i] - students[i]);
        // }
        // return count;


        int n = students.length;
        int[] positionSeat = new int[101];
        int[] positionStud = new int[101];

        for (int seat : seats) {
            positionSeat[seat]++;
        }
        for (int student : students) {
            positionStud[student]++;
        }

        int i = 0, j = 0, result = 0;

        while (i <= 100 && j <= 100) {
            while (i <= 100 && positionSeat[i] == 0) i++;
            while (j <= 100 && positionStud[j] == 0) j++;

            if (i <= 100 && j <= 100 && positionSeat[i] > 0 && positionStud[j] > 0) {
                result += Math.abs(i - j);
                positionSeat[i]--;
                positionStud[j]--;
                n--;
            }
        }

        return result;
    }
}