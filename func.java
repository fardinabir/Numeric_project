
public class func {
//6x^3-5x^2+7x-2
	double f(double x)
	{
		double result=0;
		result=(6*Math.pow(x,3))-(5*Math.pow(x, 2))+(7*x)-2;
		//System.out.println(result);
		return result;
	}
	double fo(double x)
	{
		double result=0;
		result=2/(6*Math.pow(x,2)-5*x+7);
		//System.out.println(result);
		return result;
	}
}
