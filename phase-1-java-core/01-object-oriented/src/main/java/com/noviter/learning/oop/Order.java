package com.noviter.learning.oop;

import java.math.BigDecimal;
import java.util.List;

public class Order {
    private final User user;
    private final List<OrderItem> items;
    private final DiscountPolicy discountPolicy;

    public Order(User user, List<OrderItem> items, DiscountPolicy discountPolicy) {
        if (user == null || items == null || items.isEmpty() || discountPolicy == null) {
            throw new IllegalArgumentException("用户、订单项和折扣策略均不能为空");
        }
        this.user = user;
        this.items = List.copyOf(items);
        this.discountPolicy = discountPolicy;
    }

    public BigDecimal originalAmount() {
        return items.stream()
                .map(OrderItem::subtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal discountAmount() {
        return discountPolicy.discountFor(originalAmount());
    }

    public BigDecimal payableAmount() {
        return originalAmount().subtract(discountAmount());
    }

    public User getUser() {
        return user;
    }
}
