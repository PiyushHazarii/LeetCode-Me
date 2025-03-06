class Solution {
    public long coloredCells(int n) {
    return 1l * n * n + 1l * (n - 1) * (n - 1);
}
}
// Another approach

class Solution {
public long coloredCells(int n) {
    if(n==1)
    return 1;
    long sum=0;
    while(n>1){
        sum+=(n-1)*4;
        n--;
    }
    return 1+sum; 
}
}