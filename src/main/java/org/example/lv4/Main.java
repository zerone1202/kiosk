package org.example.lv4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Menu 객체 생성을 통해 이름 설정
        // Menu 클래스 내 있는 List<MenuItem> 에 MenuItem 객체 생성하면서 삽입
        List<MenuItem> burgers  = new ArrayList<>();
        burgers.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("SmokeShack",  8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burgers.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("Soda", 2.0, "탄산 음료"));
        drinks.add(new MenuItem("Ade", 2.9, "과즙에 설탕, 꿀을 넣어 맛을 낸 음료"));

        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("Chips", 2.8, "얇은 감자 튀김"));
        desserts.add(new MenuItem("Cookie", 2.5, "밀가루, 설탕, 초콜릿이 들어간 구운 납작한 과자"));

        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("Burgers", burgers));
        menuList.add(new Menu("Drinks", drinks));
        menuList.add(new Menu("Desserts", desserts));

        // Kiosk 객체 생성
        Kiosk kiosk = new Kiosk(menuList);
        // Kiosk 내 시작하는 함수 호출
        kiosk.start();
    }
}
