public class Queuel{

	public Node head;

	public Queuel(){
        head = null;
    }
    public Queuel(Object o){
        head = new Node(o);
    }
    public boolean isemp(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    public void put(Object o){
        if(this.isemp()){
            head = new Node(o);
        }else{        	
            Node n = head;
            if(n.next == null){
            	n.next = new Node(o);	
            }
            while(n.next != null){
            	n = n.next;
            }
        }
    }
    public Object front(){
        return head.ob;
    }
    public void pop(){
        if(head != null){
            head = head.next;
        }else{
            head = null;
        }
    }
    
    public void printfront(){
        if(!(this.isemp())){
            System.out.println("head " + head.ob);
        }
    }
    public void print(){
    	Node n = head;
    	if(n != null){
    		System.out.print(n.ob.toString() + ", ");
    		n = n.next;
    	}
    	System.out.println();
    }
}