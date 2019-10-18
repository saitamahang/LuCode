package com.liyuhang.ThinkingInJava.Generic;

import com.liyuhang.ThinkingInJava.Generic.Common.Generator;
import com.liyuhang.ThinkingInJava.Generic.Common.Generators;
import com.liyuhang.ThinkingInJava.Generic.Model.Customer;
import com.liyuhang.ThinkingInJava.Generic.Model.Teller;

import java.util.*;

/**
 * 随机的柜员，按顺序服务客户
 */
public class BankTeller {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " : serves --> " + c);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator(), 4);
        for (Customer c : line) {
            serve(tellers.get(rand.nextInt(tellers.size())), c);
        }
    }
}
