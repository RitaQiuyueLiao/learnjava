public class Puppy{
    int puppyAge;
    public Puppy (String name){

        System.out.println("小狗的名字是：" + name);

    }

    public void setAge(int age){
        puppyAge = age;
    }

    public int getAge(){

        Syetem.out.println("小狗的年龄是："+ puppyAge);
        return puppyAge;

    }
    public static void main(String[] args) {

         Puppy myPuppy= new Puppy("多多");
         myPuppy.setAge(3);
         myPuppy.getAge();
         System.out.prinln("（方法二）小狗的年龄是："+ myPuppy.puppyAge);
    }
}
