
public class MinMaxFinder {
	public int[] findMinMax(int arr[]) 
	{
		int min=arr[0];
		int max=arr[0];
		int minmax[] = new int[2];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			else if(max<arr[i])
			{
				max=arr[i];
			}			
		}
		minmax[0]=min;
		minmax[1]=max;
		
		return minmax;
	}
}
