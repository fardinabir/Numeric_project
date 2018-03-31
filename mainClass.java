import java.awt.Color;
import java.awt.Container;
import java.awt.event.ContainerEvent;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class mainClass {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);		
		//System.out.println("For the function : 6x^3-5x^2+7x-2\n\n");
		System.out.println("Enter the method:-\n1.Bracketing Method\n2.Open Method\n3.Gauss Method\n");
		int n=sc.nextInt();
		if(n==1)
		{
			bracketing bc= new bracketing();
			bc.result();
		}
		else if(n==2)
		{
			open op = new open();
			op.result();
		}
		else if(n==3)
		{
			new gauss();
		}
		else
		{
			System.out.println("Ekhono koirni...! :-)");
		}
		
	}

}