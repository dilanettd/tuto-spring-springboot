package org.example.controller;

import org.example.service.IInvoiceService;

public interface IInvoiceController {
    void createInvoice();
    void setInvoiceService(IInvoiceService invoiceService);
}
