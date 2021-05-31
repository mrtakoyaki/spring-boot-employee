package com.example.demo.Model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ColumnVo {
    @JacksonXmlProperty(localName = "col1")
    private String col1;
    @JacksonXmlProperty(localName = "col2")
    private String col2;
    @JacksonXmlProperty(localName = "col3")
    private String col3;
    @JacksonXmlProperty(localName = "col4")
    private String col4;
    @JacksonXmlProperty(localName = "col5")
    private String col5;
    @JacksonXmlProperty(localName = "col6")
    private String col6;
    @JacksonXmlProperty(localName = "col7")
    private String col7;
    @JacksonXmlProperty(localName = "col8")
    private String col8;
    @JacksonXmlProperty(localName = "col9")
    private String col9;
    @JacksonXmlProperty(localName = "col10")
    private String col10;

    public ColumnVo() {
    }

    @Override
    public String toString() {
        return "ColumnVo{" +
                "col1='" + col1 + '\'' +
                ", col2='" + col2 + '\'' +
                ", col3='" + col3 + '\'' +
                ", col4='" + col4 + '\'' +
                ", col5='" + col5 + '\'' +
                ", col6='" + col6 + '\'' +
                ", col7='" + col7 + '\'' +
                ", col8='" + col8 + '\'' +
                ", col9='" + col9 + '\'' +
                ", col10='" + col10 + '\'' +
                '}';
    }

    public ColumnVo(String col1, String col2, String col3, String col4, String col5, String col6, String col7, String col8, String col9, String col10) {
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        this.col6 = col6;
        this.col7 = col7;
        this.col8 = col8;
        this.col9 = col9;
        this.col10 = col10;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }

    public String getCol4() {
        return col4;
    }

    public void setCol4(String col4) {
        this.col4 = col4;
    }

    public String getCol5() {
        return col5;
    }

    public void setCol5(String col5) {
        this.col5 = col5;
    }

    public String getCol6() {
        return col6;
    }

    public void setCol6(String col6) {
        this.col6 = col6;
    }

    public String getCol7() {
        return col7;
    }

    public void setCol7(String col7) {
        this.col7 = col7;
    }

    public String getCol8() {
        return col8;
    }

    public void setCol8(String col8) {
        this.col8 = col8;
    }

    public String getCol9() {
        return col9;
    }

    public void setCol9(String col9) {
        this.col9 = col9;
    }

    public String getCol10() {
        return col10;
    }

    public void setCol10(String col10) {
        this.col10 = col10;
    }
}
