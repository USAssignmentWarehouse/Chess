package main.java.com.chess.engine.player;

import main.java.com.chess.engine.board.Board;
import main.java.com.chess.engine.board.Move;

/**
 * Created by MyPC on 5/12/2017.
 */
public class MoveTransition {

    private final Board transitionBoard;
    private final Move move;
    private final MoveStatus moveStatus;

    public MoveTransition(final Board transitionBoard, final Move move, final MoveStatus moveStatus){
        this.transitionBoard = transitionBoard;
        this.move = move;
        this.moveStatus = moveStatus;
    }

    public MoveStatus getMoveStatus() {
        return this.moveStatus;
    }

    public Board getTransitionBoard() {
        return this.transitionBoard;
    }
}