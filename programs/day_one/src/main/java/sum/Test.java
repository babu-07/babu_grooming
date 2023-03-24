package sum;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

    public void addLargest(int a[]){
        Arrays.sort(a);
        int target=a[a.length-1];
        System.out.println(target);
        System.out.println(find(a,target));
    }

    public String find(int arr[],int target){
        int sum=0;
        ArrayList ay=new ArrayList();
        for(int i=0;i<arr.length-1;i++){
            sum=arr[i];
            ay.clear();
            ay.add(arr[i]);
            for(int j=arr.length-1;j>=0;j--){
                if (sum == target) {
                    return "Found elements "+ay.toString();
                }
                else if ((i!=j) && (sum + arr[j]) <= target) {
                    sum = sum + arr[j];
                    ay.add(arr[j]);
                }
            }
        }
        return "Not Found";
    }

    public static void main(String args[]){
        Test t=new Test();
        int a[]={24,1,7,19,4};
        t.addLargest(a);
    }
}
