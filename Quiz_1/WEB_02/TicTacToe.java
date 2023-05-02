import java.util.Scanner;

public class TicTacToe {
    private static final char EMPTY_CELL = ' ';
    public static void initialize(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static int checkFirstDiagonal(char[][] board, char ch) {
        if (board[0][0] == ch && board[1][1] == ch && board[2][2] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkSecondDiagonal(char[][] board, char ch) {
        if (board[0][2] == ch && board[1][1] == ch && board[2][0] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkFirstRow(char[][] board, char ch) {
        if (board[0][0] == ch && board[0][1] == ch && board[0][2] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkSecondRow(char[][] board, char ch) {
        if (board[1][0] == ch && board[1][1] == ch && board[1][2] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkThirdRow(char[][] board, char ch) {
        if (board[2][0] == ch && board[2][1] == ch && board[2][2] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkFirstColumn(char[][] board, char ch) {
        if (board[0][0] == ch && board[1][0] == ch && board[2][0] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkSecondColumn(char[][] board, char ch) {
        if (board[0][1] == ch && board[1][1] == ch && board[2][1] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int checkThirdColumn(char[][] board, char ch) {
        if (board[0][2] == ch && board[1][2] == ch && board[2][2] == ch) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int main(String[] args) {
        char[][] board = new char[3][3];
        int a, b;
        char player_turn = '1';
        Scanner scanner = new Scanner(System.in);
        initialize(board);
        printBoard(board);

        for (int i = 0; i < 9; i++) {
            System.out.println("Player " + player_turn + " Enter Row and Column range(0-2) at which you want to give Input( ): ");
			a = scanner.nextInt();
			b = scanner.nextInt();
		board[a][b] = player_turn;
		printBoard(board);
		if ( checkFirstDiagonal(board,player_turn)==1 || checkSecondDiagonal(board,player_turn)==1 ||
		checkFirstRow(board,player_turn)==1 || checkSecondRow(board,player_turn)==1 ||
		checkThirdRow(board,player_turn)==1 || checkFirstColumn(board,player_turn)==1 ||
		checkSecondColumn(board,player_turn)==1 || checkThirdColumn(board,player_turn)==1 ) {
			System.out.println("Player " + player_turn + " Won the Game");
			return 0;
		}
		else if( player_turn=='1' )	player_turn='2';
		else	player_turn='1';
	}
		System.out.println("Match Draw");
		return 0;
	}
}
