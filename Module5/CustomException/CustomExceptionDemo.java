package Exception.CustomException;

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

public class CustomExceptionDemo {

    static void checkAmount(int amount) throws InvalidAmountException {
        if (amount < 1000)
            throw new InvalidAmountException("Amount must be >= 1000");
        else
            System.out.println("Valid Amount");
    }

    public static void main(String[] args) {
        try {
            checkAmount(500);
        } catch (InvalidAmountException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
