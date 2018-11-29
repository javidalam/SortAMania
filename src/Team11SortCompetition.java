public class Team11SortCompetition extends SortCompetition
{
    public int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = arr[left - 1];
        for(int j = left; j < right; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
    public void quickSort(int[] arr, int left, int right)
    {
        if(left < right)
        {
            int pivot = partition(arr, left, right);

            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }
    public int median(int[] arr)
    {
        if(arr.length % 2 != 0)
        {
            return arr[arr.length / 2];
        }
        return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2;
    }
    public void insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = arr[i]; j > 0; j++)
            {
                if( arr[j - 1] < arr[j])
                {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                j = 0;
            }
        }
    }
    @Override
    public int challengeOne(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
        return median(arr);
    }
    @Override
    public int challengeTwo(String[] arr, String query)
    {

    }
    @Override
    public int challengeThree(int[] arr)
    {
        insertionSort(arr);
        return median(arr);
    }
    @Override
    public int challengeFour(int[][] arr);
    {

    }
    @Override
    public int challengeFive(Comparable[] arr, Comparable query);
    {

    }
    //Add a custom greeting so your sorter can introduce itself
    public String greeting()
    {

    }
}
