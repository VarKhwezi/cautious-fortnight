public class TicTacToe{
	public static void main(String[] args){
	
	char[][] gameBoard = {{' ','|',' ','|',' '},
		{'_','+','_','+','_'},
		{' ','|',' ','|',' '},
		{'_','+','_','+','_'},
 		{' ','|',' ','|',' '}};
	
	printGameBoard(gameBoard);

	Scanner scan = new Scanner(System.in);
	System.out.println(" " );
	scan.nextInt();
	System.out.printlin(pos);
	}	


	public static void printGameBoard(){
		for(char[] row: gameBoard){
			for(char c : row ){
				System.out.print(c)
			}
			System .out.print(c)
		}
		
	}
}
