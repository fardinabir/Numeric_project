import java.util.Scanner;

//6x^3-5x^2+7x-2

public class open {
	int n;
	private Scanner sc;
	void result()
	{
		System.out.println("Enter the open process:-\n1.Fixed point iterations\n2.Newton rapson method");
		sc = new Scanner(System.in);
		n=sc.nextInt();
		
		if(n==1)
		{
			double r;
			double xr=0,es,ea = 1000;
			int imax,itrs=1;
			
			System.out.println("Enter the value of initial guess:");
			xr=sc.nextDouble();
			
			System.out.println("Enter the value of es:");
			es=sc.nextDouble();
			
			System.out.println("Enter the value of MAX iterations(imax):");
			imax=sc.nextInt();
			
			r=fixtp(xr, es, ea, imax, itrs);
			System.out.println("\n\n\t\tResult is : "+r);
		}
		else
		{
			System.out.println("This method is not available...!");
		}
	}
	double fixtp(double xr,double es,double ea,int imax,int itrs)
	{
		double xrold=xr;
		func f=new func();
		if(itrs==1)
		{
			System.out.println("X"+itrs+"\t"+xr);
		}
		else
		{
			System.out.println("X"+itrs+"\t"+xr+"\tEa :  "+ea);
		}
		if(itrs>imax || (ea==0||ea<es))
		{
			return xr;
		}
		
		xr=f.fo(xr);
		
		ea=((xr-xrold)/xr*100)<0?(xr-xrold)/xr*100*-1 : (xr-xrold)/xr*100;
		itrs++;
		
		return fixtp( xr, es, ea, imax, itrs);
	}
	
}
