 public class TestPassByValue{
    public static void main(String[] args){
        int num1=1;
        int num2=6;
        System.out.println("Before swap: number1 = " + num1 + " number2 = " + num2);

        //call swap method
        swap(num1,num2);
         System.out.println("After swap: number1 = " + num1 + " number2 = " + num2);
    }

    public static void swap(int n1, int n2){

         System.out.println("\t Before swap: number1 = " + n1 + " number2 = " + n2);
         int temp = n1;
         n1 = n2;
         n2 = temp;
         System.out.println("\t After swap: number1 = " + n1 + " number2 = " + n2);
    }
}
