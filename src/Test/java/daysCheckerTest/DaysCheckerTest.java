package daysCheckerTest;

import dayChecker.weekdayWeekendChecker;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DaysCheckerTest {
    @Test public void dayIsWeekend(){
        assertTrue("day is weekend", weekdayWeekendChecker.isDayWeekend("sunday"));
    }
    @Test public void dayIsWeekday(){
        assertTrue("day is weekday",weekdayWeekendChecker.isContainWeekDay("monday"));
    }
    @Test public void invalidInput(){
        assertFalse("user input is invalid",weekdayWeekendChecker.isContainWeekDay("pooja"));
    }
}
