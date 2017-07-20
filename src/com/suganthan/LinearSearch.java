public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 15, 16, 5, 10, 11};
        int key = 10;
        System.out.println(linearSearch(arr, arr.length-1, key));
    }

    public static int linearSearch(int[] arr, int arrayLength, int key) {
        for (int i = 0; i < arrayLength; i++)
            if(key == arr[i])
                return i;

        return -1;
    }
}
