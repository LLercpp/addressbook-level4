package seedu.address.model.person;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import seedu.address.model.activity.Remark;
import seedu.address.testutil.Assert;

public class RemarkTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Remark(null));
    }

    //TODO: TEST
    public void constructor_invalidAddress_throwsIllegalArgumentException() {
        String invalidAddress = "";
        Assert.assertThrows(IllegalArgumentException.class, () -> new Remark(invalidAddress));
    }

    @Test
    public void isValidAddress() {
        // null address
        Assert.assertThrows(NullPointerException.class, () -> Remark.isValidRemark(null));

        // invalid addresses
        assertTrue(Remark.isValidRemark("")); // empty string
        assertTrue(Remark.isValidRemark(" ")); // spaces only

        // valid addresses
        assertTrue(Remark.isValidRemark("Blk 456, Den Road, #01-355"));
        assertTrue(Remark.isValidRemark("-")); // one character
        assertTrue(Remark.isValidRemark("Leng Inc; 1234 Market St; San Francisco CA 2349879; USA")); // long address
    }
}
