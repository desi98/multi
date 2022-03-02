package mul;

public class Assignment {
    public static void main(String[] args){

        int count=0;
        for( int i = 1; i < 1000; i++){

            if(( i % 5 == 0) || (i % 7 == 0) ){
                count=count+i;

            }

        }
        System.out.println("The sum of the number divisible by 5or 7 is:" +count);
    }
}
