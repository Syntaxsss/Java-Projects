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
public class USCrimeClassTest {
    
        private String yr;
        private String yr1;
       
        public USCrimeClassTest(){
            
              //yr = null;    
        }
    
        public USCrimeClassTest(String [][] array){   
         
            
          
        }
   
             
               
        public static void mrMax(String [][] uscs){
       // public String mrMax(String [][] uscs) {
            
            Double max = Double.parseDouble(uscs[0][5]);
            String max1 = uscs[0][0];
            String year1 = uscs[0][0];
            System.out.println(max);
            System.out.println(max1);
            Double doubleParse = 0.0;
            Double doubleParse1 = 0.0;
            Double maxMRate = 0.0;
           // String yr = array[0][0];
            String maxYr = null;
            String yr2 = null;           
            for(int r = 0; r < uscs.length; ++r ) {
                //for(int c = 0; c < uscs[r].length; ++c ){
                  doubleParse1 = Double.parseDouble(uscs[r][5]);
                 // System.out.println("doubleParse1 = " + doubleParse1);
                  if(doubleParse1 > max) {
                      maxMRate = Double.parseDouble(uscs[r][5]);                       
                      System.out.print("max rate - " +  maxMRate);
                     // yr = uscs[r][5];
                  }else{
                    maxMRate = max;
                    
                    yr2 = "1994";
                    System.out.println(" else in mrMax method - " + maxMRate);
                    System.out.println("array[0][0] = " + uscs[0][0]);
                    System.out.println("array[0][1] = " + uscs[0][1]);
                    
                  }
                                          
                //}
              
            }
            //return maxYr = yr2;
         //return maxYr;
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
        
        public Double mrMin(String [][] array) {
            
            Double min = Double.parseDouble(array[19][4]);
            Double doubleParse = 0.0;
            Double doubleParse1 = 0.0;
            Double minMRate = 0.0;
            //int c = 0;
           
            //System.out.println("checking " + min);

            for(int r = 1; r <array.length; ++r ) {
               // for (int c = 0; r < array[r].length; ++c){
                    //doubleParse1 = Double.parseDouble(array[r][c]);
                    //doubleParse1 = Double.parseDouble(array[r][4]);
                   // System.out.println("Ck ** " + doubleParse1 + " max - " + max);
                  // System.out.println("Ck ** " + doubleParse1 );
                    
                    if(doubleParse1 > min) {
                      minMRate = Double.parseDouble(array[r][4]);                      
                      //doubleParse1 = Double.parseDouble(array[r][4]);                     
                       //doubleParse1 = doubleParse1;
                      System.out.print("max rate - " +  minMRate);
                    }else{
                      minMRate = min;
                    }
                    
              //  }   
            }
         //return doubleParse1;
         return minMRate;
        }
        public Double rRMax(String [][] array) {
           
            Double max = Double.parseDouble(array[0][8]);
            Double doubleParse = 0.0;
            Double doubleParse1 = 0.0;
            Double maxRRate = 0.0;
            

            for(int r = 1; r <array.length; ++r ) {
                  if(doubleParse1 > max) {
                      maxRRate = Double.parseDouble(array[r][8]);                      
                      System.out.print("max rate - " +  maxRRate);
                    }else{
                      maxRRate = max;
                    }
                    
            }
         
         return maxRRate;
        }
        
        public Double rRMin(String [][] array) {
            
            Double min = Double.parseDouble(array[19][4]);
            Double doubleParse = 0.0;
            Double doubleParse1 = 0.0;
            Double minMRate = 0.0;
            //int c = 0;
           
            //System.out.println("checking " + min);

            for(int r = 1; r <array.length; ++r ) {
               // for (int c = 0; r < array[r].length; ++c){
                    //doubleParse1 = Double.parseDouble(array[r][c]);
                    //doubleParse1 = Double.parseDouble(array[r][4]);
                   // System.out.println("Ck ** " + doubleParse1 + " max - " + max);
                  // System.out.println("Ck ** " + doubleParse1 );
                    
                    if(doubleParse1 > min) {
                      minMRate = Double.parseDouble(array[r][4]);                      
                      //doubleParse1 = Double.parseDouble(array[r][4]);                     
                       //doubleParse1 = doubleParse1;
                      System.out.print("max rate - " +  minMRate);
                    }else{
                      minMRate = min;
                    }
                    
              //  }   
            }
         //return doubleParse1;
         return minMRate;
        }


    
}
