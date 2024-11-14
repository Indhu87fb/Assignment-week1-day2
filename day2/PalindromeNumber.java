package week1.day2;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=121;
		int rev = 0;
		int output=input;
		for(int i=121;i>0;i=i/10)
		{
		rev =rev*10+i%10;
		}
		
		 if(rev==output) 
		 {   
			   System.out.println(rev +" :is palindrome number ");
		 }
		 else    
			  {
			   System.out.println("not palindrome"); 
			   }  

	}

}
