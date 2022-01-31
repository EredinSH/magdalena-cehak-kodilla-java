package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.relational.core.sql.In;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {

        //GIVEN
        Product product1 = new Product("Book");
        Product product2 = new Product("Lamp");
        Product product3 = new Product("Carpet");
        Product product4 = new Product("Tablecloth");
        Product product5 = new Product("Alarm clock");
        Item item1 = new Item(product1,new BigDecimal(28.5),3,new BigDecimal(24.2));
        Item item2 = new Item(product2,new BigDecimal(145.99),6,new BigDecimal(128.55));
        Item item3 = new Item(product3,new BigDecimal(199.99),2,new BigDecimal(172.84));
        Item item4 = new Item(product4,new BigDecimal(75.5),3,new BigDecimal(69.13));
        Item item5 = new Item(product5,new BigDecimal(42.25),7,new BigDecimal(37.99));
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        Invoice invoice = new Invoice();
        invoice.setItems(items);

        //WHEN
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //THEN
        assertNotEquals(0,id);

        //CLEANUP
        //invoiceDao.deleteAll();

    }

}
