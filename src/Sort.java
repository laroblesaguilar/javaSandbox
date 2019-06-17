public class Sort {

    static int [] bubblesort(int [] num){
        for(int i = 0; i < num.length; i++){
            int greatestValue = 0;
            for(int j = 0; j < num.length - 1; j++){
                if(num[j] > num[j+1]){
                    greatestValue = num[j];
                    num[j] = num[j+1];
                    num[j+1] = greatestValue;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int [] test = {10,2,4,5,7};
        for(int a : bubblesort(test)){
            System.out.println(a);
        }
    }
}
