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
public class TestUSCrimeClass1 {
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
          File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test.txt");
         // File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test2.txt");
         // File inFile = new File("C://Users//ssewell//OneDrive//UMUC-FALL-2020//FinalProject//Crime3-test3.txt");
          if (inFile.exists()){
               System.out.println("*** Crime File exists");
           }
          
          try{ 
              Scanner fileIn = new Scanner(inFile); 
              fileIn.useDelimiter(",");
              
          while(fileIn.hasNext()){ 
                for(int i = 0; i < rowLength;  ++i){
                    for(int j = 0; j < colLength; ++j){
                          //System.out.println(j);
                            uscs[i][j] = fileIn.next();
                            // System.out.println(uscs[i][j] + " Row# - " + i + " col# - " + j); 
                            System.out.println(uscs[i][j]);    
                        
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
                               System.out.println("Accessing population growth");
                               USCrimeClass uscs1 = new USCrimeClass(uscs);                               
                                                       
                               break;
                           case "2": 
                               //System.out.println("Finding the year with highest Murder rate");
                              // USCrimeClass maxMR = new USCrimeClass(uscs);
                               System.out.println("");
                               //System.out.println("The Murder rate was highest in " + maxMR.mrMax(uscs));
                               //System.out.println("");
                              // USCrimeClass.mrMax(uscs);
                               break;
                           case "3": 
                               // USCrimeClass.mrMin(uscs);
                               break;
                           case "4":    
                               //System.out.println("Finding the year with highest Robbery rate");
                               USCrimeClass maxRR = new USCrimeClass();
                               System.out.println("");
                              // System.out.println("The Robbery rate was lowest in " + maxRR.rRMax(uscs));
                               System.out.println("");
                               break;
                           case "5": 
                               //System.out.println("Finding the year with lowest Robbery rate");
                               USCrimeClass minRR = new USCrimeClass();
                               System.out.println("The Robbery rate was lowest in " + minRR.rRLow(uscs));
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
