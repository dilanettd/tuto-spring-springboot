package org.example.service.number;

import org.example.entity.Invoice;
import org.example.repository.IInvoiceRepository;
import org.example.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceNumber implements IInvoiceService {
    @Value("${invoice.lastNumber}")
    private  long lastNumber;
    @Value("${invoice.prefix}")
    private String prefix;

    public long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public IInvoiceRepository getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(IInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    @Autowired
    private IInvoiceRepository invoiceRepository;

    public void createInvoice(Invoice invoice){
        invoice.setNumber(prefix+ ++lastNumber);
        invoiceRepository.create(invoice);
    }
}
