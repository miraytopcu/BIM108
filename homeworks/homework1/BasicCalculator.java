public abstract class BasicCalculator {
    public int summation(int number_1, int number_2){
        return number_1 + number_2;
    }

    public int subtraction(int number_1, int number_2){
        return number_1 - number_2;
    }

    public int multiplication(int number_1, int number_2){
        return number_1 * number_2;
    }

    public double division(int number_1, int number_2){
        return (double) number_1 / number_2;
    }

    public abstract int summation(int[] arr);

    public abstract int pow(int number_1, int number_2);

    public abstract int fibonacci(int index);

    public abstract int factorial(int number);

    public abstract int min(int[] arr);

    public abstract int max(int[] arr);

}
