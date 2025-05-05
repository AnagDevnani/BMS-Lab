public class Prime{
    public static void main(String[] args){
        final int prime_num=15;
        int prime_flag=1;
        for (int i=1; i<prime_num; i++){
            if(prime_num%i==0){
                prime_flag=0;
            }
        }
        if (prime_flag==1){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
