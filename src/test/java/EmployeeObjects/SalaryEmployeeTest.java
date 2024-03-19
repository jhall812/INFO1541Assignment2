package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


public class SalaryEmployeeTest {
    @Test
    public void testCalculateWeeklyPay() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double expectedWeeklyPay = 64325 / 52.0;
        assertEquals(expectedWeeklyPay, emp.calculateWeeklyPay(), 0.01);
    }

    @Test
    public void testAnnualRaise() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double expectedSalary = 64325 + (64325 * 0.0625);
        emp.annualRaise();
        assertEquals(expectedSalary, emp.getSalary(), 0.01);
    }

    @Test
    public void testHolidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double expectedBonus = 64325 * 0.03365;
        assertEquals(expectedBonus, emp.holidayBonus(), 0.01);
    }
}