/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import backend.AnswerParser;

/**
 *
 * @author aeiden2017
 */
public class AnswerParserJUnitTest {
    
    public AnswerParserJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCheckMultipleChoice() {
        AnswerParser parser = new AnswerParser();
        Assert.assertEquals(true, parser.checkMultipleChoice("a", "a"));
        Assert.assertEquals(false, parser.checkMultipleChoice("a", "b"));
        Assert.assertEquals(false, parser.checkMultipleChoice("poop", "poo"));
        Assert.assertEquals(true, parser.checkMultipleChoice("5", "5"));
    }
}
