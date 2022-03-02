package mul;

public class mul13 {
    public static void main(String[] args){
        secondmethod("sachini", 23);
        secondmethod("dishala" ,22);
        System.out.println(thirdMethod(3,5));

    }public static void secondmethod(String name, int num){
        System.out.println("your name is :" +name +"\t" +
                 "age is :" +num);
    }public static int thirdMethod(int a, int b){
        int ans=a+b;
        return ans;
    }
}
