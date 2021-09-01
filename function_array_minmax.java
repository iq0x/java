public class Main
{
    public static void main (String[] args)
    {
		int array[] = {2, 3, 1, 0, 2, 4, 1, 7, 2, 8, 3, 9};	
			 
		System.out.print("MIN:\t"); 
		display(MIN(array));
		
		System.out.print("MAX:\t"); 
		display(MAX(array));
		
		System.out.print("SUMME:\t"); 
		display(SUMME(array));
		
		System.out.print("ARRAYS:\t"); 
		display(NVALUE(array));
    }
       
//-----------------------------------------------------------------

	static int NVALUE(int[] array) 
	{
		return array.length;
    }
    
    
	static int MITTELWERT(int[] array) 
	{
		int mittelwert;
		mittelwert = SUMME(array)/ array.length;
		return mittelwert;	
    }
    
    
	static int SUMME(int[] array) 
	{
		int summe = 0;
		
		for(int i = 1; i < array.length; i++)
		{
			summe += array[i];   
		}
		return summe;
    }
    
    
	static int MIN(int[] array) 
	{
		int min = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
	
		  if(min > array[i])
		  {
			min = array[i];
		  }		   		   
		}
		return min;	
    }
    
    
    static int MAX(int[] array) 
	{
		int max = array[0];
		
		for(int i = 1; i < array.length; i++)
		{
	
		  if(max < array[i])
		  {
			max = array[i];
		  }		   		   
		}
		return max;	
    }
    
    
    static void display(int zahl) 
    {
		System.out.println(zahl);

    }
    
    
}
