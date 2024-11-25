
public class StackArrays {

    int maxSize;
    int top;
    int[] arrayStack;

    public StackArrays(int size){
        maxSize = size;
        arrayStack = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }



    public boolean isFull(){
        return (top == maxSize-1);
    }

    public void push(int value){
        if (isFull()){
            System.out.println("Stack is full , cannot push " + value);
        } else {
            arrayStack[++top] = value;
            System.out.println("Pushed " + value + " onto the stack");
        }
    }

    public void pop(){
        
    }

    public static void main (String[] args){

    }

}
