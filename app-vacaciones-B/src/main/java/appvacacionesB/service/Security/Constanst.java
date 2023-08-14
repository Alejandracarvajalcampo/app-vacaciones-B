package appvacacionesB.service.Security;

public class Constanst {
    private Constanst() {
        throw new IllegalStateException("Utility class");
    }
    public static final String ERROR_MESSAGE_DOCUMENT = "The document number can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_TYPE_DOCUMENT = "The documentType can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_TYPE_CONTRACT = "The contractType can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_NAMES= "The names can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_START_DATE= "The startDate can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_END_DATE= "The endDate can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_REQUEST_TYPE= "The requestType can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_SURNAMES= "The names can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_STATE= "The state can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_SUPERVISOR= "The supervisor can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_CHARGE= "The charge can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_PHONE= "The phone can only be integer, not null or empty";
    public static final String ERROR_MESSAGE_MINIMUM_PHONE= "The phone only accepts a minimum of 6 characters, a maximum of 13";
    public static final String ERROR_MESSAGE_CHARACTERS_PHONE= "the phone can only have 13 characters including +57";
    public static final String ERROR_MESSAGE_ADMISSION_DATE= " the admissionDate date cannot be null or empty and only accepts this format \"yyyy-MM-dd\" ";
    public static final String ERROR_MESSAGE = "request failed";
    public static final String EXISTS_EMPLOYEE = "the employee already exists in the database";
    public static final String ERROR_EMPLOYEE = "The employee with that document does not exist";
}
