public class FindLargestValue {
    public static void main(String[] args) {
        System.out.println("The application finds the largest value in the array.");

        int size;
        int[] array;
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + " :");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("Property list: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }

        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}