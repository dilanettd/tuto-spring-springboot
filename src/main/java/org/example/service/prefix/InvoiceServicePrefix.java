package org.example.service.prefix;

import org.example.entity.Invoice;
import org.example.repository.IInvoiceRepository;
import org.example.service.IInvoiceService;
import org.springframework.stereotype.Service;


public class InvoiceServicePrefix implements IInvoiceService {

    private static long lastNumber=0L;

    public IInvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    private IInvoiceRepository invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(String.valueOf(++lastNumber));
        invoiceRepository.create(invoice);
    }
}
