public class Array {
    public static void main(String[] args) {
        //repo link
        //https://github.com/MuthuswamyNadar/javaleetcode.git
        // Reverse Array ( https://youtu.be/80auISlKy50?si=7FShi_mpAkxKIiDP )
        int [] myarray={10,30,560,80,23};
        int myN=myarray.length;
        revarray(myarray);
        for(int i=0;i<myarray.length;i++)
        {
            System.out.print(myarray[i]+" ,");
        }
        System.out.println("****************************");
        System.out.println("The max is "+maxvalue(myarray,myN));
        System.out.println("The min value is "+minvalue(myarray,myN));

    }
    static int maxvalue(int [] max,int N)
    {
        int maxx=Integer.MIN_VALUE;
        for (int i=0;i<N;i++)
        {
            if(max[i]>maxx)
            {
                maxx=max[i];
            }
        }
        return maxx;
    }

    static int minvalue(int []min,int N)
    {
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<N;i++)
        {
            if(min[i]<minn)
            {
                minn=min[i];
            }
        }
        return minn;
    }

    static void revarray(int[] myarr)
    {
        int i=0;
        int j=myarr.length-1;
        while (i<j)
        {
            int temp=myarr[i];
            myarr[i]=myarr[j];
            myarr[j]=temp;
            i++;
            j--;
        }
    }
}
