public class rightrotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n=3;
        System.out.println("original array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");

        }

        for(int i=0;i<n;i++)
        {
            int temp;
            temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--)
            {
                arr[j] = arr[j-1];

            }
            arr[0] = temp;
        }
        System.out.println("after right rotate the new array is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+"");
        }
    }
}
