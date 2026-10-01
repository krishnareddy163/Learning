package ArrayProgramming;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int numbers =9;
        int actualSum =0;
        int expectedSum =0;
        int missingNumber =0;
        int n = arr.length;
        for(int i =0; i< n; i++){
            actualSum = actualSum+arr[i];
        }
        expectedSum = numbers* (numbers + 1)/2;
        missingNumber = expectedSum-actualSum;
        System.out.println(missingNumber);
    }
}
