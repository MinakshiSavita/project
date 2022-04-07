public class LargestArray{
	public static void main(String[] args){
		int a []=new int []{44,21,56,21,44};
		
		 System.out.println("Duplicate element in given array :");
		
		for (int i=0;i<a.length;i++){
			
				for(int j=i+1;j<a.length;j++){
					
				if (a[i]==a[j])
		
			 System.out.println(a[j]);
				} 
		}
	}
	
}