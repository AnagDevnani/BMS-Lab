public class Fibonnaci{
    public static void main(String[] args){
        int fibonacci_lower_limit=1;
        int fibonacci_upper_limit=4;
        int fibo_first=0, fibo_second=1, sum=0;
        do{
            System.out.println(fibo_first);
            sum = fibo_first + fibo_second;
            fibo_first=fibo_second;
            fibo_second=sum;
            fibonacci_lower_limit+=1;
        }while(fibonacci_lower_limit<=fibonacci_upper_limit);
    }
}
