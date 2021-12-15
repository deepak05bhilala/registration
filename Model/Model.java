
public class Model {



    public int userID;
    protected String fName ;
    protected String lName ;
    protected String email ;
    protected String password ;
    public Address address ;
    public String phoneNo ;
    public Boolean LoggedIn ;
    public Boolean getLoggedIn() {
        return LoggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        LoggedIn = loggedIn;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public int getUserID() {
        return userID;
    }
    public void setUserID(int userID) {
        this.userID = userID;
    }



}



