public class Array {
    public static void main(String[] args) {
        //repo link
        //https://github.com/MuthuswamyNadar/javaleetcode.git
        // Reverse Array ( https://youtu.be/80auISlKy50?si=7FShi_mpAkxKIiDP )
        int [] myarray={10,30,560,80,23};
        revarray(myarray);
        for(int i=0;i<myarray.length;i++)
        {
            System.out.print(myarray[i]+" ,");
        }
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
