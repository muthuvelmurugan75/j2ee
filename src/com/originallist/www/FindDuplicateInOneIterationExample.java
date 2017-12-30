package com.originallist.www;



	public class FindDuplicateInOneIterationExample{
	    static int ar[]={3,7,3,5,8,9,24,8,9}; //given array
	    
	    public static void main(String[] args) {
	    	
	           displayDuplicateInOneIteration();     
	   
	    }
	    
	    /*
	     * Method for displaying duplicate in one iteration
	     */
	    static  void displayDuplicateInOneIteration(){
	           
	           int temp[]=new int[100];
	           System.out.print("\nduplicates :  ");
	           for (int j = 0; j < ar.length; j++){ 
	        	 /*make indexes of tempAr corresponding to value found in ar equal to 1.
	                                                                               i.e if i[0]=22, than make tempAr[22]=1;
	                                                                              if i[1]=25, than make tempAr[25]=1; */
	                  if(temp[ar[j]]==0){
	                        temp[ar[j]]=1;
	                  }
	                  else{
	                        System.out.print(ar[j]+" ");
	                  }
	           }   
	    }   
	    
	}	

	
	


