package racingcar;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class RacingCar {
    String carNames;

    public void getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        this.carNames = readLine();
    }
}