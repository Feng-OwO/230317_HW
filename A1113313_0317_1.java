import java.util.*;

public class A1113313_0317_1{
    public static void main(String[]argv){
        int m,n;
        Scanner input = new Scanner(System.in);
        System.out.printf("請輸入第一個整數 : ");
        m = input.nextInt();
        System.out.printf("請輸入第二個整數 : ");
        n=input.nextInt();

        int [][] result = new int[n][m];
       
        for(int v=0 ; v<n ; v++){
            for(int h=0 ;h<m;h++){
                result[v][h] = (v+1)*(h+1);
            }

        }
        
        for(int a[]:result){
            for(int b:a){
                System.out.printf("%d\t",b);
            }
            System.out.printf("\n");
        }
    }
}