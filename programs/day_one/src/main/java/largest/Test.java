package largest;

import java.util.Arrays;

public class Test {
    public void nLargest(int a[],int n){
        Arrays.sort(a);
        System.out.println(n+" Largest number: "+a[a.length-n]);
    }
    public void nSmallest(int a[],int n){
        Arrays.sort(a);
        System.out.println(n+" Smallest number: "+a[n-1]);
    }

    public static void main(String args[]){
        int arr[] = {1,5,8,90,2,4,10,14,3,55};
        Test t=new Test();
        t.nLargest(arr,2);
        t.nSmallest(arr,2);

    }
}
