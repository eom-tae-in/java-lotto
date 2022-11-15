package lotto.exception;

import java.util.Arrays;
import java.util.HashSet;
import static lotto.constant.Constant.*;
import java.util.NoSuchElementException;
import java.util.Set;

public class UserInputLottoInfoException {
    public void isInputValueOnlyNumber(String price, String message) {
        for (int i = 0; i < price.length(); i++) {
            if (!Character.isDigit(price.charAt(i))) {
                System.out.println(ERROR_MESSAGE + message);
                throw new NoSuchElementException();
            }
        }
    }
    public void isDividedByThousand(String price, String message) {
        if (price.length() < FOUR_DIGIT_NUMBER) {
            System.out.println(ERROR_MESSAGE + message);
            throw new IllegalArgumentException();
        }
        if (!price.substring(price.length() - NUMBER_OF_ZERO_IN_THOUSAND).equals("000")) {
            System.out.println(ERROR_MESSAGE + message);
            throw new IllegalArgumentException();
        }
    }
    public void verifyExistBlank(String number, String message) {
        for (int i = 0; i < number.length(); i++) {
            if (number.length() != number.replace(" ", "").length()) {
                System.out.println(ERROR_MESSAGE + message);
                throw new IllegalArgumentException();
            }
        }
    }
}
