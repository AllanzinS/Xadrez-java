package boardgame;

public class Piece {

		protected Position position;
		private Board board;
		
		public Piece(Board board) {
			this.board = board;
			position = null; //n�o � necess�rio adicionar o "null", se nada for atribuidado a position.
		}

		protected Board getBoard() {
			return board;
		}
	
}
