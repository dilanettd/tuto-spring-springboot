package org.example.repository;

import org.example.entity.Invoice;

public interface IInvoiceRepository {
    void create(Invoice invoice);
}