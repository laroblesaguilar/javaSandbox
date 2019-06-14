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

    static String[] reverseStringArray(String [] arr){
        String [] reversed = new String [arr.length];
        int i = arr.length -1;
        int j = 0;
        while(i >= 0){
            reversed[j] = arr[i];
            j++;
            i--;
        }

        return reversed;
    }

    static String[] fillArray(String [] arr, String fillWith){
        for(int i = 0; i < arr.length; i++){
            arr[i] = fillWith;
        }

        return arr;
    }

    static boolean intEquals(int [] num, int [] num2){
        if(num.length != num2.length){
            return false;
        } else{
            for(int i = 0; i < num.length; i++){
                if(num[i] != num2[i]){
                    return false;
                } else{
                    return true;
                }
            }
        }
        return true;
    }

    static boolean searchFor(String [] arr, String searchFor){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(searchFor)){
                return true;
            }
        }

        return false;
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

        String [] test = {"this", "is", "a", "test"};

        for(String s : reverseStringArray(test)){
            System.out.println(s);
        }

        for(String s : fillArray(new String [5], "test")){
            System.out.println(s);
        }

        int [] numb = {1,2,3};
        int [] numb1 = {1,2,3};

        System.out.println(searchFor(test, "no"));


    }

}
