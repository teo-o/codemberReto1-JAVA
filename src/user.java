public class user {
    private String usr;
    private String eme;
    private String psw;
    private int age;
    private String loc;
    private String fll;

    public user(String usr, String eme, String psw, int age, String loc, String fll) {
        this.usr = usr;
        this.eme = eme;
        this.psw = psw;
        this.age = age;
        this.loc = loc;
        this.fll = fll;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getEme() {
        return eme;
    }

    public void setEme(String eme) {
        this.eme = eme;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getFll() {
        return fll;
    }

    public void setFll(String fll) {
        this.fll = fll;
    }
}
