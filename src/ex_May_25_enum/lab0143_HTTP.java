package ex_May_25_enum;

public class lab0143_HTTP {
    public static void main(String[] args) {
        HTTP http =HTTP.create;
        http.getCode();
        http.getMessage();
        System.out.println(http.getCode()+ "--" + http.getMessage());
    }
}
enum HTTP {

    ok(200, "ok"),
    create(201, "created"),
    not(401, "notpagefound");


    private int code;
    private  String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    HTTP(int code, String message) {
        this.code = code;
        this.message = message;


    }
}