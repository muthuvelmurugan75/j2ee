package com.originallist.www;
import java.util.Arrays;

public class RemoveDuplicatesJavaExample 
{   
    static void removeDuplicates(int[] ad)
    {
       
         
         
        int noOfUniqueElements = ad.length;
         
         
        for (int i = 0; i < noOfUniqueElements; i++) 
        {
            for (int j = i+1; j < noOfUniqueElements; j++)
            {
                //If any two elements are found equal
                 
                if(ad[i] == ad[j])
                {
                    //Replace duplicate element with last unique element
                     
                    ad[j] = ad[noOfUniqueElements-1];
                    
                     
                    //Decrementing noOfUniqueElements
                     
                    noOfUniqueElements--;
                     
                    //Decrementing j
                     
                    j--;
                }
            }
        }
         
        //Copying only unique elements of arrayWithDuplicates into arrayWithoutDuplicates
         
        int[] arrayWithoutDuplicates = Arrays.copyOf(ad, noOfUniqueElements);
         
        //Printing arrayWithoutDuplicates
         
        System.out.println();
         
        System.out.println("Array Without Duplicates : ");
         
        for (int i = 0; i < arrayWithoutDuplicates.length; i++)
        {
            System.out.print(arrayWithoutDuplicates[i]+"\t");
        }
         
        System.out.println();
         
    }
     
    public static void main(String[] args) 
    {        
        
         
        removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
        
    }    
}