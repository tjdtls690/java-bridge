package bridge.domain.state;

import bridge.domain.MoveResult;

public interface State {
    State move(final int currentPosition, final String moving);
    
    boolean isMoveFailed();
    
    boolean isGameFinished(final int numberOfMoves);
    
    MoveResult state();
    
    String moving();
}
