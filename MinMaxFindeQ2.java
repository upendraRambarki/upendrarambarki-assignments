import java.util.Objects;

public class MinMaxFindeQ2 {
	int minimum;
	int maximum;
	public MinMaxFindeQ2 findMinMax2(int arr[]) 
	{
		MinMaxFindeQ2 m = new MinMaxFindeQ2();
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
		m.minimum=min;
		m.maximum=max;
		
		return m;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maximum, minimum);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MinMaxFindeQ2 other = (MinMaxFindeQ2) obj;
		return maximum == other.maximum && minimum == other.minimum;
	}
}
