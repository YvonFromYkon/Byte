import java.io.PrintStream;
import java.util.ArrayList;


public class Task2 implements Runnable {

	public synchronized  void run() {
	  
	    	int lineCheck = 0;
	    	ArrayList<Integer> iCoord = new ArrayList<Integer>();
	    	for(int i = Byte.game.V - 1; i > 0; i--){
	    	lineCheck = 0;
	    	for(int j = 0; j < Byte.game.SH; j++){
	    		if(Byte.game.b[i][j]=="2"){++lineCheck;}
	    		if(lineCheck==Byte.game.SH){
	    		iCoord.add(i);
	    		}
	    	}
	    	}
	    	try{
	    		int k = 0;
	    		while( k < iCoord.size()){
	    			
	    			
	    			int needed = iCoord.get(k);
	    			for (int z = needed; ; ){
	    				
	    				for(int j = 0; j<Byte.game.SH; j++){
	    	               
	    					Byte.game.b[z][j]=" ";
	    					
	    	               
	    				}
	    				break;
	    			}
	    			
	    			for(int h = needed; h > 0; h--){
	    				for(int j = 0; j < Byte.game.SH; j++){
	    					if(Byte.game.b[h][j]=="2"){
	    						Byte.game.b[h][j]=" ";
	    						Byte.game.b[h+1][j]="2";
	    					}
	    				}
	    			}
	    			
	    	    Byte.game.PlayerScore += 100;
	    		
	    		 ++k;
	    	   }
	    		Thread.sleep(250);
	    		}catch (Exception ex){ex.printStackTrace(new PrintStream(System.out));}
	        Byte.game.anotherFlag = false;
	    	Byte.game.displayArray(Byte.game.b);
    		
	    	
	    
	    }
	}

