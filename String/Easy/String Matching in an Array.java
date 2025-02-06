class Solution {
    public List<String> stringMatching(String[] words) {

        // this is the brute force method 
        int n = words.length;
        List<String> list = new ArrayList<>();

        // for(int i=0;i<n; i++){
        //     for(int j=0; j<n; j++){
        //         if(i!=j && words[j].contains(words[i])){
        //             list.add(words[i]);
        //             break;
        //         }
        //     }
        // }
        // return list;


        // this is called rabin carp method

        String st = String.join(" ",words);

        // this is the matching technique so we can match with the indexes
        for(int i=0; i<n; i++){
            if(st.indexOf(words[i]) != st.lastIndexOf(words[i])){
                list.add(words[i]);
            }
        }
        return list;
    }
}