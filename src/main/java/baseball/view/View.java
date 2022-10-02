package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class View {
    public static final String PLAYER_INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    public static final String VICTORY_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    public static final String RESTART_GAME_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    private View() {}

    public static String inputPlayer() {
        System.out.print(PLAYER_INPUT_MESSAGE);
        return Console.readLine();
    }

    public static void errorMessage(String message) {
        System.out.println(message);
    }

    public static void resultMessage(String result) {
        System.out.println(result);
    }

    public static void victoryMessage() {
        System.out.println(VICTORY_MESSAGE);
    }
}
