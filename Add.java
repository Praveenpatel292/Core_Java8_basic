package com.pp.java;

/*we have to create interface if we want to use lambdaExpression without interface we can't use lambdaExpression
no need to implement interface in below class */
interface AddNumbere{
	 public int addTwoNumber (int i, int j);
}

/*then i have created one class*/
public class Add {

	// always method is entry point of our Application
	public static void main(String[] args) {
		
		System.out.println("Application Start");
		/*then here we are using our interface method by using lambda Expression
		 * and performing two number addition operation then we get the out put in below*/
		
		AddNumbere add  = (i,j) -> { 
			return i + j ;};
			System.out.println(add.addTwoNumber(10, 20));
			
			//our application execution completed
			System.out.println("Appliction Excution Complete");
			
			 }	
	
}
