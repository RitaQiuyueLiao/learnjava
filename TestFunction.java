public class TestFunction{
  public static void main(String[] args){
       int i = 4;
       int j = 6;
       int k = Max(i,j);
       System.out.println("Comparing: "+i+" and "+j+". The max is : "+k);
}
       
       public  static int Max(int num1, int num2){
       int result;
       if (num1>num2)
           result = num1;
      
       else
           result = num2;

       return result;
}
}
