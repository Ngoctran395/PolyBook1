/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.book.util;

import java.time.LocalDate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Dell
 */
@Data
@AllArgsConstructor
public class TimeRange {

    private Date begin;
    private Date end;

    // Constructor hỗ trợ LocalDate
    public TimeRange(LocalDate begin, LocalDate end) {
        this(java.sql.Date.valueOf(begin), java.sql.Date.valueOf(end));
    }

    // ===== Thời gian tĩnh (mặc định) =====

    public static TimeRange today() {
        LocalDate now = LocalDate.now();
        return new TimeRange(now, now.plusDays(1));
    }

    public static TimeRange thisWeek() {
        LocalDate now = LocalDate.now();
        LocalDate startOfWeek = now.minusDays(now.getDayOfWeek().getValue() - 1);
        return new TimeRange(startOfWeek, startOfWeek.plusDays(7));
    }

    public static TimeRange thisMonth() {
        LocalDate now = LocalDate.now();
        LocalDate startOfMonth = now.withDayOfMonth(1);
        return new TimeRange(startOfMonth, startOfMonth.plusMonths(1));
    }

    public static TimeRange thisQuarter() {
        LocalDate now = LocalDate.now();
        int firstMonth = now.getMonth().firstMonthOfQuarter().getValue();
        LocalDate startOfQuarter = now.withMonth(firstMonth).withDayOfMonth(1);
        return new TimeRange(startOfQuarter, startOfQuarter.plusMonths(3));
    }

    public static TimeRange thisYear() {
        LocalDate now = LocalDate.now();
        LocalDate startOfYear = now.withDayOfYear(1);
        return new TimeRange(startOfYear, startOfYear.plusYears(1));
    }
}