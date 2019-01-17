package com.hjl.dd;

/**
 * @author: HJL
 * @create: 2019-01-17 19:4
 */
public class Order {

    private Long id;

    private String name;

    private String price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
