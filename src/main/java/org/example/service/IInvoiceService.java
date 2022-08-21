package org.example.service;

import org.example.entity.Invoice;
import org.example.repository.IInvoiceRepository;

public interface IInvoiceService {
    void createInvoice(Invoice invoice);
    void setInvoiceRepository(IInvoiceRepository invoiceRepository);
}
