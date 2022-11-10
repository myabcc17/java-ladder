package ladder.view;

import java.util.Scanner;

public class InputView {
    private final Scanner sc = new Scanner(System.in);

    public String inputUserNames() {
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요.");
        String input = sc.nextLine();
        System.out.println();
        return input;
    }

    public String inputLadderHeight() {
        System.out.println("최대 사다리 높이는 몇 개인가요?");
        String input = sc.nextLine();
        System.out.println();
        return input;
    }
}
