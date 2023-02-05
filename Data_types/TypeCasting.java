package Data_types;

public class TypeCasting {
    public static void main(String[]args){
        int a =45;
        double b;
        b=a;

        System.out.println(b);
        double num1=45.5;

        int num2;
        // num2=num1;give error because we cannot go big to small 
        num2=(int)num1;
        System.out.println(num2);
    }
}
