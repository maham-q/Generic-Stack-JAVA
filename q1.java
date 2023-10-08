class node <T> {
    public T data;
    public node <T> next;

    public node(){
        data = null;
        next=null;
    }
    public node(T data){
        this.data = data;
        next=null;
    }
    public void setData(T data){
        this.data=data;
    }
    public void setNext(node<T> next){
        this.next=next;
    }
    public T getData(){
        return data;
    }
    public node<T> getNext(){
        return next;
    }
    
}
public class q1{
    public static void main(String[] args){
        System.out.println("Hello Stack");
    }
}