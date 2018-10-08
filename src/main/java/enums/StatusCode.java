package enums;

public enum StatusCode {
    OK(200),
    CREATED(201),
    NO_CONTENT(204),
    INVALID_PARAMETERS(422),
    NOT_FOUND(404);

    private int statusCode;
    StatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
