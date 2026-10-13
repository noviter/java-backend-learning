package com.noviter.learning.oop;

import java.math.BigDecimal;
import java.util.List;

public class OrderDemo {
    public static void main(String[] args) {
        User user = new User(1, "小林");
        Product notebook = new Product(101, "笔记本", new BigDecimal("18.50"));
        Product pen = new Product(102, "签字笔", new BigDecimal("6.00"));

        Order order = new Order(
                user,
                List.of(new OrderItem(notebook, 2), new OrderItem(pen, 3)),
                new PercentageDiscountPolicy(new BigDecimal("0.10"))
        );

        System.out.println("用户：" + order.getUser().getName());
        System.out.println("原价：" + order.originalAmount());
        System.out.println("折扣：" + order.discountAmount());
        System.out.println("实付：" + order.payableAmount());
    }
}
