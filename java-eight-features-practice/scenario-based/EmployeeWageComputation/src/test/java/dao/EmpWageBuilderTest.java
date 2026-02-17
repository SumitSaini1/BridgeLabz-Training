package dao;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmpWageBuilderTest {

    @Test
    void testAddCompanyAndComputeWage() {

        EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.computeWage();

        int wage = builder.getTotalWage("TCS");

        assertTrue(wage > 0);
    }

    @Test
    void testGetTotalWageForInvalidCompany() {

        EmpWageBuilder builder = new EmpWageBuilder();

        builder.addCompany("TCS", 20, 20, 100);
        builder.computeWage();

        int wage = builder.getTotalWage("ABC");

        assertEquals(0, wage);
    }
}
