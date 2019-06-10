public class ArrayExercises {

    static int[] bubbleSort(int [] num){
        for(int i = 0; i < num.length; i++){
            int greatestValue = 0;
            for(int j = 0; j < num.length -1; j++){
                if(num[j] > num[j + 1]){
                    greatestValue = num[j];
                    num[j] = num[j+1];
                    num[j+1] = greatestValue;
                }
            }
        }
        return num;
    }


    public static void main(String[] args) {
        int [] num = {7,5,6,2,1,0,8,9};
        for(int a : bubbleSort(num)){
            System.out.println(a);
        }
    }

}
