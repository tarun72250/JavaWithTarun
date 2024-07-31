package day_06_oopIII;

public class A_14_Author {
    private String name;
    private String email;
    private long mobileNo;

    // Default constructor
    public A_14_Author() {
    }

    // Fully parameterized constructor
    public A_14_Author(String name, String email, long mobileNo) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}
