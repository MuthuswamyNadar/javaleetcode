public class Reversearr {
    public static void main(String[] args) {
        int [] mytrr={10,20,30,4060,29,5,3};
        int a=setmini(mytrr);
        int b=setmax(mytrr);
        System.out.println("The min arra "+a);
        System.out.println("The max arra "+b);
    }

    public static int setmini(int[] A)
    {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }
    public static  int setmax(int []A)
    {
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>maxx)
            {
                maxx=A[i];
            }
        }
        return maxx;
    }
}
