package enums;

public enum StatusCode {
    OK(200);

    private int statusCode;
    StatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
