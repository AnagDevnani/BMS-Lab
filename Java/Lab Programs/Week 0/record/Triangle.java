public class Triangle{
    public static void main(String[] args){
        final int side1=3;
        final int side2=3;
        final int side3=4;
        if (side1==side2 && side1==side3){
            System.out.println("Triangle is Equilateral");
        }
        else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("Triangle is Isoceles");
        }
        else{
            System.out.println("Triangle is Scalene");
        }
    }
}
