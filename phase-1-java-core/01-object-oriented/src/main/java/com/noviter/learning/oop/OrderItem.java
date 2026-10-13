package com.noviter.learning.oop;

import java.math.BigDecimal;

public class OrderItem {
    private final Product product;
    private final int quantity;

    public OrderItem(Product product, int quantity) {
        if (product == null) {
            throw new IllegalArgumentException("商品不能为空");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("购买数量必须大于 0");
        }
        this.product = product;
        this.quantity = quantity;
    }

    public BigDecimal subtotal() {
        return product.getUnitPrice().multiply(BigDecimal.valueOf(quantity));
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
