import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> divideString(String word, int n) {
        // Write your code here
        ArrayList<String> list = new ArrayList<>();
        int nn = word.length();

        if(nn % n != 0){
            return list;
        }
        int part = nn/n;

        for(int i=0; i<nn; i+= part){
            list.add(word.substring(i, i+part));
        }
        return list;
    }
}