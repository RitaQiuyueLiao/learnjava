public class VarargsDemo{
    
    public static void main(String[] args){
        printMax(32,57,21,66,9.3,71.6);
        printMax(new double[]{2.6,1,2});
        }
        
        public static void printMax(double...numbers){
            if(numbers.length==0){
                System.out.println("No argument passed");
                return;
                }
                
                double result=numbers[0];
                for(int i=0; i<numbers.length; i++){
                    if(numbers[i]>result){
                        result=numbers[i];
                        }
        }
                        System.out.println("The max number is: "+result);
                
}
}
