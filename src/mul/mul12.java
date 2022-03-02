package mul;

public class mul12 {
    public static void main(String[]args){
        int num[][] ={{4,3,2,1},{23,5,9,7}};
        int sach[][]={{1,3,4,2,45},{2,5,2,8,6}};
        display(num);
        display(sach);
    }
    public static void display(int x[][]){
        for(int row=0;row<x.length;row++){
            for (int col=0;col<x[row].length;col++){
                System.out.print(x[row][col] +"\t" );
            }
            System.out.println();
        }
    }
}
