package org.example.lv3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
//    설명: 키오스크 프로그램의 메뉴를 관리하고 사용자 입력을 처리하는 클래스입니다.
    private List<MenuItem> menuItems; // MenuItem을 관리하는 리스트가 필드로 존재합니다.

//    List<MenuItem> menuItems 는 Kiosk 클래스 생성자를 통해 값을 할당합니다.
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

//    main 함수에서 관리하던 입력과 반복문 로직은 이제 start 함수를 만들어 관리합니다.
    public void start() {
        Scanner scanner = new Scanner(System.in);

        // 반복문을 활용해 List 안에 있는 MenuItem을 하나씩 출력
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuItems.size(); i++) {
                MenuItem item = menuItems.get(i);
                System.out.println((i + 1) + ". " + item.getName() + "| W " + item.getPrice() + " | " + item.getDescription());
            }
            System.out.println("0. " + "종료      " + "| 종료");

            // 숫자를 입력 받기
            System.out.println("메뉴 번호를 입력하세요: " );
            int choice = scanner.nextInt();

            // 입력된 숫자에 따른 처리
            //제시된 메뉴 중 입력받은 숫자에 따라 다른 로직을 실행하는 코드를 작성합니다.
            //반복문을 이용해서 특정 번호가 입력되면 프로그램을 종료합니다
            if (choice == 0) {
                System.out.println("프로그램을 종료합니다. ");
                return;   // 프로그램을 종료
            } else if (choice >= 1 && choice <= menuItems.size()) {
                MenuItem choiceItem = menuItems.get(choice - 1); // 사용자가 1을 입력하면, 리스트 0번째 항목부터 꺼내기 떄문
                System.out.println("선택한 메뉴: ");  // 선택한 메뉴 : 이름, 가격, 설명
                System.out.println(choiceItem.getName() + "| W " + choiceItem.getPrice() + " | " + choiceItem.getDescription());
            } else {
                System.out.println("잘못 입력하셨습니다.");

        }
    }
}