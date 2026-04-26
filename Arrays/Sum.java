//Number of Consecutive pairs whose sum is k

package Arrays;

public class Sum {
    public static void main(String[] args) {
        int k =4 ;
        int[] arr= new int[] {1,3,4,2,2,5};
        int cnt=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]+arr[i+1]==k){
                cnt++;
            }
        }
        System.out.println("The count of the pairs are-"+ cnt );
    }
}
