import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
arraytry();
    }

    public static void arraytry() {
        try {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arr_size = 0;
        if (s.hasNextInt()) {
            arr_size = s.nextInt();
        }
        int[] arr = new int[arr_size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr_size; i++) {
            if (s.hasNextInt()) {
                arr[i] = s.nextInt();

                System.out.println(
                        "The elements of the array are: ");
                for (int z = 0; z < arr_size; z++) {
                    System.out.print(arr[z] + " ");
                }

            }
        }}catch (ArrayIndexOutOfBoundsException e1){
        System.out.println(e1.getMessage());
        }
    }}