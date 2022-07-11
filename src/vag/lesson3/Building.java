package vag.lesson3;

import java.sql.SQLOutput;
import java.util.Calendar;

public class Building {
    private Integer floors;
    private Integer builtYear;
    private String name;

    public Building() {
    }

    public void setValues(Integer floors, Integer builtYear, String name) {
        this.floors = floors;
        this.builtYear = builtYear;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Building{" +
                "floors=" + floors +
                ", builtYear=" + builtYear +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer yearsSinceBuilt() {
        //int currYear = 2022;
        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        return currYear - this.builtYear;
    }
}



