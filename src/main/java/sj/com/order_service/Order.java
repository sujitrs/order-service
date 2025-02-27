package sj.com.order_service;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public record Order(Long id, Long customerID, ZonedDateTime orderDate, BigDecimal totalAmount) {

}
