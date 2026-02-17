package model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CompanyEmpWageTest {

    @Test
    void testTotalWageSetterGetter() {

        CompanyEmpWage company =
                new CompanyEmpWage("TCS", 20, 20, 100);

        company.setTotalEmpWage(5000);

        assertEquals(5000, company.getTotalEmpWage());
    }

    @Test
    void testCompanyName() {

        CompanyEmpWage company =
                new CompanyEmpWage("Infosys", 25, 22, 110);

        assertEquals("Infosys", company.companyName);
    }
}
