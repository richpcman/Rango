package com.hero.rango.feul;

import androidx.annotation.Nullable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Index;
import org.greenrobot.greendao.annotation.NotNull;

import java.util.Date;

@Entity(indexes = {
        @Index(value = "liter, date DESC", unique = true)
})
public class Feul {
    @Id
    private Long id;

    @NotNull
    private String liter;
    private Date date;
    @Nullable
    private String mark;

    @Generated(hash = 989281432)
    public Feul(Long id, @NotNull String liter, Date date, String mark) {
        this.id = id;
        this.liter = liter;
        this.date = date;
        this.mark = mark;
    }
    @Generated(hash = 2102031846)
    public Feul() {
    }


    public Feul(String liter, @Nullable String mark) {
        this.liter = liter;
        this.mark = mark;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLiter() {
        return this.liter;
    }

    public void setLiter(String liter) {
        this.liter = liter;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
