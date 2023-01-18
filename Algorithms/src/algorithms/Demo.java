package algorithms;

public class Demo {

    public static void main(String[] args) {
        int[] numbers = {22, 05, 23, 7, 11, 20};
        int[] sortedNumbers = {5, 7, 10, 11, 20, 22, 23, 33, 47, 55, 69, 77, 81, 98};

        // Call the linear function that searches for a specific number
        int pos = algorithms.Search.linearSearch(numbers, 7);
        System.out.println("found at position : " +pos);

        // Call the binary search
        int index = algorithms.Search.binarySearch(sortedNumbers, 77, 0, sortedNumbers.length-1);
        System.out.println("Found at position : " +index);

        // Call bubble Sort function
        Sort.bubbleSort(numbers);
    }
}
