package org.example.controller.scan;

import org.example.controller.IInvoiceController;
import org.example.entity.Invoice;
import org.example.service.IInvoiceService;
import org.springframework.stereotype.Controller;


public class InvoiceControllerDouchette implements IInvoiceController {

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    private IInvoiceService invoiceService;
    @Override
    public void createInvoice() {
        System.out.println("Usage of a scanner");
        Invoice invoice = new Invoice();
        invoice.setCustomerName("Virgin Galatic");
        invoiceService.createInvoice(invoice);
    }
}
