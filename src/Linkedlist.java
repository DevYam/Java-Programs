//public class Linkedlist {
//    public static void main(String[] args) {
//        Node head = new Node(1,null);
//        Node first = new Node(2,null);
//        head.setNext(first);
//        Node sec = new Node(3,null);
//        first.setNext(sec);
//        Node temp = head;
//        while (temp.next!=null){
//            System.out.println(temp.getData());
//            temp = temp.next;
//
//        }
//        System.out.println(temp.getData());
//    }
//    static class Node{
//        private int data;
//        private Node next;
//        public Node(int data, Node next){
//            this.data = data;
//            this.next = next;
//        }
//
//        public int getData() {
//            return data;
//        }
//
//        public void setData(int data) {
//            this.data = data;
//        }
//
//        public Node getNext() {
//            return next;
//        }
//
//        public void setNext(Node next) {
//            this.next = next;
//        }
//    }
//}

public class Linkedlist{
    public static void main(String[] args) {
        Node head = new Node(1,null);
        Node first = new Node(2,null);
        Node sec = new Node(3,null);
        head.next = first;
        first.next = sec;
        Node temp = head;
        while (temp.next!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    static class Node{
        int data;
        Node next;
       public Node(int data, Node next){
           this.data = data;
           this.next = next;
       }
    }

}