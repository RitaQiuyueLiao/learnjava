public class TestVoidMethod{
    public static void main(String[] args){
        printGrade(82.5);
    }

    public static void printGrade(double score){
        
        if(score >= 90){
            System.out.println("You did Great job!Your grade is A");
        }
        
        else if(score >= 80){
            System.out.println("Good job! Your grade is B");
        }
       
        else if(score >= 70){
            System.out.println("Not bad! Your grade is C");
        }
       
        else if(score >= 60){
            System.out.println("Try harder next time! Your grade is D");
        }
       
        else{
            System.out.println("Opussssss...You don't pass it. Your grade is F");
        }  
    }
}

