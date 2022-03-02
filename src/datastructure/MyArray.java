package datastructure;

public class MyArray {
    // variables
    private int[] array;

    // constructor
    public MyArray() {
        array = new int[0];
    }

    // methods
    // add an element to the end of the array
    public void add(int e) {
        // create a new temporary array of size 1 larger than the current array
        int[] temp = new int[array.length + 1];

        // copy the current array into the temporary array
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }

        // add the new element to the end of the temporary array
        temp[temp.length - 1] = e;

        // copy the temporary array into the current array
        array = temp;
    }

    // remove the final element from the end of the array
    public int remove() {
        // create a temporary array of size 1 smaller than the current array
        int[] temp = new int[array.length - 1];
        int e = array[array.length - 1];

        // copy the current array into the temporary array
        for (int i = 0; i < array.length - 1; i++) {
            temp[i] = array[i];
        }

        // copy the temporary array into the current array
        array = temp;

        // return the removed element
        return e;
    }

    // remove a specific element from the array using its index
    public int remove(int index) {
        // create a temporary array of size 1 smaller than the current array
        int[] temp = new int[array.length - 1];
        int e = array[index];

        // copy the elements before the index into the temporary array
        for (int i = 0; i < index; i++) {
            temp[i] = array[i];
        }
        // copy the elements after the index into the temporary array
        for (int i = index+1; i < array.length - 1; i++) {
            temp[i-1] = array[i];
        }

        // copy the temporary array into the current array
        array = temp;

        // return the removed element
        return e;
    }

    // find the index of a specific element in the array using its value
    public int findPosition(int e) {
        // find the position of the value
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                return i;
            }
        }

        // if the value is not found, return -1
        return -1;
    }

    // remove a specific element from the array
    public void removeElement(int e) {
        int index;
        while ((index = findPosition(e)) != -1) {
            remove(index);
        }
    }

    // print the array
    public void print() {
        System.out.println("array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
        System.out.println("--------------------");
    }
}
