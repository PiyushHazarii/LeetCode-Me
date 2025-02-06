class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        char seq[] = arr.toCharArray();
        int n = seq.length;
        
        //Declaring output character array that will have sorted letters.
        char output[] = new char[n];
        
        //Creating a count array to store count of individual
        //characters and initialize count array as 0.
        int count[] = new int[256];

        //Storing count of each character.
        for (int i=0; i<n; ++i)
            ++count[seq[i]];
            
        //Modifying the count array such that each element at each index 
        //stores the sum of previous counts. 
        //The modified count array indicates the position of each object in 
        //the output sequence.
        for (int i=1; i<256; ++i)
            count[i] += count[i-1];
            
        //Building the output character array.
        for (int i = 0; i<n; ++i)
        {
            output[--count[seq[i]]] = seq[i];
        }
        
        return new String(output);
    }
}