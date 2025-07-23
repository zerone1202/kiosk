package org.example.lv4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    //    설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
    private List<Menu> menus;

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    //    main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.
    public void start() {
        Scanner scanner = new Scanner(System.in); // 스캐너 선언

        // 반복문 시작
        while (true) {
            // List와 Menu 클래스 활용하여 상위 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            for (int i = 0; i < menus.size(); i++) {
                Menu menu = menus.get(i);
                System.out.println((i + 1) + ". " + menu.getCategoryName());
            }
            System.out.print("0. " + "종료      " + "| 종료");

            // 숫자 입력 받기
            System.out.println();

            int categoryChoice = scanner.nextInt();
            // 입력 받은 숫자가 올바르다면 인덱스로 활용하여 List에 접근하기
            if (categoryChoice == 0) {
                System.out.println("프로그램을 종료합니다. ");
                break;
            }// 프로그램을 종료

            if (categoryChoice < 1 || categoryChoice > menus.size()) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            Menu selectedMenu = menus.get(categoryChoice - 1);
            List<MenuItem> items = selectedMenu.getMenuItems();

            // Menu가 가진 List<MenuItem>을 반복문을 활용하여 햄버거 메뉴 출력
            while (true) {
                System.out.println("[ " + selectedMenu.getCategoryName().toUpperCase() + " MENU ]");
                for (int i = 0; i < items.size(); i++) {
                    MenuItem item = items.get(i);
                    System.out.println((i + 1) + ". " + item.getName() + "   | W " + item.getPrice() + " | " + item.getDescription());
                }
                System.out.print("0. 뒤로가기");

                // 숫자 입력 받기
                System.out.println();
                int itemChoice = scanner.nextInt();

                // 입력 받은 숫자가 올바르다면 인덱스로 활용해서 Menu가 가지고 있는 List<MenuItem>에 접근하기
                if (itemChoice == 0) {
                    System.out.println();
                    break;
                }
                if (itemChoice < 1 || itemChoice > menus.size()) {
                    System.out.println("잘못 입력하셨습니다.");
                    continue;
                }
                // menu.getMenuItems().get(i); 같은 형식으로 하나씩 들어가서 얻어와야 합니다.
                MenuItem selectedItem = items.get(itemChoice - 1);
                System.out.println("선택한 메뉴: " + selectedItem.getName() + " | W " + selectedItem.getPrice() + " | " + selectedItem.getDescription());

                break;
            }
        }
    }
}
