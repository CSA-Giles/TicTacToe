import java.util.Scanner;

public class TicTacMain  {

    public static void main(String[] args){

        //make all the variables that are needed
        int userInput;
        int replay;
        Scanner input = new Scanner(System.in);
        boolean play = true;


        System.out.println("Welcome to Tic-Tac-Toe, you are exes.");

        //Starts the game
        while(play){

            //Create a board to play the game on
            char[][] board = {{'1','2','3'},
                              {'4','5','6'},
                              {'7','8','9'}};

            //start the endGame while loop
            boolean endGame = false;

            while(!endGame){

                //display the board, allow the user to pick a number to populate the board
                displayBoard(board);
                System.out.println("Enter a number, 1 - 9, to be placed on the board...");
                userInput = input.nextInt();

                //super long way of populating board with your choice;
                if(userInput == 1) {
                    board[0][0] = 'X';
                }
                else if(userInput == 2) {
                    board[0][1] = 'X';
                }
                else if(userInput == 3) {
                    board[0][2] = 'X';
                }
                else if(userInput == 4) {
                    board[1][0] = 'X';
                }
                else if(userInput == 5) {
                    board[1][1] = 'X';
                }
                else if(userInput == 6) {
                    board[1][2] = 'X';
                }
                else if(userInput == 7) {
                    board[2][0] = 'X';
                }
                else if(userInput == 8) {
                    board[2][1] = 'X';
                }
                else if(userInput == 9) {
                    board[2][2] = 'X';
                }

                //Computer calculation
                int randomRow = ((int)(Math.random()*100) % 3);
                int randomCol = ((int)(Math.random()*100) % 3);

                //checks to see if the spot is occupied, and if not it will put down an O
                while(board[randomRow][randomCol] == 'X' || board[randomRow][randomCol] == 'O'){
                    randomRow = ((int)(Math.random()*100) % 3);
                    randomCol = ((int)(Math.random()*100) % 3);
                }
                board[randomRow][randomCol] = 'O';

                //All of the various win conditions
                if((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') || (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') || (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') || (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') ||(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')){
                    displayBoard(board);
                    System.out.println("You Win!!\n");
                    endGame = true;
                }
                else if((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') || (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') || (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') ||(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')){
                    displayBoard(board);
                    System.out.println("You Lose...\n");
                    endGame = true;
                }
                else if(board[0][0] != '1' && board[0][1] != '2' && board[0][2] != '3' && board[1][0] != '4' && board[1][1] != '5' && board[1][2] != '6' && board[2][0] != '7' && board[2][1] != '8' && board[2][2] != '9'){
                    displayBoard(board);
                    System.out.println("You Tied.\n");
                    endGame = true;
                }
            }

            System.out.println("Would you like to play again? [1 - Yes/ 2 - No]...");
            replay = input.nextInt();
            if(replay == 2){
                play = false;
            }
        }
    }

    //function designed to display the board and update with each character changed
    public static void displayBoard(char[][] board){

        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]
        + "\n- - - - -\n"
        + board[1][0] + " | " + board[1][1] + " | " + board[1][2]
                + "\n- - - - -\n"
        + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
