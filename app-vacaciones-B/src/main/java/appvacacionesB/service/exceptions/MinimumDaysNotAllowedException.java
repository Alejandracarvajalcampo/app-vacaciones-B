package appvacacionesB.service.exceptions;

public class MinimumDaysNotAllowedException extends RuntimeException {
    public MinimumDaysNotAllowedException(String message) {

        super(message);
    }
}
