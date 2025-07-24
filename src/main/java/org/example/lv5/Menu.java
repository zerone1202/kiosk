package org.example.lv5;

import java.util.List;

public class Menu {
//    설명 : MenuItem 클래스를 관리하는 클래스입니다.
//    예를 들어, 버거 메뉴, 음료 메뉴 등 각 카테고리 내에 여러 MenuItem을 포함합니다.

    // MenuItem 클래스를 List로 관리
    private String categoryName;
    private List<MenuItem> menuItems;

    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public Menu(String categoryName, List<MenuItem> menuItems) {
        this.categoryName = categoryName;
        this.menuItems = menuItems;
    }
    // 메뉴 카테고리 이름을 반환하는 메서드
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    // List를 리턴하는 함수
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
