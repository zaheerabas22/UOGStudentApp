package com.first.a1stassignment;

import android.os.Parcel;
import android.os.Parcelable;

public class DataModel implements Parcelable {

    private String Student_Name;
    private String Father_NAme;
    private String Roll_No;
    private String Gender;
    private String Merital_Status;
    private String Degree_Title;
    private String Registration_No;
    private String Session;
    private String Religion;
    private String BS_MS_PhD;
    private String CNIC;
    private String Campus;
    private String Address;
    private String Department_Name;
    private String Feculty_Name;
    private String PTCL;
    private String Challan_No;
    private String CELL;
    private String Challan_Date;
    private String UOG_Email;
    private String Degree_Status;
    private String Personal_Email;
    private String Blood_Group;
    private String Applicant_Signature;

//
//    TODO: Remove this




    //


    public DataModel(String student_Name, String father_NAme, String roll_No, String gender,
                     String merital_Status, String degree_Title, String registration_No,
                     String session, String religion, String BS_MS_PhD, String CNIC,
                     String campus, String address, String department_Name,
                     String feculty_Name, String PTCL, String challan_No, String CELL,
                     String challan_Date, String UOG_Email, String degree_Status,
                     String personal_Email, String blood_Group, String applicant_Signature) {
        Student_Name = student_Name;
        Father_NAme = father_NAme;
        Roll_No = roll_No;
        Gender = gender;
        Merital_Status = merital_Status;
        Degree_Title = degree_Title;
        Registration_No = registration_No;
        Session = session;
        Religion = religion;
        this.BS_MS_PhD = BS_MS_PhD;
        this.CNIC = CNIC;
        Campus = campus;
        Address = address;
        Department_Name = department_Name;
        Feculty_Name = feculty_Name;
        this.PTCL = PTCL;
        Challan_No = challan_No;
        this.CELL = CELL;
        Challan_Date = challan_Date;
        this.UOG_Email = UOG_Email;
        Degree_Status = degree_Status;
        Personal_Email = personal_Email;
        Blood_Group = blood_Group;
        Applicant_Signature = applicant_Signature;
    }

    protected DataModel(Parcel in) {
        Student_Name = in.readString();
        Father_NAme = in.readString();
        Roll_No = in.readString();
        Gender = in.readString();
        Merital_Status = in.readString();
        Degree_Title = in.readString();
        Registration_No = in.readString();
        Session = in.readString();
        Religion = in.readString();
        BS_MS_PhD = in.readString();
        CNIC = in.readString();
        Campus = in.readString();
        Address = in.readString();
        Department_Name = in.readString();
        Feculty_Name = in.readString();
        PTCL = in.readString();
        Challan_No = in.readString();
        CELL = in.readString();
        Challan_Date = in.readString();
        UOG_Email = in.readString();
        Degree_Status = in.readString();
        Personal_Email = in.readString();
        Blood_Group = in.readString();
        Applicant_Signature = in.readString();
    }

    public static final Creator<DataModel> CREATOR = new Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel in) {
            return new DataModel(in);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };

    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public String getFather_NAme() {
        return Father_NAme;
    }

    public void setFather_NAme(String father_NAme) {
        Father_NAme = father_NAme;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getMerital_Status() {
        return Merital_Status;
    }

    public void setMerital_Status(String merital_Status) {
        Merital_Status = merital_Status;
    }

    public String getReligion() {
        return Religion;
    }

    public void setReligion(String religion) {
        Religion = religion;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPTCL() {
        return PTCL;
    }

    public void setPTCL(String PTCL) {
        this.PTCL = PTCL;
    }

    public String getCELL() {
        return CELL;
    }

    public void setCELL(String CELL) {
        this.CELL = CELL;
    }

    public String getUOG_Email() {
        return UOG_Email;
    }

    public void setUOG_Email(String UOG_Email) {
        this.UOG_Email = UOG_Email;
    }

    public String getPersonal_Email() {
        return Personal_Email;
    }

    public void setPersonal_Email(String personal_Email) {
        Personal_Email = personal_Email;
    }

    public String getBlood_Group() {
        return Blood_Group;
    }

    public void setBlood_Group(String blood_Group) {
        Blood_Group = blood_Group;
    }

    public String getDegree_Title() {
        return Degree_Title;
    }

    public void setDegree_Title(String degree_Title) {
        Degree_Title = degree_Title;
    }

    public String getRoll_No() {
        return Roll_No;
    }

    public void setRoll_No(String roll_No) {
        Roll_No = roll_No;
    }

    public String getRegistration_No() {
        return Registration_No;
    }

    public void setRegistration_No(String registration_No) {
        Registration_No = registration_No;
    }

    public String getSession() {
        return Session;
    }

    public void setSession(String session) {
        Session = session;
    }

    public String getBS_MS_PhD() {
        return BS_MS_PhD;
    }

    public void setBS_MS_PhD(String BS_MS_PhD) {
        this.BS_MS_PhD = BS_MS_PhD;
    }

    public String getCampus() {
        return Campus;
    }

    public void setCampus(String campus) {
        Campus = campus;
    }

    public String getDepartment_Name() {
        return Department_Name;
    }

    public void setDepartment_Name(String department_Name) {
        Department_Name = department_Name;
    }

    public String getFeculty_Name() {
        return Feculty_Name;
    }

    public void setFeculty_Name(String feculty_Name) {
        Feculty_Name = feculty_Name;
    }

    public String getChallan_No() {
        return Challan_No;
    }

    public void setChallan_No(String challan_No) {
        Challan_No = challan_No;
    }

    public String getChallan_Date() {
        return Challan_Date;
    }

    public void setChallan_Date(String challan_Status) {
        Challan_Date = getChallan_Date();
    }

    public String getDegree_Status() {
        return Degree_Status;
    }

    public void setDegree_Status(String degree_Status) {
        Degree_Status = degree_Status;
    }

    public String getApplicant_Signature() {
        return Applicant_Signature;
    }

    public void setApplicant_Signature(String applicant_Signature) {
        Applicant_Signature = applicant_Signature;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Student_Name);
        parcel.writeString(Father_NAme);
        parcel.writeString(Roll_No);
        parcel.writeString(Gender);
        parcel.writeString(Merital_Status);
        parcel.writeString(Degree_Title);
        parcel.writeString(Registration_No);
        parcel.writeString(Session);
        parcel.writeString(Religion);
        parcel.writeString(BS_MS_PhD);
        parcel.writeString(CNIC);
        parcel.writeString(Campus);
        parcel.writeString(Address);
        parcel.writeString(Department_Name);
        parcel.writeString(Feculty_Name);
        parcel.writeString(PTCL);
        parcel.writeString(Challan_No);
        parcel.writeString(CELL);
        parcel.writeString(Challan_Date);
        parcel.writeString(UOG_Email);
        parcel.writeString(Degree_Status);
        parcel.writeString(Personal_Email);
        parcel.writeString(Blood_Group);
        parcel.writeString(Applicant_Signature);
    }
}

