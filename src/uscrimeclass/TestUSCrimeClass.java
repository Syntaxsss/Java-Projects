package uscrimeclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner; 

/* 
* CMIS 141-7385 Introductory Programming
* Intructor: Anthony Baird 
* Author:  Stacy Sewell
* File:    TestUSCrimeClass.java
* Date:    12-10-2020
* Purpose: Final Project - US Crime Statistical Application 
* 
*/
public class TestUSCrimeClass {
    public static void main(String[] args) throws FileNotFoundException, InterruptedException {
        
            final int rowLength = 20;
            final int colLength = 20; 
         // final int rowLength = 19;
         // final int colLength = 20; 
         
           String [][] uscs = new String [rowLength][colLength];
          
          long begin = System.currentTimeMillis();
          for (int t = 0; t <5; t++) {
            Thread.sleep(60);
          }
            // finding the time after the operation is executed
            long stop = System.currentTimeMillis();
            //finding the time difference and converting it into seconds
            float sec = (stop - begin) / 1000F; 
            System.out.println(" ");
        
          
          System.out.println("Enter the name of the Input file: ");      
          Scanner fName = new Scanner(System.in);
          
          String fileName = fName.nextLine();
          //String fileName = "f://Crime-test.csv";
                  
          // File inFile = new File("f://Crime-test.csv");
         // File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test.txt");
         File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test1.txt");
         //File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test2.txt");
         //File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test3.txt");
          if (inFile.exists()){
               System.out.println("*** Crime File exists");
           }
          
          try{ 
              Scanner fileIn = new Scanner(inFile); 
              //fileIn.useDelimiter(",");
              
          while(fileIn.hasNext()){ 
                for(int i = 0; i < rowLength;  i++){
                    for(int j = 0; j < colLength; j++){
                          //System.out.println(j);
                            uscs[i][j] = fileIn.next();
                            System.out.println(" Row-[" + i + "]"+ " col- [" + j + "]" + uscs[i][j] );                         
                    }                        
                }
          }
            
               
           fileIn.close();
          }catch (FileNotFoundException e){
              System.out.println("error - " + e);
          }catch (NoSuchElementException e){
              System.out.println("No Such Element E - " + e);
          }
          
              String ms = null;     
              
            do{    
                                            
                System.out.println("****************** Welcome to the US Crime Statistical Application ******************");
                System.out.println(" ");
                System.out.println("Enter the number of the question you want answered.  Enter ‘Q’ to quit the program : ");
                System.out.println(" ");
                System.out.println("1. What were the percentages in population growth for each consecutive year from 1994 – 2013?");
                System.out.println("2. What year was the Murder rate the highest?");
                System.out.println("3. What year was the Murder rate the lowest?");
                System.out.println("4. What year was the Robbery rate the highest?");
                System.out.println("5. What year was the Robbery rate the lowest?");
                System.out.println("Q.  Quit the program");
                System.out.println(" ");
                System.out.println("Enter your selection: ");

                Scanner menuItem = new Scanner(System.in);

                ms = menuItem.nextLine();

                       switch(ms){
                           case "1": 
                               USCrimeClass uscs1 = new USCrimeClass(uscs);  
                               //uscs1.popGrowth(uscs,r1);
                              // System.out.printf("Population Growth precentage : %.3f%%",  uscs1.popGrowth(uscs, r1));
                               System.out.printf("1994 - 1995 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,0));
                               System.out.println(" ");
                               System.out.printf("1995 - 1996 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,1));
                               System.out.println(" ");
                               System.out.printf("1996 - 1997 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,2));
                               System.out.println(" ");
                               System.out.printf("1997 - 1998 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,3));
                               System.out.println(" ");                         
                               System.out.printf("1998 - 1999 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,4));
                               System.out.println(" ");
                               System.out.printf("1999 - 2000 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,5));
                               System.out.println(" ");
                               System.out.printf("2000 - 2001 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,6));
                               System.out.println(" ");
                               System.out.printf("2001 - 2002 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,7));
                               System.out.println(" ");      
                               System.out.printf("2002 - 2003 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,8));
                               System.out.println(" ");
                               System.out.printf("2003 - 2004 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,9));
                               System.out.println(" ");
                               System.out.printf("2004 - 2005 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,10));
                               System.out.println(" ");
                               System.out.printf("2005 - 2006 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,11));
                               System.out.println(" ");                         
                               System.out.printf("2006 - 2007 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,12));
                               System.out.println(" ");
                               System.out.printf("2007 - 2008 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,13));
                               System.out.println(" ");
                               System.out.printf("2008 - 2009 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,14));
                               System.out.println(" ");
                               System.out.printf("2009 - 2010 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,15));
                               System.out.println(" ");    
                               System.out.printf("2010 - 2011 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,16));
                               System.out.println(" ");
                               System.out.printf("2011 - 2012 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,17));
                               System.out.println(" ");
                               System.out.printf("2012 - 2013 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,18));
                               System.out.println(" ");    
                              // System.out.printf("2011 - 2012 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,19));
                              // System.out.println(" ");
                              // System.out.printf("2012 - 2013 Population Growth precentage : %.4f%%",  uscs1.popGrowth(uscs,20));
                              // System.out.println(" ");    
                               break;
                           case "2": 
                               USCrimeClass uscs2 = new USCrimeClass(uscs);  
                               //USCrimeClass.mrMax(uscs);
                               System.out.println(" ");
                               System.out.println("The Murder rate was highest in " + uscs2.mrMax(uscs));
                               System.out.println(" ");
                               break;
                           case "3": 
                               USCrimeClass uscs3 = new USCrimeClass(uscs); 
                              // USCrimeClass.mrMin(uscs); 
                               System.out.println(" ");
                               System.out.println("The Murder rate was lowest in " + uscs3.mrLow(uscs));
                               System.out.println(" ");
                               break;
                           case "4":    
                               USCrimeClass uscs4 = new USCrimeClass();
                               System.out.println(" ");
                               System.out.println("The Robbery rate was highest in " + uscs4.mrRMax(uscs));
                               System.out.println(" ");
                               break;
                           case "5": 
                               //System.out.println("Finding the year with lowest Robbery rate");
                               USCrimeClass uscs5 = new USCrimeClass();
                               System.out.println(" ");
                               System.out.println("The Robbery rate was lowest in " + uscs5.rRLow(uscs));
                               System.out.println(" ");
                               break;
                           case "Q": 
                               System.out.println("Exiting Application");
                               System.out.println(" ");
                               break;
                           default: 
                               break;                               
                      }    
                       
            }while(!"Q".equals(ms));
    
     System.out.printf("Elapsed time in seconds was: %.2f ", sec);
     System.out.println(" ");
    }
 
}
