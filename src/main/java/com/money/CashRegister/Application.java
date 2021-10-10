package com.money.CashRegister;

import com.money.CashRegister.model.Payment;
import com.money.CashRegister.model.Type;
import com.money.CashRegister.paymentRecord.Entry;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class Application {
			public static void main(String[] args) {
			Payment meal = new Payment("For a meal", Type.DEBIT, 20, LocalDate.now());
			Payment book = new Payment("My love", Type.CREDIT, 49.90, LocalDate.now());

			List<Payment> payment = Arrays.asList(meal, book);

			Entry paymentRecord = new Entry();
			paymentRecord.record(payment);

		}
}
