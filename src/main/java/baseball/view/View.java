package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class View {
    public static final String PLAYER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";

    private View() {}

    public static String inputPlayer() {
        System.out.print(PLAYER_INPUT_MESSAGE);
        return Console.readLine();
    }

    public static void errorMessage(String message) {
        System.out.println(message);
    }
}
