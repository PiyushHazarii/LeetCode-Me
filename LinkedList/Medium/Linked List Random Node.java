
class Solution {
    private Random random = new Random();
    List<Integer> list = new ArrayList<>();
    public Solution(ListNode head) {
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
    }
    public int getRandom() {
        int n = list.size();
        int randomIndex = random.nextInt(n);
        return list.get(randomIndex);
    }
}


