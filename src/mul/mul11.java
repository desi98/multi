package mul;

public class mul11 {
    public static void main(String[] args){
        int num[][] ={{4,3,2,1},{23,5,9,7}};
        int sach[][]={{1,3,4,2,45},{2,5,2,8,6}};
        System.out.println(num[1][3]);
        System.out.println(sach.length);

        for(int row=0; row<sach.length;row++){
            for(int col=0; col<sach[row].length;col++){
                System.out.print(sach[row][col] +"\t");

            }
            System.out.println();
        }
    }
}
