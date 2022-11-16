package bridge.domain.state;

import bridge.domain.MoveResult;

public class Ready implements State {
    @Override
    public MoveResult state() {
        return MoveResult.READY;
    }
}
