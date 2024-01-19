/**
 * 
 */
package Git.Demo.V2;

import java.util.Scanner;


/**
 * 
 */
public class OperationDemo {

	/**
	 * @param args
	 */
	int num1;
	int num2;
public int	addnumbers(int n1,int n2){
	return (n1+n2);                             //Addition operation
}
public int difference(int n1,int n2){
	return(n1-n2);								//Subtraction operation
}
public int multiply(int n1, int n2) {
	return (n1*n2);								//Multiplication operation
}
public int getquotient(int n1, int n2) {		//Division operation
	return (n1/n2);
}
public int getremainder(int n1, int n2) {
	return (n1%n2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
int num1=sc.nextInt();
int num2=sc.nextInt();
OperationDemo d=new OperationDemo();
System.out.println("The sum of numbers = "+d.addnumbers(num1, num2));
System.out.println("The difference of the numbers is = "+d.difference(num1,num2));
System.out.println("The product of the numbers is = "+d.multiply(num1, num2));
System.out.println("The quotient of division operation = "+d.getquotient(num1, num2));
System.out.println("The remainder of divison operation = "+d.getremainder(num1, num2));
sc.close();

	}

}
