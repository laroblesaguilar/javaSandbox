public class ArrayExercises {


    static int[] bubbleSort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int greatestValue = 0;
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] > num[j + 1]) {
                    greatestValue = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = greatestValue;
                }
            }
        }
        return num;
    }

    static int[] reverseIntArray(int[] num) {
        int[] reversed = new int[num.length];
        int j = 0;
        int i = num.length - 1;
        while (i >= 0) {
            reversed[j] = num[i];
            j++;
            i--;
        }
        return reversed;
    }

    static int greatestValue(int[] num) {
        int greatestValue = num[0];
        for (int a : num) {
            if (a > greatestValue) {
                greatestValue = a;
            }
        }
        return greatestValue;
    }


    static String reverseString(String string){
        String reversed = "";
        String [] arr = string.split(" ");
        for(int i = arr.length - 1; i >= 0; i--){
            if(i > 0){
                reversed += arr[i] + " ";
            } else {
                reversed += arr[i];
            }

        }
        return reversed;
    }

    static int smallestValue(int [] num){
     int smallestValue = num[0];
     for(int b : num){
         if(b < smallestValue){
             smallestValue = b;
         }
     }
     return smallestValue;
    }

    public static void main(String[] args) {

        int[] num = {7, 5, 6, 2, 1, 100, 8, 9};
        for (int a : bubbleSort(num)) {
            System.out.println(a);
        }

        int[] num1 = {1, 2, 3, 4, 5, 6,};

        for (int a : reverseIntArray(num1)) {
            System.out.println(a);
        }

        System.out.println(greatestValue(num));

        System.out.println(reverseString("I like watching movies"));

        System.out.println(smallestValue(num));

    }

}
