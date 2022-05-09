
public class bit {
	  public static int maxXor(int l, int h,int k)
	  {
	      
	      int[] arr= new int[5];
	    int temp=0;
	     
	    
	   for(int i=l ;i<h;i++)
	      {
	          for(int j=l+1;j<=h;j++)
	          {
	              if(((i!=j)&&((i^j)<=k))&&temp<(i^j))
	              {

	            	  
	            		
	            	
		                    temp=i^j;

	            		
	              }
	          }
	      }
	   
	      

	   return(temp);
	  }
	    
	    
	    public static void main(String args[]) {
	  
	  int lo=2;
	  int hi=4;
	  int k=10;

	  
	  bit demo = new bit();
	    
	       System.out.println(demo.maxXor(lo,hi,k));
	      
	    }
}
