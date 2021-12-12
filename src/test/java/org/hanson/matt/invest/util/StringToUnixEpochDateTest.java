package org.hanson.matt.invest.util;

import junit.framework.TestCase;
import org.junit.Test;

public class StringToUnixEpochDateTest extends TestCase {
    private StringToUnixEpochDate stringToUnixEpochDate = new StringToUnixEpochDate();

    @Test
    public void testStringToUnixEpochDate() throws Exception {
        assertEquals(1609459200, stringToUnixEpochDate.getEpoch("2021-01-01", "yyyy-MM-dd"));
    }
}