package org.nightschool.model;

/**
 * Created by 88888888 on 2014/12/6.
 */
public class Items {
    private String name;
    private String img;
    private String desc;
    private double price;//单价
    private String postPrice;//是否包邮

    public Items()
    {

    }
    public Items(String strName, String strImg, String strText, double fPrice, String strPostPrice)
    {
        img = strImg;
        name = strName;
        desc = strText;
        price = fPrice;
        postPrice = strPostPrice;
    }


    public String getName() {
        return name;
    }

    public String getImg() {
        return img;
    }

    public String getText() {return desc;}

    public double getPrice() { return price;}

    public String gePostPrice() {return postPrice;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Items)) return false;

        Items items = (Items) o;

        if (Double.compare(items.price, price) != 0) return false;
        if (desc != null ? !desc.equals(items.desc) : items.desc != null) return false;
        if (img != null ? !img.equals(items.img) : items.img != null) return false;
        if (name != null ? !name.equals(items.name) : items.name != null) return false;
        if (postPrice != null ? !postPrice.equals(items.postPrice) : items.postPrice != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (postPrice != null ? postPrice.hashCode() : 0);
        return result;
    }
}
