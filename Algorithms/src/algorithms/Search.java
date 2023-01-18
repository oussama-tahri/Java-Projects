package algorithms;

public class Search {
    public static int linearSearch(int[] dataset, int target) {
        //iterate through dataset searching for target
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == target) {
                return i;
            }
        }
        return -1;
    }


    public static int binarySearch(int[] dataSet, int target, int start, int end) {
        // Binary search assumes a sorted array and can therefore cantinually split our search domain in half
        System.out.println("Searching between : " +dataSet[start] + " and " +dataSet[end]);
        int midPoint = (int) Math.floor(((start+end)/2));
        int value = dataSet[midPoint];

        if (target > value){
            System.out.println(target + " > " + value);
            return binarySearch(dataSet, target, midPoint +1, end);
        } else if (target < value) {
            System.out.println(target + " < " + value);
            return binarySearch(dataSet, target,start, midPoint -1);
        }
        System.out.println(target + " = " + value);
        return midPoint;
    }

}
