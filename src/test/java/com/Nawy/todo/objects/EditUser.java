package com.Nawy.todo.objects;

public class EditUser {
    private String firstName;
    private String lastName;

    private String middleName;

    private String employeeId;




    private String otherId;



    private String drivingLicenseNo;
    private String drivingLicenseExpiredDate;
    private String gender;
    private String maritalStatus;
    private String birthday;
    private String nationalityId;
    private String sinNumber;

    public EditUser(String firstName, String middleName, String lastName, String employeeId, String otherId,
                    String drivingLicenseNo, String drivingLicenseExpiredDate, String gender, String maritalStatus,
                    String birthday, int nationalityId,String sinNumber) {
        this.firstName=firstName;
        this.middleName=middleName;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.otherId=otherId;
        this.drivingLicenseNo=drivingLicenseNo;
        this.drivingLicenseExpiredDate=drivingLicenseExpiredDate;
        this.gender=gender;
        this.maritalStatus=maritalStatus;
        this.birthday=birthday;
        this.nationalityId= String.valueOf(nationalityId);
        this.sinNumber=sinNumber;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }



    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    public String getDrivingLicenseNo() {
        return drivingLicenseNo;
    }

    public void setDrivingLicenseNo(String drivingLicenseNo) {
        this.drivingLicenseNo = drivingLicenseNo;
    }

    public String getDrivingLicenseExpiredDate() {
        return drivingLicenseExpiredDate;
    }

    public void setDrivingLicenseExpiredDate(String drivingLicenseExpiredDate) {
        this.drivingLicenseExpiredDate = drivingLicenseExpiredDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getSinNumber() {
        return sinNumber;
    }

    public void setSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
    }
}
