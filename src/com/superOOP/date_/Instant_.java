package com.superOOP.date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author mzm
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {
        // Instant 时间戳
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now); // Instant -> Date
        System.out.println(date);
        Instant instant = date.toInstant(); // Date -> Instant
        System.out.println(instant);
    }
}
