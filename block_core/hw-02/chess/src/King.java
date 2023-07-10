// write your code here
public class King extends ChessPiece {
    public King(String color) {
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

        if ((line == toLine) && (column == toColumn)) {
            return false;
        }

        if ((Math.abs(line - toLine) <= 1) && (Math.abs(column - toColumn) <= 1)) {
            return true;
        }

        if ((chessBoard.board[toLine][toColumn] == null) || (chessBoard.board[toLine][toColumn].getColor() != color)) {
            return true;
        }

        return false;
    }

    public String getSymbol() {
        return "K";
    }

    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        return false;
    }
}