public class StackImplementation {

    String[] stack;

    boolean stackEmpty(){
        return stack == null || stack.length == 0;
    }

    void push(String s){
        int l;
        if(stack==null)
            l=0;
        else
            l = stack.length;

        String[] tempStack = new String[l+1];

        for(int i = 0; i < l; i++)
        {
            tempStack[i] = stack[i];

        }
        tempStack[l] = s;
        stack = tempStack;

    }

    String pop(){

        int l;

        if (stack == null)
            l = 0;
        else
            l =  stack.length-1;

        String[] tempStack = new String[l];
        for(int i = 0; i< l; i++)
        {
            tempStack[i] = stack[i];
        }
        return stack[l];
    }

    public static void main(String[] args){
        StackImplementation s = new StackImplementation();
        if(s.stackEmpty())
            System.out.println("It's empty!");

        s.push("Hello World!");
        s.push("Goodbye World");
        s.push("JK");
        String temp = s.pop();
        System.out.println("Last ine is "+ temp);

    }

   }
