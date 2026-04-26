package Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = new int[]{45,21,65,84,2};

        int max=arr[0];
        int secmax=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];   
            }
        }
        System.out.println("The second max is-"+ secmax);
    }
}
