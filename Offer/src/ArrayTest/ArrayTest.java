package ArrayTest;

/**
 * Created by 49005 on 2017/3/16.
 * 思路：因为是从左向右递增，从上向下递增。所以从右上角开始找，如果大于右上角则行数++,
 * 如果小于右上角则列数--；如果等于则返回TRUE
 */
public class ArrayTest {
    public static void main(String[] args){
        int[][] testArray={{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,10,15}};
        System.out.println(find(testArray,16));
    }

    public static boolean find(int[][] testArray,int key){
        int i=0;
        int k=testArray.length;//行数
        int j=testArray[0].length-1;//列数
        while(i<k&&j>=0) {
            //从右上角开始找
            if (key < testArray[i][j]) {
                j--;
            } else if (key > testArray[i][j]) {
                i++;
            } else if (key == testArray[i][j]) {
                return true;
            }
        }
        return false;
    }
}
