import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Revision {

    // Recursive method to calculate sum
    static int sumArray(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + sumArray(arr, index + 1);
    }

    // Binary Search method
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take 10 integers
        int[] arr = new int[10];

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 1: Insertion Sort
        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 2: Binary Search
        System.out.print("Enter a number to search: ");
        int search = sc.nextInt();

        int result = binarySearch(arr, search);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        // Step 3: Recursion
        int sum = sumArray(arr, 0);
        System.out.println("Sum of sorted array: " + sum);

        // Step 4: String
        sc.nextLine();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Length: " + name.length());
        System.out.println("First Character: " + name.charAt(0));
        System.out.println("Last Character: " + name.charAt(name.length() - 1));
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // Step 5: StringBuilder
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(name)
          .append(" | Sum: ").append(sum);

        sb.append(" | Java");

        sb.insert(0, "Student - ");

        sb.reverse();

        String finalString = sb.toString();

        System.out.println("Final String:");
        System.out.println(finalString);

        sc.close();
    }
}
