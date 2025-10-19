public class prefix_sum{

    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int len = arr.length;

        int[] prefix = new int[len+1];

        prefix[0] = 0;

        for(int i=0;i<len;i++)
        {
            prefix[i+1] = prefix[i] + arr[i];
        }

        for(int i=0;i<len+1;i++)
        {
            System.out.println(prefix[i]);
        }

        System.out.println("First 5:"+prefix[5]);
        System.out.println("3 - 8 :"+(prefix[8]-prefix[2]));
    }
}