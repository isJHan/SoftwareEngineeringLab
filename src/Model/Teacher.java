package Model;

public class Teacher {
    private String tno, tname, college;

    public void setTno(String tno) {
        this.tno = tno;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public Teacher(String tno, String tname, String college) {
        this.tno = tno;
        this.tname = tname;
        this.college = college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getTno() {
        return tno;
    }

    public String getTname() {
        return tname;
    }

    public String getCollege() {
        return college;
    }
}
