package org.javapractice.oct15.kt.library;

import java.time.LocalDate;
import java.util.Optional;

public abstract class LibraryItem {
    private LocalDate checkoutDate;
    private Optional<LocalDate> DueDate;
    private int dueDays;
    private float fee;


    public void checkout(){
        checkoutDate = LocalDate.now();
        DueDate = Optional.of(checkoutDate.plusDays(dueDays));
        System.out.println("Вы успешно взяли товар! Верните до:" +  DueDate.map(LocalDate::toString).orElse(""));
    }
    public void returnItem(){
        DueDate = Optional.empty();
        System.out.println("Вы успешно вернули товар!");
    }
    public void  getDueDate(){
        System.out.println(DueDate.map(LocalDate::toString).orElse(""));

    }
    public float calculateLateFees(int daysLate){
        return (float) daysLate *fee;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public void setDueDate(Optional<LocalDate> dueDate) {
        DueDate = dueDate;
    }

    public int getDueDays() {
        return dueDays;
    }

    public void setDueDays(int dueDays) {
        this.dueDays = dueDays;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "checkoutDate=" + checkoutDate +
                ", DueDate=" + DueDate +
                ", dueDays=" + dueDays +
                ", fee=" + fee +
                '}';
    }
}
