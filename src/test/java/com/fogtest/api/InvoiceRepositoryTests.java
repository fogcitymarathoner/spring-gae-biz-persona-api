package com.fogtest.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class InvoiceRepositoryTests {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testfindAllByOrderByDateAsc() {
        entityManager.persist(new Invoice
            (1, new Date(), "string", new Float(10.3), 3, true, "string",
            new Date(), new Date(), true, true, new Date(), true, true,
            "string", new Float(12.3), true, "token", 3, true, new Date(), new Date(),
            1, 1, new Date()));

        List<Invoice> invoices = invoiceRepository.findAllByOrderByDateAsc();

        TimeZone tz = TimeZone.getTimeZone("PST");

        Calendar calendarDate = Calendar.getInstance();
        calendarDate.clear();
        calendarDate.setTimeZone(tz);
        calendarDate.set(2017, 1, 5,0,0,0);
        assertEquals(0, calendarDate.getTime().compareTo(invoices.get(0).getDate()));
        calendarDate.clear();
        calendarDate.setTimeZone(tz);
        calendarDate.set(2018, 1, 5,0,0,0);
        assertEquals(0, calendarDate.getTime().compareTo(invoices.get(1).getDate()));
        assertEquals(new Date(118, 1, 5, 0, 0, 0), invoices.get(1).getDate());
    }
}
