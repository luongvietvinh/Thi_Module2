package model;

public class Khachhang extends Contact {
    private int groop;
    private String name;
    private String gender;
    private String phoneNumber;
    private String address;
    private int birthDay;
    private String email;
    private String faceBook;

    public Khachhang() {
    }

    public Khachhang(int groop, String name, String gender, String phoneNumber, String address, int birthDay, String email, String faceBook) {
        this.groop = groop;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.birthDay = birthDay;
        this.email = email;
        this.faceBook = faceBook;
    }

    public int getGroop() {
        return groop;
    }

    public void setGroop(int groop) {
        this.groop = groop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFaceBook() {
        return faceBook;
    }

    public void setFaceBook(String faceBook) {
        this.faceBook = faceBook;
    }

    @Override
    public String toString() {
        return
                groop +
                " , " + name + " , "+  gender +
                        " , " + phoneNumber + " , "+ address +
                        " , " + birthDay + " , "+ email +
                        " , " + faceBook;
    }
}
