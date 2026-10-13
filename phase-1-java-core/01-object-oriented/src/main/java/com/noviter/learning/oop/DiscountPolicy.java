package com.noviter.learning.oop;

import java.math.BigDecimal;

public interface DiscountPolicy {
    BigDecimal discountFor(BigDecimal originalAmount);
}
