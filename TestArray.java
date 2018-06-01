public class TestArray{
    public static void main(String[] args){

        double[] myList = {1.3, 2.9, 3.1, 0.8, 5.7};

        //print out all the number is my array list
        for(int i=0; i < myList.length; i++){
            System.out.println( myList[i] + " " ); 
        }

        //Sum of all the numbers
        double Sum = 0;
        for(int i=0; i < myList.length; i++){
            Sum += myList[i];
        }
        System.out.println("The sum of all the number is : " + Sum);
       

        //Find the Max number
        double Max = myList[0];
        for(int i=0; i < myList.length; i++){
            if(myList[i]>Max){
                Max = myList[i];
            }
        }
        System.out.println("The Max number is: "+ Max);
       

        //Find the Minimum Number
        double Min = myList[0];
        for(int i =0; i<myList.length; i++){
            if(myList[i]<Min){
                Min = myList[i];
            }
        }
        System.out.println("The Min number is: "+ Min);
    
    }

}
