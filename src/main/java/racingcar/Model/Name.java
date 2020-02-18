package racingcar.Model;

/**
 * 클래스 이름 : Name.java
 *
 * @author 작은곰
 * @version 1.0.1
 * <p>
 * 날짜 : 2020.02.16 일요일
 */

public class Name {
    private String name;

    public Name(final String name) {
        checkNullCarName(name);
        checkEmptyCarName(name);
        checkSmallerThanSix(name);
        this.name = name;
    }

    public static void checkNullCarName(String carName) {
        if (carName == null) {
            throw new IllegalArgumentException("차 이름은 NULL 값일 수 없습니다.");
        }
    }

    public static void checkEmptyCarName(String carName) {
        if (carName.isEmpty()) {
            throw new IllegalArgumentException("차 이름은 빈 문자열일 수 없습니다.");
        }
    }

    public static void checkSmallerThanSix(String carName) {
        if (carName.length() > 5) {
            throw new IllegalArgumentException("차 이름의 길이가 6 이상입니다.");
        }
    }

    public String getName() {
        return name;
    }
}
