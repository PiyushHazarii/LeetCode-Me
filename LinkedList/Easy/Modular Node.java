import java.util.* ;
import java.io.*; 
/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

class Solution {

  public static Node modularNode(int k,Node head) {
    // Write your code here.
    if(head == null || k<=0) return null;

    Node result =null;
    int index=1;

    while(head!= null){
      if(index % k ==0){
        result = head;
      }
      head = head.next;
      index++;
    }
    return result;
  }
}