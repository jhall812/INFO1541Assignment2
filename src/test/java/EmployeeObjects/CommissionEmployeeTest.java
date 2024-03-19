package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class CommissionEmployeeTest {
    @Test
    public void testIncreaseSales_positive() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.increaseSales(500.0);
        assertEquals(500.0, emp.getSales(), 0.01);
    }

    @Test
    public void testIncreaseSales_negative() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.increaseSales(-300.0);
        assertEquals(0.0, emp.getSales(), 0.01);
    }

    @Test
    public void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate(), 0.0001);
    }

    @Test
    public void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        assertEquals(0.0, emp.holidayBonus(), 0.01);
    }


}