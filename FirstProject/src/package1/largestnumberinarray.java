package package1;

public class largestnumberinarray {

	public static void main(String[] args) {
		
		 int [] arr = new int [] {10, 20, 30, 40, 200, 70, 80, 81, 38};   
         int max= arr[0];
	       
	      
	        for(int i = 0; i < arr.length; i++) {  
	            
	                if(arr[i] >max)  
	                    max=arr[i];  
	            }  
	        System.out.println("Largest elements in given array: " +max);  

	}

}
