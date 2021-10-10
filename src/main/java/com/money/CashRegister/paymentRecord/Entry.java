package com.money.CashRegister.paymentRecord;

import com.money.CashRegister.model.Payment;
import com.money.CashRegister.model.Type;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Entry {
    private final static List<Payment> payments = new ArrayList<>();

    public void record(List<Payment> ps) {
        for (int i = 0; i < ps.size(); i++) {
            Payment p = ps.get(i);
            if (p.getType().equals(Type.CREDIT)) { p.setValue(p.getValue() * 1.5);
                payments.add(p); System.out.println("The payment has been made" + p);
            } if (p.getType().equals(Type.DEBIT)) { p.setValue(p.getValue() * 2.0);
                payments.add(p); System.out.println("The payment has been made" + p);
            } if (p.getType().equals(Type.CASH)) { payments.add(p); System.out.println("The payment has been made" + p); }
        } if (!payments.isEmpty()) { System.out.println("All payments");
            for (int i = 0; i < payments.size(); i++) {
                System.out.println(payments.get(i));
            }
        } else { System.out.println("There are no payments"); }
    }

}
