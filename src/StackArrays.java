
public class StackArrays {

    int maxSize;
    int top;
     int[] stackArray;

     public StackArrays(int size){
         maxSize  = size;
         stackArray= new int[maxSize];
         top = -1;
     }

     //check if the stack is empty
    public boolean isEmpty(){
         return (top == -1);
    }

    public boolean isFull(){
         return (top == maxSize -1);
    }

    public static void main (String[] args){

    }

}
