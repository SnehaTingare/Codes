package Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,45,12,9};
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
    System.out.println("The max element is "+ max);
    }
}
