
package bcs.csc229.lab08;

class Node {
   public int data;
   public Node next;

   public Node(int data) {
      this.data = data;
      this.next = null;
   }
   
}

class LinkedList {
   private Node head;
   private Node tail;
    
   public LinkedList() {
      head = null;
      tail = null;
   }
    
   public void append(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         tail = newNode;
      }
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head = newNode;
      }
   }
   

   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         tail = newNode;
      }
      else {
         newNode.next = currentNode.next;
         currentNode.next = newNode;
      }
   }
   

   public void removeAfter(Node currentNode) {
      if (currentNode == null && head != null) {
         // Special case: remove head
         Node succeedingNode = head.next;
         head = succeedingNode;
         if (succeedingNode == null) {
             // Last item was removed
             tail = null;
         }
      }
      else if (currentNode.next != null) {
         Node succeedingNode = currentNode.next.next;
         currentNode.next = succeedingNode;
         if (succeedingNode == null) {
            // Remove tail
            tail = currentNode;
         }
      }
   }
   
   
   public int getSum(){
       int sum = 0;
       Node e = this.head;
       while(e != null){
           sum += e.data;
           e = e.next;
       }
       return sum;
       
   }   
   
   @Override
   public String toString(){
       String str = "";
       Node e = this.head;
       while(e != null){
           str += e.data + " ";
           e = e.next;
       }
       return str;
   }
   
}
