public class Stackl{
    private Node head;

    public Stackl(){
        head = null;
    }
    public Stackl(Object o){
        head = new Node(o);
    }
    public boolean isempty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    public boolean isnotempty(){
        if(head != null){
            return true;
        }else{
            return false;
        }
    }
    public void push(Object o){
        if(this.isempty()){
            head = new Node(o);
        }else{
            Node n = new Node(o);
            n.next = head;
            head = n;   
        }
    }
    public Object top(){
        return head.ob;
    }
    public void pop(){
        if(head.next != null){
            head = head.next;
        }else{
            head = null;
        }
    }
   
    public void printhead(){
        if(!(this.isempty())){
            System.out.println("head " + head.ob);
        }
    }
    public void print(){
        Node n = head;
        String a ="";
        if(n != null){
            a += (n.ob.toString());
            n = n.next;
        }
        for (int i=a.length()-1;i>=0 ;i-- ) {
            System.out.print(a.charAt(i) + ", ");
        }
        System.out.println();
    }


}