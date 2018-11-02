package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {
	public static void main(String[] args) {
		Scanner mostrar = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(mostrar);
			
			System.out.println();
			
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(mostrar);
			
			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}
}