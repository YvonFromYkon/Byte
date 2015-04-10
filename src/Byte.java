
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//тут был yvonfromykon


public class Byte extends  JFrame implements KeyListener{
	int V = 14;
	int SH = 7;
	boolean flag = true;
	volatile boolean anotherFlag = false;
	int PlayerScore;
	int figureNumber;
	int figurePosition;
	long defaultSpeed = 300;
	ArrayList<Integer> iCoor ;
	ArrayList<Integer> jCoor ;
   	String[][] b;
	JLabel label;
	static Byte game = new Byte("Tetris");
	
	public Byte(String s) {
	        super(s);
	        JPanel p = new JPanel();
	        label = new JLabel("Game uber alles!");
	        p.add(label);
	        add(p);
	        addKeyListener(this);
	        setSize(600, 600);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    }

	public  String[][] getArray(){
		return this.b;
	}
    
	public void paint(Graphics g){
	int X = 100;
	int Y = 100;
	
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	int width = (int)dim.getWidth();
	int height = (int)dim.getHeight();
	g.setColor(Color.WHITE);
	g.fillRect(0, 0 , width, height);
	g.setColor(Color.BLACK);
	g.drawLine(109, 99, 109, 241);
	g.setColor(Color.BLACK);
	g.drawLine(109, 241, 181, 241);
	g.setColor(Color.BLACK);
	g.drawLine(181, 241, 181, 99);
	g.setColor(Color.BLACK);
	g.drawLine(181, 99, 109, 99);
	//g.setColor(Color.BLUE);
		for (int i = 1; i<game.V; i++){
			Y += 10;
			X = 100;
			for(int j = 0; j<game.SH; j++){
				X += 10;
				if(b[i][j]=="1" || b[i][j]=="2"){
					int color = (int)(Math.random()*3+1);
					if(color == 1){g.setColor(Color.BLUE);
					}else if(color == 2){g.setColor(Color.RED);
					}else g.setColor(Color.GREEN);
					g.fillRect(X, Y , 10, 10);
					g.drawRect(X, Y, 10, 10);
				}
				
			}
		}
        
		g.drawString(""+ game.PlayerScore, 190, 123);
        
    }
	public static void displayArray(String[][] b){
		System.out.print("_______");
		for (int i = 1; i<game.V; i++){
			if(i!=0){System.out.println();}
			for(int j = 0; j<game.SH; j++){
					System.out.print(b[i][j]);
			}
		}
	    game.repaint();
		System.out.println();
	}
	
	public void rotationCheckT()throws Exception{
		if(game.figureNumber == 1){   // äëÿ ôèãóðêè íîìåð 1
			if(game.figurePosition == 1){
		int canWeChair1 = 0;
		int finder = 0; 
 		for (int i = 0; i<game.V; i++){
			for(int j = game.SH -1; j>=0; j--){
				if(b[i][j]=="1"){++finder;}
	            if(finder == 4){
				if(b[i][j]=="1" && b[i][j+2]=="2" ){canWeChair1++;}
	            }
	           }
			   }
		if(canWeChair1 > 0){throw new MyException();}
	}
	   //+++++++++++++++++++++++++++++++++++++++++++++++++++
		if(game.figurePosition == 2){
		int canWeChair2 = 0;	
		for (int i = game.V - 1; i>=0; i--){
					for(int j = 0; j<game.SH; j++){
						if(j!= 0){
	            if(b[i][j]=="1" && b[i][j-1]=="2" ){canWeChair2++;}
						}
	               }
				   }
		if(canWeChair2 > 1){throw new MyException();}
	}
	}
		//++++++++++++++++++++++++++++++++++++++++++ äëÿ ôèãóðêè íîìåð 3
		if(game.figureNumber == 3){
		if(game.figurePosition == 3){
	int canWeR = 0;
	for (int i = 0; i<game.V; i++){
		for(int j = game.SH - 1; j>=0; j--){
        if(b[i][j]=="1" && b[i][j+1]=="2"){canWeR++;}
				
           }
		   }
	if(canWeR > 0){throw new MyException();}
}
   //+++++++++++++++++++++++++++++++++++++++++++++++++++
	if(game.figurePosition == 1){
	int canWeL = 0;	
	for (int i = game.V - 1; i>=0; i--){
				for(int j = 0; j<game.SH; j++){
            if(b[i][j]=="1" && b[i][j-1]=="2"){canWeL++;}
					
               }
			   }
	if(canWeL > 0){throw new MyException();}
}
}
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++ äëÿ 4
		if(game.figureNumber == 4){
		if(game.figurePosition == 1){
	int canWeR = 0;
	for (int i = 0; i<game.V; i++){
		for(int j = game.SH - 1; j>=0; j--){
        if(b[i][j]=="1" && b[i][j+1]=="2"){canWeR++;}
				
           }
		   }
	if(canWeR > 0){throw new MyException();}
}
   //+++++++++++++++++++++++++++++++++++++++++++++++++++
	if(game.figurePosition == 3 ) {
	int canWeL = 0;	
	for (int i = game.V - 1; i>=0; i--){
				for(int j = 0; j<game.SH; j++){
            if(b[i][j]=="1" && b[i][j-1]=="2"){canWeL++;}
					
               }
			   }
	if(canWeL > 0){throw new MyException();}
}
}
	//++++++++++++++++++++++++++++++++++++++++++++++++++++ äëÿ ôèãóðêè 5
		if(game.figureNumber == 5){
		if(game.figurePosition == 2){
	int canWeD = 0;
	int canWeU = 0;
	for (int i = game.V - 1; i>=0; i--){
		for(int j = 0; j<game.SH; j++){
       
			if(b[i][j]=="1" && b[i-1][j]=="2"){canWeU++;}
			
       }
	   }
	for (int i = 0; i<game.V; i++){
		for(int j = game.SH - 1; j>=0; j--){
        if(j != game.SH - 1){
			if(b[i][j]=="1" && b[i+1][j]=="2"){canWeD++;}
        }
           }
		   }
	if(canWeD > 0){throw new MyException();}
	if(canWeU > 0){throw new MyException();}
}
	
   //+++++++++++++++++++++++++++++++++++++++++++++++++++
	if(game.figurePosition == 1){
	int canWeL = 0;
	int canWeR = 0;
	for (int i = game.V - 1; i>=0; i--){
				for(int j = 0; j<game.SH; j++){
                if(b[i][j]=="1" && j == game.SH - 1){throw new MyException();}
					if(b[i][j]=="1" && b[i][j-1]=="2"){canWeL++;}
					
               }
			   }
	for (int i = 0; i<game.V; i++){
		for(int j = game.SH -1 ; j>=0; j--){
        if(j != game.SH - 1){
			if(b[i][j]=="1" && b[i][j+1]=="2"){canWeR++;}
        }
           }
		   }
	if(canWeL > 0){throw new MyException();}
	if(canWeR > 0){throw new MyException();}
}
}
		//++++++++++++++++++++++++++++++++++ 
		//+++++++++++++++++++++++++++++++++++++++++++ Nomer 6
		if(game.figureNumber == 6){   // äëÿ ôèãóðêè íîìåð 6
			if(game.figurePosition == 1){
		int canWeChair1 = 0;
		int finder = 0;
		for (int i = 0; i<game.V; i++){
			for(int j = game.SH - 1; j>=0; j--){
				if(b[i][j]=="1"){++finder;}
	            if(finder == 4){
				if(b[i][j]=="1" && b[i][j-2]=="2" ){canWeChair1++;}
	            }
	           }
			   }
		if(canWeChair1 > 0){throw new MyException();}
	}
	   //+++++++++++++++++++++++++++++++++++++++++++++++++++
		if(game.figurePosition == 2){
		int canWeChair2 = 0;	
		for (int i = game.V - 1; i>=0; i--){
					for(int j = 0; j<game.SH; j++){
						if(j!= game.SH - 1){
	            if(b[i][j]=="1" && b[i][j+1]=="2" ){canWeChair2++;}
						}
	               }
				   }
		if(canWeChair2 > 1){throw new MyException();}
	}
	}
	//++++++++++++++++++++++++++++++++++++++++++++++++	Çàíåñåíèå êîîðäèíàò
		iCoor = new ArrayList<Integer>();
		 jCoor = new ArrayList<Integer>();
			for (int i = 0; i<game.V; i++){
				for(int j = 0; j<game.SH - 1; j++){
	               if(b[i][j]=="1"){
		           iCoor.add(i);
		           jCoor.add(j);
					}
	               
				}
			}
				
	}
	
	public  String[][] oneKiller(String[][] b){
	
		
		for (int i = 0; i<game.V; i++){
			for(int j = 0; j<game.SH; j++){
               if(b[i][j]=="1"){
				b[i][j]=" ";
				}
               
			}
		}
	return b;
	}
	
	public  String[][] nullKiller(String[][] b){
		
		for (int i = 0; i<game.V; i++){
			for(int j = 0; j<game.SH; j++){
               if(b[i][j]== null){
				b[i][j]=" ";
	
				}
               
			}
		}
	return b;
	}

	public  void convertToTwo(String[][] b){
		for(int i = 0; i <game.V; i++){
		for(int j = 0; j < game.SH; j++){
			if(b[i][j]=="1"){
				b[i][j]="2";
			}
		}
	}
	}
	

	

	
    public  void placeFigure(String[][] b){

    	game.figureNumber = (int)(Math.random()*6 +1);
    	Figure chair = new Figure(game.figureNumber);                         // ôèãóðêó ìåíÿòü òóò
        for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
        		b[i][j+2] = chair.a[i][j];
        	}
        }
  
    
    }
    
    public  void placeFigure2(String[][] b, int Num, int Pos){
    	try{
    
        int Position = Pos;
    	Figure chair2 = new Figure(Num, Position);
        for(int i = 0; i < 3; i++){
        	for(int j = 0; j < 3; j++){
        		if(game.figureNumber == 1){
            		if(game.figurePosition == 1){b[iCoor.get(0) + i - 1][jCoor.get(0) + j  ] = chair2.a[i][j];
            		}else  b[iCoor.get(0) + i + 1][jCoor.get(0) + j -1] = chair2.a[i][j];}
        		//+++++++++++++++++++++++++
        		if(game.figureNumber == 3){
        		if(game.figurePosition == 3){b[iCoor.get(0) + i - 1][jCoor.get(0) + j ] = chair2.a[i][j];
        		}else  b[iCoor.get(0) + i][jCoor.get(0) + j -1] = chair2.a[i][j];} 
        		//+++++++++++++++++++++++++
        		if(game.figureNumber == 4){                                                                      //toot
        			if(game.figurePosition == 3){b[iCoor.get(0) + i ][jCoor.get(0) + j ] = chair2.a[i][j];
            		}else if(game.figurePosition == 2){b[iCoor.get(0) + i ][jCoor.get(0) + j -1] = chair2.a[i][j];
            		}else  if(game.figurePosition == 4){b[iCoor.get(0) + i][jCoor.get(0) + j - 1] = chair2.a[i][j];
        			}else b[iCoor.get(0) + i - 1][jCoor.get(0) + j ] = chair2.a[i][j];} // äëÿ 1
        		//+++++++++++++++++++++++++
        		if(game.figureNumber == 5){
            		if(game.figurePosition == 1){b[iCoor.get(0) + i - 1][jCoor.get(0) + j ] = chair2.a[i][j];
            		}else  b[iCoor.get(0) + i][jCoor.get(0) + j -1] = chair2.a[i][j];}
        		//+++++++++++++++++++++++++
        		if(game.figureNumber == 6){
            		if(game.figurePosition == 1){b[iCoor.get(0) + i - 1][jCoor.get(0) + j -1  ] = chair2.a[i][j];
            		}else  b[iCoor.get(0) + i + 1][jCoor.get(0) + j - 1] = chair2.a[i][j];}
        	}
        }
       }catch (Exception e){}
    
    }
	
    @Override
    public void keyTyped(KeyEvent e) {

      

    }

    @Override
    public void keyPressed(KeyEvent e) { 
    	try{
    	  	if (e.getKeyCode() == KeyEvent.VK_SPACE) {
    	  		int Pos = game.figurePosition;
    	  		++Pos;
    	  		if(game.figureNumber == 1){
        	  		rotationCheckT ();
            		oneKiller(game.b);
            		if(Pos > 2){Pos = 1;}
            		placeFigure2(game.b, 1 , Pos);
            		displayArray(game.b);
            		
            	}
    	  		if(game.figureNumber == 3){
    	  			
    	  		rotationCheckT ();
        		oneKiller(game.b);
        		if(Pos > 4){Pos = 1;}
        		placeFigure2(game.b, 3 , Pos);
        		displayArray(game.b);
        		
        	}
    	  		if(game.figureNumber == 4){
    	  			
        	  		rotationCheckT ();
            		oneKiller(game.b);
            		if(Pos > 4){Pos = 1;}
            		placeFigure2(game.b, 4 , Pos);
            		displayArray(game.b);
            		
            	}
    	  		if(game.figureNumber == 5){
        	  		rotationCheckT ();
            		oneKiller(game.b);
            		if(Pos > 2){Pos = 1;}
            		placeFigure2(game.b, 5 , Pos);
            		displayArray(game.b);
            		
            	}
    	  		if(game.figureNumber == 6){
        	  		rotationCheckT ();
            		oneKiller(game.b);
            		if(Pos > 2){Pos = 1;}
            		placeFigure2(game.b, 6 , Pos);
            		displayArray(game.b);
            		
            	}
    	  	}
    	if (e.getKeyCode() == KeyEvent.VK_LEFT) {
    		int canWe = 0;
    		for (int i = game.V - 1; i>=0; i--){
 				for(int j = 0; j<game.SH; j++){
                if(b[i][j]=="1" && b[i][j-1]=="2"){canWe++;}
 					
                   }
 			   }
    		for (int i = game.V - 1; i>=0; i--){
 				for(int j = 0; j<game.SH; j++){
                 if(b[i][j]=="1" && b[i][j-1]=="2"){throw new MyException();}
 					if(b[i][j]=="1" && canWe == 0){
 					b[i][j-1] = b[i][j];
 					b[i][j]=" ";
 					
 					}
                   }
 			   }
    		displayArray(b);
    		
    	}
       
    	if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
    		int canWe = 0;
    		for (int i = 0; i<game.V; i++){
    			for(int j = game.SH - 1; j>=0; j--){
                if(b[i][j]=="1" && b[i][j+1]=="2"){canWe++;}
 					
                   }
 			   }
    		for (int i = 0; i<game.V; i++){
    			for(int j = game.SH - 1; j>=0; j--){
    				if(b[i][j]=="1" && b[i][j+1]=="2" ){throw new MyException();}
    				if(b[i][j]=="1" && canWe == 0){
    				b[i][j+1] = b[i][j];
    				b[i][j]=" ";
    				
    				}
                  }
    	}	
    		
    		displayArray(b);
			
        }
    	if (e.getKeyCode() == KeyEvent.VK_DOWN) {
    		int canWe = 0;
    		for (int i = game.V - 1; i>0; i--){
    			for(int j = game.SH - 1; j>=0; j--){
                if(b[i][j]=="1" && b[i+1][j]=="2"){canWe++;}
 					
                   }
 			   }
    		for (int i = game.V - 1; i>0; i--){
    			for(int j = game.SH - 1; j>=0; j--){
    				if(b[i][j]=="1" && b[i][j+1]=="2" ){throw new MyException();}
    				if(b[i][j]=="1" && canWe == 0){
    				b[i+1][j] = b[i][j];
    				b[i][j]=" ";
    				
    				}
                  }
    	}	
    		
    		displayArray(b);
			
        }
    	
    	}catch (Exception ex){
    		// ex.printStackTrace(new PrintStream(System.out));
    	}
       

    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }
    public void specialCase(){
		
	
		
	   game.convertToTwo(game.b); // 1 ôîêóñ ïîêóñ â 2
		game.displayArray(game.b);
		 game.placeFigure(game.b);
		game.displayArray(game.b);
    }
    public void doubleCheck()throws Exception{
    	for (int i = game.V - 1; i>0; i--){
			for(int j = 0; j<game.SH; j++){
		  if(game.b[i][j]=="2"){
			  if(game.b[i-1][j]=="1"){ Byte.game.specialCase(); }
		  }		
		  if(game.b[i][j]=="2" && i < 4){
			  GameOver over = new GameOver("Tetris Kaput");
			   
			    game.flag = false;}
			}
		}
    }
    

    public void preCheck(){
     	int lineCheck = 0;
    	for(int i = game.V - 1; i > 0; i--){
    	lineCheck = 0;
    	for(int j = 0; j < game.SH; j++){
    		if(Byte.game.b[i][j]=="2"){++lineCheck;}
    		if(lineCheck==game.SH){
    			
    			game.anotherFlag = true;
    		}
    	}
    }
    	
    }
    
    public static void main(String[] args)throws Exception{
		
		// V == 10;
    	//SH ==7;
		
		game.b = new String[game.V][game.SH];
		game.nullKiller(game.b);
		game.placeFigure(game.b);
		
		
		
		while(game.flag){
		game.preCheck();
		
		if(game.anotherFlag == true){
			Thread t2 = new Thread(new Task2());
			t2.start();
			t2.join();
		}
	    Thread t1 = new Thread(new Task1());
		t1.start();
		t1.join();
		game.doubleCheck(); // à íå âûíåñòè ëè â ïîòîê?
		
		}
		System.out.println("              " + game.PlayerScore);
		
		
	}
}


