package dd_ArrayList;

import java.util.Arrays;

public class DDArrayList {
    private int count;
    public int[] numbers;

    //Takes in an initial array and sets the private fields to array.length and array.
    public DDArrayList(int[] array) {
        count = array.length;
        numbers = array;
    }

    //Inserts a new integer at the given index
    public void insertAt(int x, int index) {
        numbers[index] = x;
    }

    //Lookup the value at the index
    public int indexOf(int index){
        return numbers[index];
    }

    //Sets the numbers array to an array of zeroes.
    public void reset() {
        for (int i : numbers) {
            numbers[i]=0;
        }
    }
    /*
    *
    * Removes the element at the given index. We create a new integer array with numbers.length-1.
    *
    * We first copy of the element to the appropriate element in the given array if we have not yet reached index.
    *If we have reached index, then we set the element of newArray to the i+1th element in numbers.
    * We do so until we have reached the end of newArray.
    * */
    public void removeAtIndex(int index) {
        int[] newArray = new int[count-1];

        for (int i = 0; i< newArray.length; i++) {
            if (i>= index) {
                newArray[i] = numbers[i+1];
            }
            else {
                newArray[i] = numbers[i];
            }

        }

        numbers = newArray;

    }

    //Print the numbers array
    public String printNumbers() {
        return Arrays.toString(numbers);
    }

    //Return the maximum of the array
    public int returnMax() {
        if (numbers.length==0 || numbers==null)
            return 0;

        int maxNum = 0;
        for (int i : numbers) {
            if (i>maxNum)
                maxNum = i;
        }
        return maxNum;
    }

    public void reverseArray() {
            //We must set the argument to x<count/2 because every time we swap two numbers we swap them back if we use x<count.
            for (int x = 0; x<count/2; x++) {
                int n = numbers[x];
                int m = numbers[count-1-x];
                numbers[x] = m;
                numbers[count-1-x] = n;
            }

    }

    //Copies the original array into a new array, and sets the last item to the new integer.
    //Sets the last item in the newArray to the integer n.
    public void addAtEnd(int n) {
        int[] newArray = new int[count + 1];
        for (int index = 0; index<numbers.length; index++) {
            newArray[index] = numbers[index];
        }
        newArray[count] = n;

        numbers = newArray;
    }
    /*Alternative:
          Arrays.sort(numbers);
          maxNum = numbers[numbers.length-1];
          return maxNum

     */

    //Sort algorithm: sorts the numbers in increasing order.
    //Bubble sort.
    /*
    * Applies the BubbleSort Algorithm until the algorithm is sorted.
    *
    *  */
    public void sortInIncreasingOrder() {
        var sortObject = new BubbleSortOneTime();

        //We need to sort it once. Kind of like a do-while loop.
        sortObject.bubbleSort(numbers);

        //Keep using the BubbleSortOneTime object until the array is sorted.
        //We need the algorithm to sort it until numSwaps is 0 at the end of the algorithm.
        while (sortObject.numSwaps != 0) {
            //Set to zero every time we run the algorithm
            sortObject.numSwaps=0;

            //Sort the algorithm
            sortObject.bubbleSort(numbers);

            /*
            *If it the numSwaps is still zero, break out of the loop.
            * In order for the numbers array to be sorted, we must have the number of swaps be zero after one sort.
            *  */
        }
    }

}
