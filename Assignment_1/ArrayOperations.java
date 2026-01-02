import java.util.Scanner;

class ArrayOperations {

    static void insert(int[] arr, int n) {
        System.out.print("Array Elements: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void delete(int[] arr, int n, int pos) {
        for (int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];

        System.out.print("After Deletion: ");
        for (int i = 0; i < n - 1; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void linearSearch(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    static void binarySearch(int[] arr, int n, int key) {
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index " + mid);
                return;
            }
            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        System.out.println("Element not found");
    }

    static void findMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > max)
                max = arr[i];
        System.out.println("Maximum value: " + max);
    }

    static void countEvenOdd(int[] arr, int n) {
        int even = 0, odd = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        insertionSort(arr, n);
        findMax(arr, n);
        countEvenOdd(arr, n);
    }
}
