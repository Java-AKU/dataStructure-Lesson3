import datastructure.MyArray;

public class App {
    public static void main(String[] args) {
        // create a new object of MyArray
        MyArray arr = new MyArray();

        // add elements to the array
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);

        // print the array
        arr.print();

        // remove an element from the array
        // if the user wants to know the removed element,
        // we can use the return value of remove()
        // int e = arr.remove();
        // System.out.println("removed element = " + e);

        // if the user does not want to know the removed element,
        // we can use the remove() method without return value
        arr.remove();

        // print the array
        arr.print();

        // remove a specific element from the array
        // if the user wants to know the removed element,
        // we can use the return value of remove(int index)
        // int e = arr.remove(2);
        // System.out.println("removed element = " + e);

        // if the user does not want to know the removed element,
        // we can use the remove(int index) method without return value
        arr.remove(3);
        
        // print the array
        arr.print();

        // remove a specific value from the array
        arr.removeElement(3);

        // print the array
        arr.print();
    }
}
