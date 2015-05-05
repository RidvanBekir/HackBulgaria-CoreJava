package StackTasks;
public class MainClass {

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.addElement(0, 125);
        stack.addElement(1, 155);
        stack.addElement(125);
        stack.addElement(3, 167);
        System.out.println(stack.findElementIndex(125));
        System.out.println(stack.length());
        System.out.println(stack.findElementIndex(100));
        System.out.println(stack.isStackEmpty());

    }

}
