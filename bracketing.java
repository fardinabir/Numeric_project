import java.util.Scanner;

public class bracketing {
	int n;
	void result()
	{
		System.out.println("Enter the bracketing process:-\n1.Bisection\n2.False positioning");
		sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n==1)
		{
			double r;
			double xl,xu,xr,es,ea = 1000;
			int imax,itrs=1;
			System.out.println("Enter the value of Xl:");
			xl=sc.nextDouble();
			
			System.out.println("Enter the value of Xu:");
			xu=sc.nextDouble();
			
			xr=(xl+xu)/2;
			
			System.out.println("Enter the value of es:");
			es=sc.nextDouble();
			
			System.out.println("Enter the value of MAX iterations(imax):");
			imax=sc.nextInt();
			r=bisection(xl, xu, xr, es, ea, imax, itrs);
			System.out.println("\n\n\t\t***Result is : "+r);
		}
		
		else
		{
			System.out.println("This method is not available...!");
		}
	}
	private Scanner sc;
	public double bisection(double xl,double xu,double xr,double es,double ea,int imax,int itrs)
	{
		func f=new func();
		double xrold=xr,c=f.f(xr)*f.f(xl);
		if(itrs!=1)
		{
			System.out.println("Itrs : "+itrs+"\tXl : "+xl+"\tXu : "+xu+"\tXr : "+xr+"\tEa : "+ea);
		}
		else
		{
			System.out.println("Itrs : "+itrs+"\tXl : "+xl+"\tXu : "+xu+"\tXr : "+xr);
		}
		
		if(c<0)
		{
			xu=xr;
		}
		else if(c>0)
		{
			xl=xr;
		}
		else 
		{
			ea=0;
		}
		if(itrs>imax || ea<es)
		{
			return xr;
		}
		xr=(xu+xl)/2;
		ea=(xr-xrold)<0?(xrold-xr)/xr*100 : (xr-xrold)/xr*100;
		
		itrs++;
		
		return bisection(xl, xu, xr, es, ea, imax, itrs);
		
	}
	
}
