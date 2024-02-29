package SmartCalculator;
import java.util.Scanner;


public class Calculator {
		
				double  simpleInterest;
				double CI;
				 double  percentage;
				 double principal,rate, time;
				int fact =1;
				Scanner sc = new Scanner(System.in);
				
			
				public Calculator() { 
					
				}
				

				public double calculateSimpleInterest() {
					
					
				    simpleInterest = principal*time*rate/100;
					return simpleInterest;
					
					
				}
				
			  
			public double calculateCompoundInteresr() {
				
				   System.out.println("Enter the principal amount: ");
					double principal = sc.nextDouble();
					
					System.out.println("Enter the time: ");
					double time = sc.nextDouble();
					
					System.out.println("Enter the rate: ");
					double rate = sc.nextDouble();
					
					 CI = principal*(Math.pow((1+rate/100),time));
					return CI;
					
				}
			   
			
			public double calculateMean() {
				
				   System.out.println("Enter for how many numbers you want to calculate mean: ");
				   int size = sc.nextInt();
				   
				   double[] nums = new double[size];
				   
				     System.out.println("Enters numbers one by one: ");
				     
				     for(int i =0; i<size ; i++) {
				    	 nums[i] = sc.nextDouble();
				     }
				     
				   double sum =0;
				   double mean;
				   
				   for(int i=0;i<size;i++)
				     sum = sum + nums[i];
				   mean = sum/size;
				   return mean;
				   
			   }
			   
			
			   public int calculateFactorial() {
				   
				   int num;
				     System.out.print("Enter Number to Calculate Factorial of a Number: ");
				     num = sc.nextInt();
				     
				   for(int i=num; i>0; i--)
			  		 fact= fact*i;
			  		 return fact;
				      
				   
			   }
			   
			  
			   public double calculatepercentage() {
				   
				   System.out.println("Enter the total marks: ");
					double totalmarks = sc.nextDouble();
					
					System.out.println("Enter the marks obtained: ");
					double marksObatained = sc.nextDouble();
					
				   percentage =  (marksObatained*100) /  totalmarks;
				 return percentage;
			   }
				
			   // Getters
			   
			 
			   public double getsimpleInterest() {
				   return simpleInterest;
			   }
			   
			   
			   
			   public double getCI() {
				   return CI;
			   }
			   
			 
			   public double getpercentage() {
				   return percentage;
			   }
			   // Setters
			   
			   public void setPrincipal(double principal) {
				   this.principal = principal;
			   }
			   public void setrate(double rate) {
				   this.rate = rate;
			   }
			   
			   public void settime(double time) {
				   this.time = time;
			   }
		}

