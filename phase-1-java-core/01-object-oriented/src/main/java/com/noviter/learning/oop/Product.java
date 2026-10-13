package com.noviter.learning.oop;

import java.math.BigDecimal;

public class Product {
    private final long id;
    private final String name;
    private final BigDecimal unitPrice;

    public Product(long id, String name, BigDecimal unitPrice) {
        if (id <= 0) {
            throw new IllegalArgumentException("商品 id 必须大于 0");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("商品名称不能为空");
        }
        if (unitPrice == null || unitPrice.signum() < 0) {
            throw new IllegalArgumentException("商品价格不能为负数");
        }
        this.id = id;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }
}
