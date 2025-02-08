import java.util.*;

public class Bucket sort{
    public static void bucketSort(int[] arr) {
        int n = arr.length;
        List<Integer>[] bucket = new ArrayList[n];

        // here we are putting a new array lise for every element  as seen below
        for(int i=0; i<arr.length; i++){
            bucket[i] = new ArrayList<>();
        }

        // now we have to put the elment in the array acoording to their specific 
        // position array as seen below means we multiply by n to fit in the range.
        for(int i=0; i<n; i++){
            int index = n*(arr[i]);
            bucket[index].add(arr[i]);
        }

        // then sort every bucket with any techniques 
        for(int i=0; i<n; i++){
            insertionSort(bucket[i]);
        }

        // then we have to update this on arr 2nd for loop run for getting the 
        // element from the bucket
        int index =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<bucket[i].size(); j++){
                arr[index++] = bucket[i].get(j);
            }
        }
    }
    public static void insertionSort(List<Integer> bucket){
        int n = bucket.size();
        for(int i=1; i<n; i++){
            int key = bucket.get(i);
            int j = i-1;
            while(j>=0 && bucket.get(j) > bucket.get(key)){
                bucket.add(j+1,bucket.get(j));
                j--;
            }
            bucket.add(j+1, key);
        }
    }
}
