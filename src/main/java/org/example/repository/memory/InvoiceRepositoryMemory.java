package org.example.repository.memory;

import org.example.entity.Invoice;
import org.example.repository.IInvoiceRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class InvoiceRepositoryMemory implements IInvoiceRepository {

    private static List<Invoice>invoices=new ArrayList<Invoice>();

    public void create(Invoice invoice){
    invoices.add(invoice);
    System.out.println("Invoice added with number " +invoice.getNumber()+ " for "+invoice.getCustomerName());
    }
}
