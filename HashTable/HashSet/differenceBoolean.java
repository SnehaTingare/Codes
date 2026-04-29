    package HashTable.HashSet;

    import java.util.HashSet;

    public class differenceBoolean {

        public static boolean givendiff(int arr[],int tar){
            HashSet<Integer> set=new HashSet<>();
            //x-y=t
            //x=t+y   y=x-t
            for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i]-tar) || set.contains(tar+arr[i])) return true;

            set.add(arr[i]);
            }
        return false;

        }

        public static void main(String[] args) {
            int[] arr = new int[]{5,10,3,2,50,80};
            int target=78;

            boolean res = givendiff(arr,target);

            System.out.println(res);
            
        }
    }
