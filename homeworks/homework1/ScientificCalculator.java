public class ScientificCalculator extends BasicCalculator{

    @Override
    public int summation(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    @Override
    public int pow(int number_1, int number_2){
        if(number_2 == 0){
            return 1;
        }
        else{
            int power = number_1;
            for (int i = 1; i < number_2; i++) {
                power *= number_1;
            }
            return power;
        }
    }

    @Override
    public int fibonacci(int index){
        //F(n) = F(n-1) + F(n-2)
        //0-1-1-2-3-5-8-13-21-34-55-89-144...
        //first and second index are default

        if (index <= 1) {
            return index;
        }

        int first_item = 0;
        int second_item = 1;
        int result = 0;

        for(int i = 2; i<= index; i++){
            result = first_item + second_item;
            first_item = second_item;
            second_item = result;
        }
        return first_item;
    }

    @Override
    public int factorial(int number){
        int result = 1;
        for(int i=1; i<=number; i++){
            result *= i;
        }
        return result;
    }

    @Override
    public int min(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] <= min){
                min = arr[i];
            }
        }
        return min;
    }

    @Override
    public int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
}
