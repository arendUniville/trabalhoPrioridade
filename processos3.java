public class processos3{

    public static void main(String[] args) {

        int[] myNum1 = {1, -2, 3, 4};
        int[] myNum2 = {5, -6, 7, 8};
        int[] myNum3 = {9, -10, 11, 12};
        
        int i = 0;
        int h = 0;
        int y = 0;

        boolean triggerY = false;

        for(;i < myNum1.length; i++){

            if(myNum1[i] < 0){

                System.out.println("P1: "+myNum1[i]);
                
                for(; h < myNum2.length; h++){

                    if(myNum2[h] > 0){

                        System.out.println("P2: "+myNum2[h]);
                        continue;

                    }else if(myNum2[h] < 0){

                        System.out.println("P2: "+myNum2[h]);

                        for(; y < myNum2.length && triggerY == false ; y++){
                            
                            if(myNum3[y] > 0){

                                System.out.println("P3: "+myNum3[y]);                        
                                

                            }else if(myNum3[y] < 0){

                                System.out.println("P3: "+myNum3[y]);

                                triggerY = true;

                                break;


                            }

                        }

                    }

                    if(myNum3[y] < 0){

                        System.out.println("Pulou");
                        
                        break;  

                    }
                    

                }
                
            triggerY = false;
            
            
            }else if(myNum1[i] > 0){

                System.out.println("P1: "+myNum1[i]);

            
            }
            
            if(i == (myNum1.length - 1)){

                h = h + 1;

                for(; h < 4; h++){

                    System.out.println("P2: "+myNum2[h]);

                    //System.out.println("H: "+h);

                    if(h == (myNum2.length - 1)){

                        y = y + 1;
    
                        for(; y < myNum2.length && triggerY == false ; y++){
                                
                            System.out.println("P3: "+myNum3[y]);                        
                                
                        }
                    }
          
                }

                

            }

        }

        /*
            System.out.println(" ");
            System.out.println("---FINAL---");
            System.out.println(i);
            System.out.println(h);
        */

        }

}

