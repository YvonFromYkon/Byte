
public class Figure {

String a[][];
int tNum;

Figure(int x){
if(x == 1){
	tNum = (int) (Math.random()*2 + 1);
	Byte.game.figurePosition = tNum;
    Byte.game.figureNumber = x;
	if(tNum==1){Chair1a();}
	if(tNum == 2){Chair1b();}
}
if(x == 2){
	Cube();
}
if(x == 3){
    tNum = (int) (Math.random()*4 + 1);
    Byte.game.figurePosition = tNum;
    Byte.game.figureNumber = x;
	if(tNum == 1){T1();}
	if(tNum == 2){T2();}
	if(tNum == 3){T3();}
	if(tNum == 4){T4();}
}
if(x == 4){
	  tNum = (int) (Math.random()*4 + 1);
	    Byte.game.figurePosition = tNum;
	    Byte.game.figureNumber = x;
		if(tNum == 1){G1();}
		if(tNum == 2){G2();}
		if(tNum == 3){G3();}
		if(tNum == 4){G4();}
}
if(x == 5){
	tNum = (int) (Math.random()*2 + 1);
	Byte.game.figurePosition = tNum;
    Byte.game.figureNumber = x;
	if(tNum==1){shortStick();}
	if(tNum == 2){shortStick2();}
}
if(x == 6){
	tNum = (int) (Math.random()*2 + 1);
	Byte.game.figurePosition = tNum;
    Byte.game.figureNumber = x;
	if(tNum==1){Chair2a();}
	if(tNum == 2){Chair2b();}
}
}

Figure(int x, int y){
if(x == 1){
	  tNum = y;
	    Byte.game.figurePosition = tNum;
		if(tNum == 1){Chair1a();}
		if(tNum == 2){Chair1b();}
}
if(x == 2){
	Cube();
}
if(x == 3){
    tNum = y;
    Byte.game.figurePosition = tNum;
	if(tNum == 1){T1();}
	if(tNum == 2){T2();}
	if(tNum == 3){T3();}
	if(tNum == 4){T4();}
}
if(x == 4){
	 tNum = y;
	    Byte.game.figurePosition = tNum;
		if(tNum == 1){G1();}
		if(tNum == 2){G2();}
		if(tNum == 3){G3();}
		if(tNum == 4){G4();}
}
if(x == 5){
	 tNum = y;
	    Byte.game.figurePosition = tNum;
		if(tNum == 1){shortStick();}
		if(tNum == 2){shortStick2();}
}
if(x == 6){
	  tNum = y;
	    Byte.game.figurePosition = tNum;
		if(tNum == 1){Chair2a();}
		if(tNum == 2){Chair2b();}
}
}

public  String[][] nullKillerA(String[][] a){
	
	for (int i = 0; i<3; i++){
		for(int j = 0; j<3; j++){
           if(a[i][j]== null){
			a[i][j]=" ";

			}
           
		}
	}
return a;
}
public String[][] Chair1a(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	a[2][0] = "1";
	
	return a;
}
public String[][] Chair1b(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][0] = "1";
	
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	return a;
}
public String[][] Chair2a(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	a[2][2] = "1";
	
	return a;
}
public String[][] Chair2b(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][1] = "1";
	
	a[0][2] = "1";
	
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	return a;
}

public String[][] Cube(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][0] = "1";
	
	a[0][1] = "1";
	
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	return a;
}
public String[][] T1(){
	a = new String[3][3];
	
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[2][1] = "1";
	
	a[1][2] = "1";
	
	return a;
}
public String[][] T2(){
	a = new String[3][3];
	
	nullKillerA(a);
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	a[2][1] = "1";
	
	return a;
}
public String[][] T3(){
	a = new String[3][3];
	
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[2][1] = "1";
	
	a[1][0] = "1";
	
	return a;
}
public String[][] T4(){
	a = new String[3][3];
	
	nullKillerA(a);
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	a[0][1] = "1";
	
	return a;
}
public String[][] G1(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[2][1] = "1";
	
	a[2][0] = "1";
	
	return a;
}
public String[][] G2(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][0] = "1";
	
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	return a;
}
public String[][] G3(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[2][1] = "1";
	
	a[0][2] = "1";
	
	return a;
}
public String[][] G4(){
	a = new String[3][3];
	nullKillerA(a);
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	a[2][2] = "1";
	
	return a;
}
public String[][] shortStick(){
	a = new String[3][3];
	nullKillerA(a);
	a[0][1] = "1";
	
	a[1][1] = "1";
	
	a[2][1] = "1";
	
	
	
	return a;
}
public String[][] shortStick2(){
	a = new String[3][3];
	nullKillerA(a);
	a[1][0] = "1";
	
	a[1][1] = "1";
	
	a[1][2] = "1";
	
	
	
	return a;
}
}
