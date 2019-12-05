package com.qa.library;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LibraryTest 
{
    Items testItem = null;
    String udpateTestItem = "";
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkOutTest() {

        testItem = new Books("Harry Potter");
        String checkOut = testItem.checkOutItem("Harry Potter");

        Assert.assertEquals("07/12/19", checkOut);
    
        
    }

    @Test
    public void checkInTest() {

        testItem = new Books("Harry Potter");
        String checkIn = testItem.checkInItem("Harry Potter");
      
        Assert.assertEquals("01/12/19", checkIn);
        
    }

    @Test
    public void addItemTest() {

        testItem = new Journals("Nature");
        String addItem = testItem.addItem("Nature");

        Assert.assertEquals(testItem.getName() + "added", addItem);
    }

    @Test
    public void removeItemTest() {

        testItem = new Magazines("GQ");
        String removeItem = testItem.removeItem("GQ");
       
        Assert.assertEquals(testItem.getName() + "removed", removeItem);
      
    }

    @Test
    public void updateTest() {

        testItem = new Journals("Big Chungus");
        String updateTestItem = testItem.updateItem("blegh");
        Assert.assertEquals(testItem.getcheckoutDate() + "updated", updateTestItem);

    }
}
