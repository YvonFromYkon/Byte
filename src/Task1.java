
public class Task1 implements Runnable {

   public synchronized void run() {
    	
    		
            	try{ 
            		Thread.sleep(100);
            		
            		String[][] c = Byte.game.b;
            		Byte.displayArray(c);
            	
            				
            	
            				
            			for (int i = Byte.game.V - 1; i>=0; i--){
        					for(int j = 0; j<Byte.game.SH; j++){
        	                if(c[i][j]=="1" && i == (Byte.game.V - 1)){Byte.game.specialCase();}
        						if(c[i][j]=="1" && i< (Byte.game.V - 1) ){
        							if(c[i+1][j]== "2"){throw new MyException();}
        							c[i+1][j] = c[i][j];
        						c[i][j]=" ";
        							
        						}
        	                  }
        				   }
        				Byte.displayArray(c); //собственно вывод в консоль массива
        				
        				for (int i = Byte.game.V - 1; i>=0; i--){
        					for(int j = 0; j<Byte.game.SH; j++){
        				  if(c[i][j]=="2"){
        					  if(c[i-1][j]=="1"){ Byte.game.specialCase();  }
        				  }		
        					}
        				}
        	            Thread.sleep(Byte.game.defaultSpeed);
        	          
            	
            		 
            			}catch (Exception e){}

    	
    }
}