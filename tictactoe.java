import java.io.*;
import java.util.*;

public class tictactoe{
	public static void main(String[] args){
		Scanner sys = new Scanner(System.in);
		makegrid();
		String first = decideTurn(sys);
		System.out.println(first);
		int count = 0;
		String[] array = new String[9];
		String pSymbol;
		String cSymbol;
		if(first.equals("Player")){
			pSymbol = "X";
			cSymbol = "O";
		}
		else{
			pSymbol = "O";
			cSymbol = "X";
		}
		for(int i = 0; i<9; i++){
			
		}
		/*while(count < 9){
			int coordinate = sys.nextInt();

			remakeGrid();
		}*/
	}
	public static void makegrid(){
		System.out.println("_|_|_");
		System.out.println("_|_|_");
		System.out.println(" | |");
	}
	public static void remakeGrid(String[] array){
		for(int i = 0; i<array.length; i++){
			if(array[i] != null){
				switch(i){
					case 0:
						System.out.print("_" + array[i] + "_");
						break;
					case 1:
						System.out.print("|" + "_" + array[i] + "_" + "|");
						break;
					case 2:
						System.out.println("_" + array[i] + "_");
						break;
					case 3:
						System.out.print("_" + array[i] + "_");
						break;
					case 4:
						System.out.print("|" + "_" + array[i] + "_" + "|");
						break;
					case 5:
						System.out.println("_" + array[i] + "_");
						break;
					case 6:
						System.out.print(" " + array[i] + " ");
						break;
					case 7:
						System.out.print("| " + array[i] + " |");
						break;
					case 8:
						System.out.println(" " + array[i] + " ");
						break;	
				}
			}
			else{
				switch(i){
					case 0:
						System.out.print("_" + " " + "_");
						break;
					case 1:
						System.out.print("|" + "_" + " " + "_" + "|");
						break;
					case 2:
						System.out.println("_" + " " + "_");
						break;
					case 3:
						System.out.print("_" + " " + "_");
						break;
					case 4:
						System.out.print("|" + "_" + " " + "_" + "|");
						break;
					case 5:
						System.out.println("_" + " " + "_");
						break;
					case 6:
						System.out.print(" " + " " + " ");
						break;
					case 7:
						System.out.print("| " + " " + " |");
						break;
					case 8:
						System.out.println(" " + " " + " ");
						break;
				}
			}
		} 
	}
	public static String decideTurn(Scanner sys){
		System.out.println("Choose a number between 1 and 100");
		Random rand = new Random();
		int playerChoice = sys.nextInt();
		while(playerChoice < 1 || playerChoice > 100){
			System.out.println("Please enter a valid number: ");
			playerChoice = sys.nextInt();
		}
		int computerChoice = rand.nextInt(100);
		computerChoice += 1;
		int outcome = rand.nextInt(100);
		outcome += 1;
		int closerPlayerChoice = Math.abs(outcome - playerChoice);
		int closerComputerChoice = Math.abs(outcome - computerChoice);
		//System.out.println("playerChoice: " + playerChoice + "computerChoice: " + computerChoice + "outcome: " + outcome);
		if(closerPlayerChoice < closerComputerChoice){
			return "Player";
		}
		else{
			return "Computer";
		}
	}
}