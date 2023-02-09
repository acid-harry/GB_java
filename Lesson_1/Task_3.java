class GFG{
 
static int[] task3(int []array,
                              int toMove)
{
    int i = 0;
 
    int j = array.length - 1;
    
    while (i < j)
    {
        while (i < j && array[j] == toMove)

            j--;
 
        if (array[i] == toMove)
 
            swap(array, i, j);
 
        i++;
    }
 
    return array;
}
 
static int[] swap(int []arr, int i, int j)
{
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
}
 
public static void main(String[] args)
{
    int []arr = { 1, 1, 3, 5, 6 };
    int K = 1;
    int []ans = task3(arr, K);
 
    for(int i = 0; i < arr.length; i++)
       System.out.print(ans[i] + " ");
}
}