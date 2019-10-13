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

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;



    @Test
    public void testInvoiceDaoSave(){

        //Given


        Item item1 = new Item(new BigDecimal(300), 5);
        Item item2 = new Item(new BigDecimal(100), 5);
        Item item3 = new Item(new BigDecimal(1),5);
        Product product1 = new Product("Gold apple");
        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product1.getItems().add(item3);
        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product1);
        Invoice invoice = new Invoice("213826");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);


        //When

        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //Then

        Assert.assertNotEquals(0,invoiceId);

        //CleanUp
        try{
            invoiceDao.deleteById(invoiceId);
        }catch (Exception e){
            System.out.println(e);
        }
    }


}
