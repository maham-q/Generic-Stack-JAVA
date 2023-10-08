import java.util.Scanner;
class StackEmptyException extends Exception{
    public StackEmptyException(String message){
        super(message);
    }
}
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
class stack <T>{
    public int size;
    public node<T> top;
    private int s;

    public stack (){
        size=0;
        s=0;
        top=null;
    }
    public stack (int size, node<T> top){
        this.size=size;
        this.top=top;
        s=0;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if(getSize()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void push(T data) throws StackEmptyException{
        if(!isEmpty()){
            if(s!=size){
            node<T> temp = new node<>(data);
            temp.setNext(top);
            top=temp;
            s++;
            }
            else{
                throw new StackEmptyException("Stack Empty");
            }
        }
        else if(isEmpty()){
             throw new StackEmptyException ("Stack is empty!");
        }
    }
    public void pop()throws StackEmptyException{
        if (!isEmpty()) {
            T data= top.getData();
            top=top.getNext();
            size--;
            System.out.println("Popped element: "+ data);
        }
        else{
            throw new StackEmptyException ("Stack is empty!");
        }
    }
    public void peek()throws StackEmptyException{
         if (!isEmpty()) {
            System.out.println("Peek element: "+ top.getData());
        }
        else{
            throw new StackEmptyException("Stack is empty!");
        }
    }
    public void display(){
        System.out.println("-----Stack-----");
        node<T> temp=top;
        while(temp!=null){
            System.out.print(temp.getData()+"  ");
            temp=temp.getNext();
        }
        System.out.println();
    }


}
public class q1{
    public static void main(String[] args) throws StackEmptyException{
        System.out.println("Hello Stack");
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size=obj.nextInt();
        int num=0;
        stack<Integer> s=new stack<Integer>(size,null);
        for(int i=0;i<size;i++){
            System.out.println("Enter elements in stack");
            num=obj.nextInt();
            s.push(num);
        }
        s.display();
        System.out.println("Stack Size: "+s.getSize());
        s.pop();
        System.out.println("Stack Size: "+s.getSize());
        s.display();
        s.peek();
        System.out.println("Is stack empty? "+s.isEmpty());
                

    }
}