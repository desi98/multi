package mul;

public class mul10 {
    public static void main(String[] args){
        int num[]={12,44,54,66,};
        change(num);

        for(int j:num)
            System.out.println(j);
    }
    public static void change(int x[]) {
        for (int i = 0; i < x.length; i++)
            x[i] += 10;
    }
}
