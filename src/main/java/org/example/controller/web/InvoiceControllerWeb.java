package org.example.controller.web;

import org.example.controller.IInvoiceController;
import org.example.entity.Invoice;
import org.example.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerWeb implements IInvoiceController {

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    @Override
    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }
    @Autowired
    private IInvoiceService invoiceService;
    public void createInvoice(){
        String customerName = "Tesla";
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }

}
