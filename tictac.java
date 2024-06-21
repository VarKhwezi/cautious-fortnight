public class TicTacToe{
	public static void main(String[] args){
	
	char[][] gameBoard = {{' ','|',' ','|',' '},
		{'_','+','_','+','_'}
		{' ','|',' ','|',' '}
		{'_','+','_','+','_'}
 		{' ','|',' ','|',' '}};
	
	printGameBoard(gameBoard);

	Scanner scan = new Scanner(System.in);
	System.out.println(" " );
	scan.nextInt();

	}	
}

