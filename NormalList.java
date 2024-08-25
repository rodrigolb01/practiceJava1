public class NormalList
{
     private int[] arr;

    NormalList(int[] arr)
     {
        this.arr = arr;
     }
    
    public int[] getArr() {
        return arr;
    }

    public void print()
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.println("element " + i + " : " + arr[i]);
        }
    }
}

