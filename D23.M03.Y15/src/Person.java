
public abstract class Person {
    private String firstname;
    private String lastname;
    private String gender;
    private String marriedStatus;

    public Person() {
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGender(String g) {
        this.gender = g;
    }

    public void setMarriedStatus(String m) {
        this.marriedStatus = m;
    }

    public String GetGender() {
        return this.gender;
    }

    public String GetMStatus() {
        return this.marriedStatus;
    }

    private String getPrefix() {
        String pref = "";
        if(this.gender == "Male") {
            pref = "Mr. ";
        } else if(this.gender == "Female") {
            if(this.marriedStatus == "Single") {
                pref = "Miss ";
            }
        } else if(this.gender == "Married") {
            pref = "Mrs. ";
        }

        return pref;
    }

    public String GetFullName() {
        String fullname = "";
        fullname = fullname + this.getPrefix();
        fullname = fullname + this.firstname + " ";
        fullname = fullname + this.lastname;
        return fullname;
    }
}
