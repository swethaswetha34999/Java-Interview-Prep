package set2;

public class MergeTwoIntArrayIntoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,5,7,9};
		int[] b= {0,2,4,6,8};
		
		int [] c=MergeAndSort(a,b);
		
		for(int i:c)
		{
			System.out.print(i+" ");
		}
		
		
		

	}

	private static int[] MergeAndSort(int[] a, int[] b) {
		int s1=a.length;
		int s2=b.length;
		int[] c=new int[s1+s2];
		int index=0;
		
		for(int i=0;i<s1;i++)
		{
			c[index++]=a[i];
			
		}
		
		for(int i=0;i<s2;i++)
		{
			c[index++]=b[i];
		}
		
		for(int i=0;i<c.length-1;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]>c[j])
				{
					int temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		return c;
	}

}
