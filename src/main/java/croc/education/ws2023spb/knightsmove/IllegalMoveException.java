package croc.education.ws2023spb.knightsmove;

/**
 * Исключение, выбрасываемое в случае, если при перемещении шахматного коня из текущей клетки в следующую происходит с
 * нарушением правил.
 * 
 * @author Dmitry Malenok
 */
public class IllegalMoveException extends Exception {
    public IllegalMoveException(ChessPosition from, ChessPosition to) {
        super("конь так не ходит: " + from + " -> " + to);
    }
}
