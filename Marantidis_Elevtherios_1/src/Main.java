import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		String ap;
		
		int row;
		int col;
		int flag2=0;
		
		
		System.out.println("************");
		System.out.println("Tic-Tac-Toe!");
		System.out.println("************ \n");
		
		
		System.out.println("Please enter the column (A, B or C) and then the row (1, 2, or 3) of your move.\n");
		System.out.println("   A B C ");
		System.out.println("1 | | | |");
		System.out.println("2 | | | |");
		System.out.println("3 | | | |");
		
		Table t1= new Table();
		
	  while(!t1.isFull()) {
		  
		flag2=0;	
		 
		 while(flag2==0) 
		  {
		  System.out.println("\nPlayer Move (X):");
		  ap=in.nextLine();
		  
		  while(!t1.isCorrect(ap)) 
		   {
			  System.out.println("\nPlayer Move (X):");
			  ap=in.nextLine();
			  
		   }
		  
		  t1.translateInput(ap);
		  
		  
		  
		   if(!t1.checkTable(t1.giveRow(),t1.giveCol())) 
		     {
			   t1.setTable(t1.giveRow(),t1.giveCol(),'X');
			   flag2=1;
			  //System.out.println("Player Move (X):");
			  //ap=in.nextLine();
			  //t1.translateInput(ap, row, col);
			 }
		   else 
		     {
			   System.out.println("\nThe space entered is already taken.");
			   //t1.printInfo();
		     }
		  }
		  
		  t1.printInfo();
		  
		  if(t1.isWinner()) 
		   {
			 System.out.println("\nYou win!"); 
			 break;
		   }
		  
		  if(t1.isFull()) {
			  break;
		  }
		  //PC APANTISH
		  
		  row=((int) (Math.random() * (3 - 0))) + 0;
		  col=((int) (Math.random() * (3 - 0))) + 0;
		  while(t1.checkTable(row,col)) {
			  row=((int) (Math.random() * (3 - 0))) + 0;
			  col=((int) (Math.random() * (3 - 0))) + 0;
		  }
		  
		  t1.setTable(row, col,'O');
		  //metafrash input pc kai print
		  
		  System.out.println("Computer Move (O):"+ t1.translateCol(col)+(row+1));
		  
		  t1.printInfo();
		  
		  if(t1.isWinner()) 
		   {
			 System.out.println("\nComputer win!"); 
			 break;
		   }
		  
		  
		  
	
		  
		  
		  	
			
		}
		
		
		
		
		
	}

}
