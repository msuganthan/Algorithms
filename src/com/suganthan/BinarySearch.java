public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int key = 8;
        System.out.println(binarySearch(arr, 0,arr.length-1, key));
    }
    static int binarySearch(int[] arr, int low, int high, int key) {
        if(high >= 1) {
            int mid = low+(high - low)/2;
            if(key == arr[mid])
                return mid;
            if(key<arr[mid])
                return binarySearch(arr, low, mid-1, key);
            return binarySearch(arr, mid+1, high, key);
        }
        return -1;
    }
}
