// write your code here
public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((line < 0) || (line > 7) || (toLine < 0) || (toLine > 7) || (column < 0) || (column > 7) || (toColumn < 0) || (toColumn > 7)) {
            return false;
        }

        if ((column + 1 == toColumn) && (line - 2 == toLine)) return true;
        if ((column + 1 == toColumn) && (line + 2 == toLine)) return true;
        if ((column - 1 == toColumn) && (line - 2 == toLine)) return true;
        if ((column - 1 == toColumn) && (line + 2 == toLine)) return true;

        if ((column + 2 == toColumn) && (line - 1 == toLine)) return true;
        if ((column + 2 == toColumn) && (line + 1 == toLine)) return true;
        if ((column - 2 == toColumn) && (line - 1 == toLine)) return true;
        if ((column - 2 == toColumn) && (line + 1 == toLine)) return true;

        if ((chessBoard.board[toLine][toColumn] == null) || (chessBoard.board[toLine][toColumn].getColor() != color)) {
            return true;
        }

        return false;
    }

    public String getSymbol() {
        return "H";
    }
}