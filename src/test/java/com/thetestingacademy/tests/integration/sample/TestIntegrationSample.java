package com.thetestingacademy.tests.integration.sample;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestIntegrationSample {
    //create a booking, create a token
    //get booking
    //update the booking
    //delete the booking

    @Test(groups = "qa",priority = 1)
    @Owner("Arul")
    @Description("TC#Int1 - Step 1. Verify that the booking can be created")
    public void testCreateBooking(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 2)
    @Owner("Arul")
    @Description("TC#Int2 - Step 2. Verify that the booking by ID")
    public void testVerifyBookingID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 3)
    @Owner("Arul")
    @Description("TC#Int3 - Step 3. Verify updated booking by ID")
    public void testUpdateBookingByID(){
        Assert.assertTrue(true);
    }

    @Test(groups = "qa",priority = 4)
    @Owner("Arul")
    @Description("TC#Int1 - Step 4. delete the Booking by ID")
    public void testDeleteBookingByID(){
        Assert.assertTrue(true);
    }


}
