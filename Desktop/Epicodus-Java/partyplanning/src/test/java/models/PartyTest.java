package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ssaxe1 on 8/4/17.
 */
public class PartyTest {

    @Test
    public void runTest_instantiatesCorrectly() throws Exception {
        Party testParty = new Party();

        assertEquals(false, testParty instanceof Party);
    }
}