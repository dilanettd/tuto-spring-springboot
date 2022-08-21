package org.example.controller.keyboard;

import org.example.controller.IInvoiceController;
import org.example.entity.Invoice;
import org.example.service.IInvoiceService;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

public class InvoiceControllerKeyboard implements IInvoiceController {

    public IInvoiceService getInvoiceService() {
        return invoiceService;
    }

    public void setInvoiceService(IInvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    private IInvoiceService invoiceService;
    public void createInvoice(){
        System.out.println( "What is the customer name?" );
        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
        Invoice invoice = new Invoice();
        invoice.setCustomerName(customerName);
        invoiceService.createInvoice(invoice);
    }

}
