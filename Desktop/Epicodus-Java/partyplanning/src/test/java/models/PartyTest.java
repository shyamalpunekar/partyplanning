package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by spunek on 8/4/17.
 */
public class PartyTest {

    @Test
    public void runTest_instantiatesCorrectly() throws Exception {
        Party testParty = new Party(10, "snack" , "water" , "none");

        assertEquals(true, testParty instanceof Party);
    }

//    @Test
//    public void runTest_calculateCost_3250() throws Exception {
//        Party testParty = new Party();
//
//
//    }
}