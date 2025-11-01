import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the algorithm you want to run");
        System.out.println("1# Sum all numbers in an array");
        System.out.println("2# remove duplicate numbers in an array");
        System.out.println("3# Remove an elemnet in an array");
        System.out.println("4# sum all numbers in an array list");
        System.out.println("5# remove duplicate numbers in an array list");
        System.out.println("6# Remove an elemnet in an arraylist");

        int number = scanner.nextInt();
        switch (number) {
            case 1: Algo1() ;break;
            case 2:Algo2();break;

            case 3:Algo3();break;
            case 4:Algo4();break;
            case 5:Algo5();break;
            case 6:Algo6();break;
            default:
                System.out.println("Invalid input");
        }

    }
    public static void Algo1(){
        //input
        int sum = 0;
        int x[] = inputArray();
        for(int i = 0; i < x.length; i++){
            sum = sum + x[i];
        }
        System.out.println("The sum is: " + sum);
    }
    public static void Algo2() {
        int uniqueCount = 1;
        int x[] = inputArray();
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] != x[i + 1]) {
                uniqueCount++;
            }
        }

        int[] result = new int[uniqueCount];
        int y = 0;
        result[y++] = x[0];

        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] != x[i + 1]) {
                result[y++] = x[i + 1];
            }
        }
        System.out.print("Input: [ ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        System.out.print("Output: [ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static void Algo3() {
        int x[] = inputArray();
        System.out.println("Now Enter the element to be removed");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int forbidden = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y) {
                forbidden++;
            }
        }
        int[] result = new int[x.length - forbidden];
        int resultIndex = 0;

        for (int i = 0; i < x.length; i++) {
            if (x[i] != y) {
                result[resultIndex] = x[i];
                resultIndex++;
            }
        }
        System.out.println("Input ");
        printArray(x);
        System.out.println("Output ");
        printArray(result);
    }
    public static void Algo4() {
        int sum = 0;
        ArrayList<Integer> list = inputArrayList();

        for(int i = 0; i < list.size(); i++){
            sum = sum + list.get(i);
        }
        System.out.println("The sum is: " + sum);
    }
    public static void Algo5() {
        ArrayList<Integer> list = inputArrayList();
        ArrayList<Integer> result = new ArrayList<>();

        if (!list.isEmpty()) {
            result.add(list.get(0)); // Add first element

            for (int i = 0; i < list.size() - 1; i++) {
                if (!list.get(i).equals(list.get(i + 1))) {
                    result.add(list.get(i + 1));
                }
            }
        }

        // Print results
        System.out.print("Input: [ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        System.out.print("Output: [ ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static void Algo6() {
        ArrayList<Integer> list = inputArrayList();
        System.out.println("Now Enter the element to be removed");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        int forbidden = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == y) {
                forbidden++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != y) {
                result.add(list.get(i));
            }
        }

        System.out.println("Input ");
        System.out.print("[ ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i < list.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");

        System.out.println("Output ");
        System.out.print("[ ");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
    public static int[] inputArray() {
        System.out.println("how large is the array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            x[i] = scanner.nextInt();
        }
        return x;
    }
    public static ArrayList<Integer> inputArrayList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("how large is the arraylist");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            array.add(num);
        }
        return array;
    }
}


