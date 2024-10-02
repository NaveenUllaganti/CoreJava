package JavaPratice;

public class thanvika {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         for(int t=1;t<8;t++) {
        	for(int a=0;a<8;a++) {
        		if(a==0 || a==7) {
        			System.out.print(" * ");
        		}else if(t==4) {
        			System.out.print(" 0 ");
        		}
        
        	else {
        		System.out.print("   ");
        	}
        	 
        	}	
        	System.out.println();
	} 
         System.out.println();
         System.out.println();

        for(int h=1;h<9;h++) {
        	for(int b=1;b<9;b++) {
        		if(b==6) {
        			System.out.print(" * ");
        		}else if(h==1) {
        			System.out.print(" * ");
        		}
        		else
        			System.out.print("  ");
        	} 
   
        	System.out.println();
    	} 
        System.out.println();
        System.out.println();
        System.out.println();
        
        for(int n=1;n<8;n++) {
        	for(int c=0;c<8;c++) {
        	if(c==0 || c==(n-1) || c==7) {
        		System.out.print(" * ");
        	}
        	else {
        		System.out.print("   ");
        	
        		
        	}
        	
        }
        	System.out.println();
        }
        
        for(int v=1;v<8;v++) {
        	for(int d=0;d<8;d++) {
        		if(d==(v-1)|d==1) {
        			System.out.print(" * ");
        		}
        		else {
        			System.out.print("   ");
        		
      		
       		}
      }       
        	
       	System.out.println(); 
       	
        
        System.out.println(); 
        System.out.println(); 
        
       for(int m=0;m<5;m++) {
    	   for(int z=0;z<5;z++) {
    		   if(z==0 || z==4) {
    			   System.out.print(" * ");
    		   }else if(m==2) {
    			  System.out.print(" * ") ;
    		   }else {
    			   System.out.print(" ");
    		   }
    		   
    		   
    	   }
    	   System.out.println();
    	   }
       
      for(int a=0;a<6;a++) {
    	  for(int h=0;h<6;h++) {
    		  if(h==0 || h==5) {
    			  System.out.print("*");
    	      
    		  }else if(a==3) {
    			  System.out.print("*");
    		  }
    	  else {
    		  System.out.print(" ");
    	  }
      }
       System.out.println();
        }
      
      }
        for(int w=0;w<=6;w++) {
        	for(int v=0;v<=5;v++) {
        		if(v==0||v==5|| v==(w-1)||v==(6-w)) {
        			System.out.print(" m ");
        		}else {
        			System.out.print("   ");
        	}
        	}                                                        
        	System.out.println();
        }
        System.out.println();
        	}
	}








































