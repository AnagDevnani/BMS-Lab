public class Swap{
    public static void main(String[] args){
        int num1=5;
        int num2=10;
        System.out.println("Before Swapping:\n"+num1+'\n'+num2);
        int temp;
        temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping:\n"+num1+'\n'+num2);
    }
}
