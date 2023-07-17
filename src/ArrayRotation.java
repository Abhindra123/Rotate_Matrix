import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static int[][] matrixTransPose(int arr[][],int r,int c){

        int ans[][]=new int[c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
    }
    public static int[][] rotate(int arr[][]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            int s=0;
            int e= arr.length-1;
            while(s<e){
                temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;
                e--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int transpose[][]=matrixTransPose(arr,r,c);
        int rotate[][]=rotate(transpose);
        System.out.println(Arrays.deepToString(rotate));
    }
}