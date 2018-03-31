import java.util.Scanner;

public class gauss {

	int i,j,k,n,m;
	float sum=0,c=0;
	float[] x= new float[10];
	float[][] a=new float[10][10];
	Scanner sc=new Scanner(System.in);
	gauss()
	{
		System.out.println("Enter the order of the equations:- ");
		n=sc.nextInt();
		System.out.println("\nEnter the gauss method:-\n1.Naive Gauss\n2.Gauss Jordan\n3.Gauss Seidal\n");
		int m=sc.nextInt();
		System.out.println("Enter the coefficients of the equations:- ");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n+1;j++)
			{
				System.out.printf("A%d%d = ",i,j);
				a[i][j]=sc.nextFloat();
			}
			System.out.printf("\n");
		}
		
		if(m==1)
			ngauss();
		else if(m==2)
			gaussJordan();
		else if(m==3)
		{
			
			double eps = 0;
			System.out.println("Enter the value of eps:- ");
			eps=sc.nextDouble();
			int iter = 0;
			System.out.println("Enter the value of iter:- ");
			iter=sc.nextInt();
		    new gaussSeidel( a, n, iter, eps);
		}
			
	}
	float ngauss()
	{
		int p,q;
		for(i=1;i<=n;i++)
		{
			for(j=i+1;j<=n;j++)
			{
				c=a[i][i]/a[j][i];
				for(k=1;k<=n+1;k++)
				{
					a[j][k]=a[i][k]-(a[j][k]*c);
				}
				for(p=1;p<=n;p++)
				{
					for(q=1;q<=n+1;q++)
					{
						System.out.print(a[p][q]+" ");
					}
					System.out.println("");
				}
				System.out.println("");
			}
		}
		x[n]=a[n][n+1]/a[n][n];
		for(i=n-1;i>0;i--)
		{
			sum=0;
			for(j=i+1;j<=n;j++)
			{
				sum=sum+a[i][j]*x[j];
			}
			x[i]=(a[i][n+1]-sum)/a[i][i];
		}
		System.out.println("The Values are:-");
		for(i=1;i<=n;i++)
		{
			System.out.println("X"+i+" = "+x[i]);
		}
		return c;
	}
	float gaussJordan()
	{
		int p,q;
		for(i=1;i<=n;i++)
		{
			for(j=i+1;j<=n+1;j++)
			{
				a[i][j]=a[i][j]/a[i][i];
			}
			a[i][i]=1;
			for(j=i+1;j<=n;j++)
			{
				c=1/a[j][i];
				for(k=1;k<=n+1;k++)
				{
					a[j][k]=a[i][k]-(a[j][k]*c);
				}
				
				
				for(p=1;p<=n;p++)
				{
					for(q=1;q<=n+1;q++)
					{
						System.out.print(a[p][q]+" ");
					}
					System.out.println("");
				}
				System.out.println("");
				
				
			}
		}
		x[n]=a[n][n+1]=a[n][n+1]/a[n][n];
		System.out.println("\n\n\n");
		for(i=n;i>=1;i--)
		{
			for(j=i-1;j>=1;j--)
			{
				for(p=1;p<=n;p++)
				{
					for(q=1;q<=n+1;q++)
					{
						System.out.print(a[p][q]+" ");
					}
					System.out.println("");
				}
				System.out.println("");
				
				a[j][n+1]=a[j][n+1]-(a[j][i]*a[i][n+1]);
				a[j][i]=0;
			}
		}
		for(i=1;i<=n;i++)
		{
			System.out.println("X"+i+" = "+a[i][n+1]);
		}
		
		return c;
		
	}
	float gaussSeidal()
	{
		return c;
		
	}
	
}

/*
 * 
 * inputs:-
 * 
3
-.1
-.2
7.85

.1
7
-.3
-19.3

.3
-.2
10
71.4

outputs:-
x1=3.0
x2=-2.5
x3=6.999995
*/
