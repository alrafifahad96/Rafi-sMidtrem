package math.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        int a[]={10, 2, 1, 4, 5, 3, 7, 8, 6};
        int sum =0;
        for (int i= 0; i<a.length; i++){
            sum = sum+a[i];

        }
        System.out.println(sum);
        int total = 0;
        for (int j =0; j<=10; j++){
            total = total +j;

        }

        System.out.println(total);
        System.out.println("Missing number is -->" + (total-sum));

    }
}