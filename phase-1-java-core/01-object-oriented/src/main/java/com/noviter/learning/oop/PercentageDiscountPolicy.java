package com.noviter.learning.oop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PercentageDiscountPolicy implements DiscountPolicy {
    private final BigDecimal rate;

    public PercentageDiscountPolicy(BigDecimal rate) {
        if (rate == null || rate.compareTo(BigDecimal.ZERO) < 0
                || rate.compareTo(BigDecimal.ONE) > 0) {
            throw new IllegalArgumentException("折扣比例必须在 0 到 1 之间");
        }
        this.rate = rate;
    }

    @Override
    public BigDecimal discountFor(BigDecimal originalAmount) {
        return originalAmount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
    }
}
