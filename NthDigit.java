import java.util.Scanner;

public class NthDigit {
    public static void main(String[] args) {
        int position = 10;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        String str = "";

        for(int j=0; j<10; j++){
            arr[j] = sc.nextInt();
        }

        for( int i=0; i<arr.length; i++){
            str+=arr[i];
        }
        System.out.println(str);

        System.out.println(str.charAt(position));
        sc.close();
    }
}
