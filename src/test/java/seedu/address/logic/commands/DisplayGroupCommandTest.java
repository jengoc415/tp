package seedu.address.logic.commands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DisplayGroupCommandTest {

    String expectedOutput = "Listed all groups";

    @Test
    public void checkMessageSuccess() {
        assertEquals(DisplayGroupCommand.MESSAGE_SUCCESS, expectedOutput);
    }

}
