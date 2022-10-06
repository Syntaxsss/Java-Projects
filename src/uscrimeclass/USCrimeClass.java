package uscrimeclass;
/* 
* CMIS 141-7385 Introductory Programming
* Intructor: Anthony Baird 
* Author:  Stacy Sewell
* File:    USCrimeClass.java
* Date:    12-10-2020
* Purpose: Final Project - US Crime Statistical Application 
* 
*/
public class USCrimeClass {
    
       // public int pop1;
      //  public int pop2;
          
                     
        public USCrimeClass(){
                       
        }
    
        public USCrimeClass(String [][] array){   
         
        
        }  
         
        public double popGrowth(String [][] array, int r1){
        //public double popGrowth(String [][] array){
         
            int pop1 = 0;
            int pop2 = 0;       
            double popGrowthPrec = 0.0;
            int r = 0;                    
            for(r = r1; r < array.length; ++r ) {
            //for (r = r1; r < r1; ++r){
             //for(int c = 0; c < array[r].length; ++c){
             //switch(r){
               //    case 0:
                       
                       pop1 = Integer.parseInt(array[r][1]);                       
                       ++r;
                       pop2 = Integer.parseInt(array[r][1]); 
                       pop2 = (pop2 - pop1) ;
                       double pop3 = pop2;
                       //double pop4 = pop3 / pop1 * 100;
                       popGrowthPrec = pop3 / pop1 * 100;
                      
                                                                   
                       //++r;                      
                       //pop2 = Integer.parseInt(array[r][1]); 
                       //System.out.println("pop2 value = " + pop2);
                      // popGrowthPrec = ((pop2 - pop1)/pop1);
                       break;
                 //  default:
                 //      break;                        
               //}
                
           }                
                   
         return popGrowthPrec;       
        }
        
        //public static void mrMax(String [][] array){
        public String mrMax(String [][] array) {
            double max = Double.parseDouble(array[0][5]);
            double doubleParse = 0.0;
            double maxMRate = 0.0;
            String maxYr = array[0][0];
            int r;
            for(r = 0; r < array.length; ++r ) {
                //for(int c = 0; c < array[r].length; ++c ){
                  doubleParse = Double.parseDouble(array[r][5]);
                  if(doubleParse > max) {
                      maxMRate = Double.parseDouble(array[r][5]);                       
                      //System.out.print("max rate - " +  maxMRate);
                      maxYr = array[r][0];
                      break;                  
                  }  
            }
                      
            return maxYr;
         
        }   

        public static void mrMaxTest(String [][] array) {
            
              for(int i = 0; i < array.length; i++) {
                 for (int j = 0; j < array[i].length; j++){  
                    System.out.println("**** mrMaxTest = " + array[i][j]);                    
                    }
                    
              //  }   
            }
         //return doubleParse1;
         //return minMRate;
        }
        
        //public static void mrLow(String [][] array) {
          public String mrLow(String [][] array){            
            double min = Double.parseDouble(array[18][5]);
            double doubleParse = 0.0;
            double minMRate = 0.0;
            String minYr = array[18][0];
            int r;
            
            for( r = 0; r <array.length; ++r ) {
                doubleParse = Double.parseDouble(array[r][5]);
                  if(doubleParse < min) {
                      minMRate = Double.parseDouble(array[r][5]);                      
                      minYr = array[r][0];
                      //System.out.println("The Murder rate was lowest in " + minYr );    
                      break;
                    }
            }
         return minYr;
         //return minMRate;
        }
          
        public String mrRMax(String [][] array) {
            double max = Double.parseDouble(array[0][7]);
            double doubleParse = 0.0;
            double maxMRate = 0.0;
            String maxYr = array[0][0];
            int r;
            for(r = 0; r < array.length; ++r ) {
                //for(int c = 0; c < array[r].length; ++c ){
                  doubleParse = Double.parseDouble(array[r][7]);
                  if(doubleParse > max) {
                      maxMRate = Double.parseDouble(array[r][7]);                       
                     // System.out.print("max rate - " +  maxMRate + " " );
                      maxYr = array[r][0];
                      //break;                  
                  }  
            }
                      
            return maxYr;
         
        }   
        
        public String rRLow(String [][] array) {
            
            double min = Double.parseDouble(array[18][7]);
            double doubleParse = 0.0;
            double doubleParse1 = 0.0;
            double minMRate = 0.0;
            String minYr = array[18][0];
            int r;
           
            for(r = 1; r <array.length; ++r ) {
                doubleParse = Double.parseDouble(array[r][7]);
                 if(doubleParse1 < min) {
                      minMRate = Double.parseDouble(array[r][7]);                      
                      //System.out.print("max rate - " +  minMRate);
                      minYr = array[r][0];                
                 }                    
            }
         //return doubleParse1;
         return minYr;
        }


    
}
