package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product bicycle = new Product("Bicycle");
        Product radio = new Product("Radio");
        Product tv = new Product("TV");
        Product computer = new Product("Computer");
        Item item1 = new Item(new BigDecimal(499),3,new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(199),10,new BigDecimal(40));
        Item item3 = new Item(new BigDecimal(1699),1,new BigDecimal(12));
        Item item4 = new Item(new BigDecimal(799),5,new BigDecimal(500));
        bicycle.getItems().add(item1);
        radio.getItems().add(item2);
        tv.getItems().add(item3);
        computer.getItems().add(item4);
        Invoice invoice1 = new Invoice("AGF23/06/2022-238");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice1);
        item4.setInvoice(invoice1);

        //When
        invoiceDao.save(invoice1);
        int id = invoice1.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }
}
