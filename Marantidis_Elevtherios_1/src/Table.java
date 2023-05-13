
public class Table {
 private char[][] board= new char[3][3];
 private static int row;
private static int col;

 public Table() {
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<3;j++) {
			 board[i][j]=' ';
		 }
	 }
	 row=0;
	 col=0;
 }
 
 public boolean isWinner() {
	 if(board[0][0]== board[0][1] & board[0][1]==board[0][2] & (board[0][0]==('X') || board[0][0]==('O'))) {
		 return true;
	 }
	 else if(board[1][0]==board[1][1] & board[1][1]==board[1][2] & (board[1][0]==('X') || board[1][0]==('O'))) {
		 return true;
	 }
	 else if(board[2][0]==board[2][1] & board[2][1]==board[2][2] & (board[2][0]==('X') || board[2][0]==('O'))) {
		 return true;
	 }
	 else if(board[0][0]==board[1][0] & board[1][0]==board[2][0] & (board[0][0]==('X') || board[0][0]==('O'))) {
		 return true;
	 }
	 else if(board[0][1]==board[1][1] & board[1][1]==board[2][1] & (board[0][1]==('X') || board[0][1]==('O'))) {
		 return true;
	 }
	 else if(board[0][2]==board[1][2] & board[1][2]==board[2][2] & (board[0][2]==('X') || board[0][0]==('O'))) {
		 return true;
	 }
	 else if(board[0][0]==board[1][1] & board[1][1]==board[2][2] & (board[0][0]==('X') || board[0][0]==('O'))) {
		 return true;
	 }
	 else if(board[0][2]==board[1][1] & board[1][1]==board[2][0] & (board[0][2]==('X') || board[0][0]==('O'))) {
		 return true;
	 }
	 else {
		 return false;
	 }
	 
 }
 
 public boolean isFull() {
	 for(int i=0;i<3;i++) {
		 for(int j=0;j<3;j++) {
			 if(board[i][j]==' ') {
				 return false;
			 }
		 }
	 }
	 System.out.println("\nDRAW!");
	 return true;
 }
 
 public boolean isCorrect(String ans) {
	 if(ans.equals("A1") || ans.equals("A2")|| ans.equals("A3")|| ans.equals("B1")|| ans.equals("B2")|| ans.equals("B3")|| ans.equals("C1")|| ans.equals("C2")|| ans.equals("C3")) {
		 return true;		 
	 }
	 System.out.println("Invalid Input: Please enter the column and row of your move (Example: A1).");
	 return false;
	 
 }
 
 public void translateInput(String ans) 
 {
	 if(ans.equals("A1")) {
		 row=0;
		 col=0;
	 }
	 else if(ans.equals("A2")) {
		 row=1;
		 col=0;
	 }
	 else if(ans.equals("A3")) {
		 row=2;
		 col=0;
	 }
	 else if(ans.equals("B1")) {
		 row=0;
		 col=1;
	 }
	 else if(ans.equals("B2")) {
		 row=1;
		 col=1;
	 }
	 else if(ans.equals("B3")) {
		 row=2;
		 col=1;
	 }
	 else if(ans.equals("C1")) {
		 row=0;
		 col=2;
	 }
	 else if(ans.equals("C2")) {
		 row=1;
		 col=2;
	 }
	 else if(ans.equals("C3")) {
		 row=2;
		 col=2;
	 }
}
 
 
public boolean checkTable(int i,int j) {
	if(board[i][j]!=' ') {
		//System.out.println("The space entered is already taken.");
		return true;
	}
	return false;
	
}
 
public void setTable(int i,int j,char ch) {
	board[i][j]=ch;
}

public void printInfo() {
	System.out.println("   A B C ");
	System.out.println("1 |"+board[0][0]+"|"+board[0][1]+"|"+board[0][2]+"|");
	System.out.println("2 |"+board[1][0]+"|"+board[1][1]+"|"+board[1][2]+"|");
	System.out.println("3 |"+board[2][0]+"|"+board[2][1]+"|"+board[2][2]+"|");
}

public int giveRow() {
	return row;
}

public int giveCol() {
	return col;
}
 
 public char translateCol(int j) {
	 if(j==0) {
		 return 'A';
	 }
	 else if(j==1) {
		 return 'B';
	 }
	 else {
		 return 'C';
	 }
 }
 
 




}
