public class Selection_Sort
{
    void SelectionSort(int[] arr)
    {
        
        
        for(int i=0; i<arr.length; i++)
        {
            int min_index= i;
            for(int j = i+1; j< arr.length; j++)
            {
                if(arr[j]<arr[min_index])
                {
                    min_index = j;
                }
            } 
            	int  minNumber=arr[min_index];
            	arr[min_index]=arr[i];
            	arr[i]=minNumber;
        }
        
        for(int i = 0; i<arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args)
    {
        Selection_Sort ob = new Selection_Sort();
        int[] arr = {22, 9, 15, 64, 3, 0, 97};
        ob.SelectionSort(arr);
        /*
        for(int i = 0; i<arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }*/
        
    }
}