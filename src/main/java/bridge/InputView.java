package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {
    private static final String readBridgeSizeMsg = "다리의 길이를 입력해주세요.";
    private static final String readMovingMsg = "이동할 칸을 선택해주세요. (위: U, 아래: D)";
    private static final String readGameCommandMsg = "게임을 다시 시도할지 여부를 입력해주세요. (재시도: R, 종료: Q)";

    private static final String up = "U";
    private static final String down = "D";

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        System.out.println(readBridgeSizeMsg);
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException e) {
            System.out.println(ERROR.BRIDGE_SIZE);
            return readBridgeSize();
        }
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println(readMovingMsg);
        String moving = Console.readLine();

        if (moving.equals(up) || moving.equals(down))
            return moving;

        System.out.println(ERROR.MOVING);
        return readMoving();
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
