package OOP_Bai13.Entity;

import java.time.LocalDate;

public class Certificate {
    private String certificatedID;
    private String certificatedName;
    private String certificateRank;
    private LocalDate certificateDate;

    public Certificate() {

    }

    public Certificate(String certificatedID, String certificatedName, String certificateRank,
                       LocalDate certificateDate) {
        this.certificatedID = certificatedID;
        this.certificatedName = certificatedName;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    public String getCertificatedID() {
        return certificatedID;
    }

    public void setCertificatedID(String certificatedID) {
        this.certificatedID = certificatedID;
    }

    public String getCertificatedName() {
        return certificatedName;
    }

    public void setCertificatedName(String certificatedName) {
        this.certificatedName = certificatedName;
    }

    public String getCertificateRank() {
        return certificateRank;
    }

    public void setCertificateRank(String certificateRank) {
        this.certificateRank = certificateRank;
    }

    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificatedID='" + certificatedID + '\'' +
                ", certificatedName='" + certificatedName + '\'' +
                ", certificateRank='" + certificateRank + '\'' +
                ", certificateDate=" + certificateDate +
                '}';
    }
}
