package EmployeeObjects;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HourlyEmployeeTest {
    @Test
    public void testIncreaseHours_positive(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(5.5);
        assertEquals(5.5, emp.getHoursWorked(), 0.001);
    }

    @Test
    public void testIncreaseHours_negative(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(-3.0);
        assertEquals(0.0, emp.getHoursWorked(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPay_regular(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay(), 0.01);
    }

    @Test
    public void testCalculateWeeklyPay_overtime(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45);
        assertEquals(1560.38, emp.calculateWeeklyPay(), 0.01);
    }
}