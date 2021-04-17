package bank_project;

public class display_set_get {


private String acount_no;
private String pasword;
private String full_name;
private String cnic;
private long amount;

  
public String getAcount_no() {
        return acount_no;
    }

    public void setAcount_no(String acount_no) {
        this.acount_no = acount_no;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        this.pasword = pasword;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }


@Override
public String toString(){
    return this.acount_no;
}

}
