import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] firstArray = new int[]{90, 80, 70, 60, 50, 40, 30, 20, 10};
        int min=0;
        for (int i = 0, j = 1; i < firstArray.length; i++,j++) {
           min=firstArray[i];  //90
            if (min<firstArray[j]) {
                firstArray[i]=min;
                System.out.println("Min is: " + Arrays.toString(firstArray));
            }
           else if (min>firstArray[j]) {
                firstArray[i]=firstArray[j];
                System.out.println("Min is: " + Arrays.toString(firstArray));
            }
        }
        System.out.println("Min is: "+firstArray);



    }
        }
