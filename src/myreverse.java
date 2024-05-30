public class myreverse {
    public static void main(String[] args) {
        int [] arr={10,30,40,60,780};
        reversearr(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void reversearr(int []arrr)
    {
        int i=0;
        int j=arrr.length-1;
        while (i<j)
        {
            int temp=arrr[i];
            arrr[i]=arrr[j];
            arrr[j]=temp;
            i++;
            j--;
        }
    }
}
