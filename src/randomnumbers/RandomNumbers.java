//package randomnumbers;

import java.util.Random;

/* 
* CMIS 141-7385 Introductory Programming
* Intructor: Anthony Baird 
* File:    testStateFlowerBird.java
* Author:  Stacy Sewell
* Date:    12-03-2020
* Purpose: Discussion 7 - Generate X random numbers
* 
*/
public class RandomNumbers {
    
    // args the command line arguments  
    public static void main(String[] args) {
        //intialize variables
       
        int randInt1 = 0;
        int randNumf = 0;
        int randInt2 = 0;
        int randInt = 0;
        int arraySize = 2;
        String str1;
        String str2;
        String prtRandNums;
        String randNumsPrt = null;
        
        //intialize array
              
        str1 = args[0];
        str2 = args[1];
               
        //parse integers
        int x = Integer.parseInt(str1);
        int y = Integer.parseInt(str2);
        
        //generate random numbers
        Random randomGen = new Random();
        randInt1 = randomGen.nextInt(x);
        randInt2 = randomGen.nextInt(y);
          
        System.out.println("Random numbers: " );
        //output the final random numbers
        for ( int j = 0; j < x; j++ ){            
            randNumf = randomGen.nextInt(y);
            System.out.print(" " + randNumf + " ");
        }
        System.out.print(" " + randNumf + " ");       
       
    }    
}

