package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Transactional
@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice("007/01/2019");

        Product chocolate = new Product("Chocolate");
        Product biscuits = new Product("Biscuits");
        Product waffles = new Product("Waffles");

        Item itemChocolate = new Item(chocolate, new BigDecimal(5), 5);
        Item itemBiscuits = new Item(biscuits, new BigDecimal(10), 10);
        Item itemWaffles = new Item(waffles, new BigDecimal(150), 15);

        itemChocolate.setInvoice(invoice);
        itemBiscuits.setInvoice(invoice);
        itemWaffles.setInvoice(invoice);

        List<Item> items = new ArrayList<>();
        items.add(itemChocolate);
        items.add(itemBiscuits);
        items.add(itemWaffles);

        invoice.setItems(items);

        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        int itemSize = invoice.getItems().size();

        Invoice invoiceReadFromDB = invoiceDao.findById(invoiceId);

        //Then
        Assert.assertEquals(invoiceId, invoiceReadFromDB.getId());
        Assert.assertEquals(3, itemSize);
        Assert.assertEquals(itemSize, invoiceReadFromDB.getItems().size());

        try {
            invoiceDao.deleteById(invoiceId);
        } catch (Exception e) {
        }
    }
}