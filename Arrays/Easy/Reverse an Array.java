class Solution {
    public void reverseArray(int arr[]) {
       int i = 0;
        int j = arr.length - 1;
        solve(arr, i, j);
    }
    public void solve(int[] arr, int i, int j){
        if(i >= j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        solve(arr, ++i, --j);
    }
}