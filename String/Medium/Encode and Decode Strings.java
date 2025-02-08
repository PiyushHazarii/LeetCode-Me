class Solution {

    public String encode(List<String> strs) {

        StringBuilder sd = new StringBuilder();
        for(String st : strs)
        {
            sd.append(st.length());
            sd.append(',');
            sd.append(st);
        }
        return sd.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        int i=0;
        while(i < str.length())
        {
            int j = i;
            while(str.charAt(j) != ',')
            {
                j++;
            }

            int length = Integer.valueOf(str.substring(i,j));
            i = j+1+length; // 1 add eas liye kr rahe hai ki 1 kam chalta hai na eassi liye
            list.add(str.substring(j+1,i));// j mein to "," hai to uske baad se lenge na
        }
        return list;

    }
}
