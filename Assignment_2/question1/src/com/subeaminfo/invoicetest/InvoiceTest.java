package com.subeaminfo.invoicetest;

import com.subeaminfo.hardware.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		Invoice invoice=new Invoice();
		invoice.acceptData();
		invoice.displayData();
		
		invoice.setPartNumber("101CCEngine");
		invoice.displayData();
		invoice.setPrice(12000);
		
		invoice.setPrice(-1);
		invoice.displayData();
	}

}
