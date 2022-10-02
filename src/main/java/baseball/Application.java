package baseball;

import baseball.controller.Game;

public class Application {
    public static void main(String[] args) {
        try {
            Game game = new Game();
            game.play();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
