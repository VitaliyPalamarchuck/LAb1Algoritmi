/*

import java.util.Arrays;


public class BasicAlgSortReversed <T extends Comparable<? super T>>{

    private int left;
    private int right;
    private T[] array;

    public BasicAlgSortReversed(T[] array){ this.array=Arrays.copyOf(array, array.length);}

    public BasicAlgSortReversed(int left, int right, T[] array) {
        this.left = left;
        this.right = right;
        this.array = Arrays.copyOfRange(array,left,right);
    }

    public T[] getArray(){return array;}

    public void bubbleSortDescReversed() {
        boolean flagForInteration = true;
        while (flagForInteration) {
            flagForInteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i].compareTo(array[i - 1]) > 0) { // Замінив < на >
                    swap(i, i - 1);
                    if (!flagForInteration) {
                        flagForInteration = true;
                    }
                }
            }
        }
    }

    private void swap(int leftIndex, int rightIndex) {
        T temp = array[leftIndex];
        array[leftIndex] = array[rightIndex];
        array[rightIndex]=temp;
    }
    public void selectionSortAscReversed(){
        for (int i = 0; i < array.length; i++) {
            int maxIndex=i; //всюди замінив minIndex на maxIndex та min на max
            T max=array[i];
            for (int j = i+1; j < array.length; j++) {
                if(array[j].compareTo(max)>0){ // Замінив < на >
                    max =array[j];
                    maxIndex=j;
                }
            }
            if (i!=maxIndex) swap(i,maxIndex);
        }
    }

    public void insertionSortWithLinearSearchAscReversed(){
        for(int i=1; i<array.length; i++){
            T key =array[i];
            int j = i;
            for (; j>0;j--){
                if(key.compareTo(array[j-1])>0){ // Замінив < на >
                    array[j]=array[j-1];
                }else {
                    break;
                }
            }
            array[j]=key;
        }
    }

    public void insertionSortWithBinarySearchAscReversed(){
        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int leftIndex = 0;
            int rightIndex = i-1;
            if(key.compareTo(array[i-1])>0){ // Замінив < на >
                while (leftIndex <= rightIndex){
                    int serIndex=(rightIndex+leftIndex)/2;
                    if(key.compareTo(array[serIndex])>0){ // Замінив < на >
                        rightIndex=serIndex-1; // додав -1
                    }else{
                        leftIndex=serIndex+1;
                    }
                }
                for(int j = i; j >leftIndex ; j--) {
                    array[j]=array[j-1];
                }
                array[leftIndex]=key;
            }

        }
    }


}
*/
