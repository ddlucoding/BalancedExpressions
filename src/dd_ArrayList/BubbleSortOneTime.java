package dd_ArrayList;

public class BubbleSortOneTime {
    public int numSwaps = 0;

    //Use the bubble sort algorithm one time.
    public void bubbleSort(int[] array) {
        for (int i = 0; i<array.length; i++)
            if (i == array.length-1) {
                break;
            }
            else {
                if (array[i] > array[i+1] ) {
                    //We switch the elements if the left element is greater than the right element.
                    //We increment numSwaps by 1.
                    int n = array[i];
                    int m = array[i+1];
                    array[i] = m;
                    array[i+1] = n;
                    numSwaps++;
                }
                else {
                    continue;
                }
            }
    }

}
