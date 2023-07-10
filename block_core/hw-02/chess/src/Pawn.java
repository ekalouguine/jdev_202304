// write your code here
public class Pawn extends ChessPiece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (color.equals("White")) {
            if ((toLine > 7) || (column != toColumn) || (line >= toLine)) {
                return false;
            }

            if ((line + 1 == toLine) || ((line == 1) && (toLine == 3))) {
                return true;
            }

            if ((chessBoard.board[toLine][toColumn] == null) || (chessBoard.board[toLine][toColumn].getColor() != color)) {
                return true;
            }

            return false;
        } else {
            if ((toLine < 0) || (column != toColumn) || (line <= toLine)) {
                return false;
            }

            if ((line - 1 == toLine) || ((line == 6) && (toLine == 4))) {
                return true;
            }

            if ((chessBoard.board[toLine][toColumn] == null) || (chessBoard.board[toLine][toColumn].getColor() != color)) {
                return true;
            }

            return false;
        }
    }

    public String getSymbol() {
        return "P";
    }
}