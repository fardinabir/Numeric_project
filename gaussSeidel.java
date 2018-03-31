
public class gaussSeidel {
	private int n, iter; 
	public float[][] arr = new float[20][20+1];
	private double[] x = new double[20];
	private double[] p = new double[20];
	private double eps, sum;
	boolean ck = true;
	gaussSeidel(float[][] arr, int n, int iter, double eps)
	{
		this.n = n;
		for(int i = 0; i < n; i++)
			for(int j = 0; j < n+1; j++)
				this.arr[i][j] = arr[i][j];
		for(int i = 0; i < n; i++)
			x[i] = 0.0;
		this.iter = iter;
		this.eps = eps;
		
		Calculation();
	}
	private void Calculation()
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(Math.abs(arr[i][i]) < Math.abs(arr[j][i]))
				{
					for(int k = 0; k <= n; k++)
					{
						float temp = arr[i][k];
						arr[i][k] = arr[j][k];
						arr[j][k] = temp;
					}
				}
			}
		}
		println("The solutions of those equations:");
		for(int i = 0; i < n; i++)
		{
			System.out.printf("       x%d       ",i+1);
		}
		for(int i = 0; i < n; i++)
		{
			System.out.printf("       Ea%d       ",i+1);
		}
		println("");
		for(int pos = 1 ;iter > 0 && ck ; iter--, pos++)
		{
			for(int i = 0; i < n; i++)
				p[i] = x[i];
			
			for(int i = 0; i < n; i++)
			{
				sum = 0;
				for(int j = 0; j < n; j++)
				{
					if(i != j)
						sum += x[j]*arr[i][j];
				}
				x[i] = (arr[i][n]-sum)/arr[i][i];
			}
			for(int i = 0; i < n; i++)
	        {
	        	System.out.printf("    %10f   ",x[i]);
	        }
			println("");
			ck = cal();
		}
		ck = cal();
	}
	boolean cal()
	{
		boolean error = true;
		
		return error;
		
	}
	public static void print(Object s)
	{
		System.out.print(s);
	}
	public static void println(Object s)
	{
		System.out.println(s);
	}
}
