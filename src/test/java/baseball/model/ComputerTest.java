package baseball.model;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.controller.Game;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class ComputerTest {
    @RepeatedTest(10)
    @DisplayName("서로 다른 숫자 3개 생성")
    void generate_three_different_numbers_test() {
        Computer computer = new Computer();
        Set<Integer> ballSet = new HashSet<>(computer.balls());
        assertThat(ballSet).hasSize(Game.BALL_INPUT_SIZE);
    }
}