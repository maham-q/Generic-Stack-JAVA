import java.util.Scanner;
import java.util.EmptyStackException;

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

    public stack (){
        size=0;
        top=null;
    }
    public stack (int size, node<T> top){
        this.size=size;
        this.top=top;
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
    public void push(T data){
        if(!isEmpty()){
            node<T> temp = new node<>(data);
            top=temp;
            size--;
        }
        else{
             throw new StackEmptyException ("Stack is empty!");
        }
    }
    public void pop(){
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
    public void peek(){
         if (!isEmpty()) {
            System.out.println("Peek element: "+ top);
        }
        else{
            throw new StackEmptyException ("Stack is empty!");
        }
    }


}
public class q1{
    public static void main(String[] args){
        System.out.println("Hello Stack");
    }
}