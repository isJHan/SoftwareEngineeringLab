package Model;

public class Student {
    public String getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    public String getCollege() {
        return college;
    }

    public String getMajor() {
        return major;
    }

    public String getClass_() {
        return class_;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClass_(String class_) {
        this.class_ = class_;
    }

    private String
            sno,
            sname,
            college,
            major,
            class_;

    public Student(String sno, String sname, String college, String major, String class_) {
        this.sno = sno;
        this.sname = sname;
        this.college = college;
        this.major = major;
        this.class_ = class_;
    }
}
