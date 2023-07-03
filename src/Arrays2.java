public class Arrays2 {
    public static void main(String[] args){
        // Create a new array with a capacity of 6.
        int[] array = new int[6];

// Current length is 0, because it has 0 elements.
        int length = 0;

// Add 3 items into it.
        for (int i = 0; i < 4; i++) {
            array[i] = i +1;
            // Each time we add an element, the length goes up by one.
            System.out.println(array[i]);
            length++;
        }

        System.out.println("The Array has a capacity of " + array.length);
        System.out.println("The Array has a length of " + length);
    }
}
