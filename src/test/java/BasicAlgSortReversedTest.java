/*
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BasicAlgSortReversedTest {

    @Test
    public void testBubbleSortWhenArraysWithIntegerTypesAndRangeEqualsLengthReversed(){
        Integer [] sourceArray = new Integer[]{5,4,10,2,1};
        Integer [] destArray = new Integer[]{10,5,4,2,1};
        BasicAlgSortReversed<Integer> integerBasicAlgSort = new BasicAlgSortReversed<>(sourceArray);
        integerBasicAlgSort.bubbleSortDescReversed();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testselectionSortWhenArraysWithIntegerTypesAndRangeEqualsLengthReversed() {
        Integer [] sourceArray = new Integer[]{5,4,10,2,1};
        Integer [] destArray = new Integer[]{10,5,4,2,1};
        BasicAlgSortReversed<Integer> integerBasicAlgSort = new BasicAlgSortReversed<>(sourceArray);
        integerBasicAlgSort.selectionSortAscReversed();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }

    @Test
    public void testInsertionSortWhenArraysWithIntegerTypesAndRangeEqualsLengthReversed() {
        Integer [] sourceArray = new Integer[]{5,4,10,2,1,8,-5,0};
        Integer [] destArray = new Integer[]{10,8,5,4,2,1,0,-5};
        BasicAlgSortReversed<Integer> integerBasicAlgSort = new BasicAlgSortReversed<>(sourceArray);
        integerBasicAlgSort.insertionSortWithLinearSearchAscReversed();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }
    @Test
    public void testInsertionSortWithBinaryWhenArraysWithIntegerTypesAndRangeEqualsLengthReversed() {
        Integer [] sourceArray = new Integer[]{5,4,10,2,1,8,-5,0};
        Integer [] destArray = new Integer[]{10,8,5,4,2,1,0,-5};
        BasicAlgSortReversed<Integer> integerBasicAlgSort = new BasicAlgSortReversed<>(sourceArray);
        integerBasicAlgSort.insertionSortWithBinarySearchAscReversed();
        assertThat(integerBasicAlgSort.getArray()).isEqualTo(destArray);
    }


    public static Integer[] getRandomInteger(int n){
        Integer [] sourceArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            sourceArray[i]=new Random().nextInt(200)-100;
        }
        return sourceArray;
    }




}
*/
