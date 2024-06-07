package ex_May_25_enum;

public enum lab0142 {

}
enum testpage{
    login("www.vizitors/login", "login_page"),
    dashboard("www.vizitors/#", "dashboard"),
    registration("www.vizitors/regstration","regstration");


    String url;
    String page;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    testpage(String url, String page) {
        this.url = url;
        this.page = page;





    }

}
