import java.io.*;
import java.util.*;

public class tictactoe{

	public tictactoe(){
	}

	public static void main(String[] args){
		Scanner sys = new Scanner(System.in);
		tictactoe newTic = new tictactoe();
		newTic.makegrid();
		char[] array = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
		for(int i = 0; i < array.length; i++){
			if(i % 2 == 0){
				System.out.println("Player 1, choose your coordinate: ");
				int choice1 = sys.nextInt();
				while(array[choice1] != ' '){
					System.out.println("That spot is taken or it is out of bounds, please choose another.");
					choice1 = sys.nextInt();
				}
				array[choice1] = 'X';
			}
			else{
				System.out.println("Player 2, choose your coordinate: ");
				int choice2 = sys.nextInt();
				while(array[choice2] != ' '){
					System.out.println("That spot is taken or it is out of bounds, please choose another.");
					choice2 = sys.nextInt();
				}
				array[choice2] = 'O';
			}
			newTic.remakeGrid(array);
			String result = newTic.checkForWin(array);
			if(result != null){
				System.out.println();
				System.out.println(result + " is the winner!");
				break;
			}
		}
		System.out.println("Game over.");
	}


	public void makegrid(){
		System.out.println("_ _|_ _|_ _");
		System.out.println("_ _|_ _|_ _");
		System.out.println("   |   |   ");
	}

	public void remakeGrid(char[] array){
		for(int i = 0; i<array.length; i++){
			if(array[i] != ' '){
				if(i == 0 || i == 2 || i == 3 || i == 5){
					System.out.print("_" + array[i] + "_");
				}
				else if(i == 6 || i == 8){
					System.out.print(" " + array[i] + " ");
				}
				else if(i == 7){
					System.out.print("| " + array[i] + " |");
				}
				else{
					System.out.print("|" + "_" + array[i] + "_" + "|");
				}
				if(i == 2 || i == 5){
					System.out.println();
				}
			}
			else{
				if(i == 0 || i == 2 || i == 3 || i == 5){
					System.out.print("_ _");
				}
				else if(i == 6 || i == 8){
					System.out.print("   ");
				}
				else if(i == 7){
					System.out.print("|   |");
				}
				else{
					System.out.print("|_ _|");
				}
				if(i == 2 || i == 5){
					System.out.println();
				}
			}
		} 
	}
	
	public String checkForWin(char[] array){
		if((array[0] == 'X' && array[1] == 'X' && array[2] == 'X') || (array[3] == 'X' && array[4] == 'X' && array[5] == 'X') || (array[6] == 'X' && array[7] == 'X' && array[8] == 'X') || 
		   (array[0] == 'X' && array[3] == 'X' && array[6] == 'X') || (array[1] == 'X' && array[4] == 'X' && array[7] == 'X') || (array[2] == 'X' && array[5] == 'X' && array[8] == 'X') ||
		   (array[0] == 'X' && array[4] == 'X' && array[8] == 'X') || (array[2] == 'X' && array[4] == 'X' && array[6] == 'X')){
			return "Player 1";
		}
		else if((array[0] == 'O' && array[1] == 'O' && array[2] == 'O') || (array[3] == 'O' && array[4] == 'O' && array[5] == 'O') || (array[6] == 'O' && array[7] == 'O' && array[8] == 'O') || 
		   (array[0] == 'O' && array[3] == 'O' && array[6] == 'O') || (array[1] == 'O' && array[4] == 'O' && array[7] == 'O') || (array[2] == 'O' && array[5] == 'O' && array[8] == 'O') ||
		   (array[0] == 'O' && array[4] == 'O' && array[8] == 'O') || (array[2] == 'O' && array[4] == 'O' && array[6] == 'O')){
			return "Player 2";
		}
		else{
			return null;
		}
	}
}