package org.example.lv4;

public class MenuItem {
    // 설명 : 개별 음식 항목을 관리하는 클래스입니다. 현재는 햄버거만 관리합니다.
    // 클래스는 `이름`, `가격`, `설명` 필드를 갖습니다.
    private String name; // '이름'
    private double price; // '가격'
    private String description; // '설명'

    // 생성자
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // 기능
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
}
