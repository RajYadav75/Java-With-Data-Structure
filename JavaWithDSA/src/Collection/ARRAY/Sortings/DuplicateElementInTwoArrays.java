package Collection.ARRAY.Sortings;

public class DuplicateElementInTwoArrays
{
    public static void main(String[] args)
    {
        int[] arr1 = {10,30,70,40};
        int[] arr2 = {50,60,30,90,10};
        for (int i = 0; i < arr1.length; i++)
        {
            for (int j = 0; j < arr2.length; j++)
            {
                if (arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}