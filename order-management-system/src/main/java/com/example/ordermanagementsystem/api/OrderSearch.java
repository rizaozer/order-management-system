package com.example.ordermanagementsystem.api;

import lombok.Data;
import java.time.LocalDate;
import java.util.Objects;

@Data
public class OrderSearch {

    private String key;

    private Object value;

    public OrderSearchParam getKey () {
        return OrderSearchParam.from(key);
    }

    public String getStringValue() {
        return Objects.toString(value);
    }

    public Integer getIntegerValue() {
        try {
            return Integer.parseInt(getStringValue());
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public LocalDate getDateValue() {
        return LocalDate.parse(getStringValue());
    }
}
