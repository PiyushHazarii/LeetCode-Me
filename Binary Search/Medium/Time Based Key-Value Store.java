// pair class is inbuilt in java that store value in key value.
class TimeMap {
    Map<String,List<Pair<String , Integer>>> map;
    public TimeMap() {
        map = new HashMap<>();
    }


    public void set(String key, String value, int timestamp) 
    {
        map.putIfAbsent(key,new ArrayList<>());
        map.get(key).add(new Pair(value,timestamp));  
    }


    
    public String get(String key, int timestamp) 
    {
        String res = "";

        if(map.containsKey(key))
        {
            List<Pair<String , Integer>> temp = map.get(key);
            
            int left =0;
            int right = temp.size()-1;
            while(left <= right)
            {
                int mid = left + (right - left)/2;
                if(temp.get(mid).getValue() <= timestamp){
                    res = temp.get(mid).getKey();
                    left = mid+1; 
                }
                else
                right = mid-1;
            }
        }
        return res;
    }
}



// public class TimeMap {

//     private Map<String,TreeMap<Integer,String>> map;

//     /** Initialize your data structure here. */
//     public TimeMap() {
//         map = new HashMap<>();
//     }

//     public void set(String key, String value, int timestamp) {
//         if(!map.containsKey(key)) {
//             map.put(key,new TreeMap<>());
//         }
//         map.get(key).put(timestamp,value);
//     }

//     public String get(String key, int timestamp) {
//         TreeMap<Integer,String> treeMap = map.get(key);
//         if(treeMap==null) {
//             return "";
//         }
//         Integer floor = treeMap.floorKey(timestamp);
//         if(floor==null) {
//             return "";
//         }
//         return treeMap.get(floor);
//     }
// }