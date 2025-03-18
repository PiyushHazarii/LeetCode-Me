class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left =1;
       long right = (long)1e14;
         while(left < right){
            long mid = left+(right-left)/2;
            if(canEatAll(ranks,mid,cars))
            right = mid;

            else 
            left = mid+1;
         }
         return left;
    }
    public boolean canEatAll(int ranks[], long mid, int givenCars){
        long repaired_cars =0;
        for(int i : ranks){
            repaired_cars += Math.sqrt(mid/i);
        }
        return repaired_cars >= givenCars; 
    }
}


// class Solution {
// public long repairCars(int[] ranks, int cars) {
//         long low = 0, high = (long)1e14;
//         while (low < high) {
//             long mid = low + (high - low) / 2, repaired_cars = 0;
//             for (int r: ranks)
//                 repaired_cars += Math.sqrt(mid / r);
//             if (repaired_cars < cars) low = mid + 1;
//             else high = mid;
//         }
//         return low;
//     }
// }