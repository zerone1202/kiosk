package org.example.lv2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MenuItem> menuItems = new ArrayList<>(); // List 선언 및 초기화

        //`main` 함수에서 `MenuItem` 클래스를 활용하여 햄버거 메뉴를 출력합니다.
        //`MenuItem` 객체 생성을 통해 `이름`, `가격`, `설명`을 세팅합니다.
        //키워드: `new`
        // add 함수를 통해 new MenuItem(이름, 가격, 설명) List에 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack",  8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Scanner 선언
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
