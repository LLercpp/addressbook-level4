package seedu.address.commons.events.ui;

import seedu.address.commons.core.index.Index;

public class JumpToTaskListRequestEvent extends JumpToListRequestEvent {

    public JumpToTaskListRequestEvent(Index targetIndex) {
        super(targetIndex);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
