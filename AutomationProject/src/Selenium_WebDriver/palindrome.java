package Selenium_WebDriver;


class palindrome 
{
	public static void main(String[]args) 
	{
	
		  int r,sum=0,temp;    
		  int n=303;//It is the number variable to be checked for palin10drome  
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    //sum 10
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		  System.out.println("hi iam single");
		}  
		}  
	
	


