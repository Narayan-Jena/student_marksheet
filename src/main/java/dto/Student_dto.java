package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student_dto {
	@Id
   private int roll_no;
   private String candidate_name;
   private String father_name;
   private String mother_name;
   private String dob;
   private String school;
   private String curent_date;
   private int flo_omr;
   private int flo_sub;
   private int sle_omr;
   private int sle_sub;
   private int tlh_omr;
   private int tlh_sub;
   private int mth_omr;
   private int mth_sub;
   private int gsc_omr;
   private int gsc_sub;
   private int ssc_omr;
   private int ssc_sub;
public int getRoll_no() {
	return roll_no;
}
public void setRoll_no(int roll_no) {
	this.roll_no = roll_no;
}
public String getCandidate_name() {
	return candidate_name;
}
public void setCandidate_name(String candidate_name) {
	this.candidate_name = candidate_name;
}
public String getFather_name() {
	return father_name;
}
public void setFather_name(String father_name) {
	this.father_name = father_name;
}
public String getMother_name() {
	return mother_name;
}
public void setMother_name(String mother_name) {
	this.mother_name = mother_name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getCurent_date() {
	return curent_date;
}
public void setCurent_date(String curent_date) {
	this.curent_date = curent_date;
}
public int getFlo_omr() {
	return flo_omr;
}
public void setFlo_omr(int flo_omr) {
	this.flo_omr = flo_omr;
}
public int getFlo_sub() {
	return flo_sub;
}
public void setFlo_sub(int flo_sub) {
	this.flo_sub = flo_sub;
}
public int getSle_omr() {
	return sle_omr;
}
public void setSle_omr(int sle_omr) {
	this.sle_omr = sle_omr;
}
public int getSle_sub() {
	return sle_sub;
}
public void setSle_sub(int sle_sub) {
	this.sle_sub = sle_sub;
}
public int getTlh_omr() {
	return tlh_omr;
}
public void setTlh_omr(int tlh_omr) {
	this.tlh_omr = tlh_omr;
}
public int getTlh_sub() {
	return tlh_sub;
}
public void setTlh_sub(int tlh_sub) {
	this.tlh_sub = tlh_sub;
}
public int getMth_omr() {
	return mth_omr;
}
public void setMth_omr(int mth_omr) {
	this.mth_omr = mth_omr;
}
public int getMth_sub() {
	return mth_sub;
}
public void setMth_sub(int mth_sub) {
	this.mth_sub = mth_sub;
}
public int getGsc_omr() {
	return gsc_omr;
}
public void setGsc_omr(int gsc_omr) {
	this.gsc_omr = gsc_omr;
}
public int getGsc_sub() {
	return gsc_sub;
}
public void setGsc_sub(int gsc_sub) {
	this.gsc_sub = gsc_sub;
}
public int getSsc_omr() {
	return ssc_omr;
}
public void setSsc_omr(int ssc_omr) {
	this.ssc_omr = ssc_omr;
}
public int getSsc_sub() {
	return ssc_sub;
}
public void setSsc_sub(int ssc_sub) {
	this.ssc_sub = ssc_sub;
}
@Override
public String toString() {
	return "Student_dto [roll_no=" + roll_no + ", candidate_name=" + candidate_name + ", father_name=" + father_name
			+ ", mother_name=" + mother_name + ", dob=" + dob + ", school=" + school + ", curent_date=" + curent_date
			+ ", flo_omr=" + flo_omr + ", flo_sub=" + flo_sub + ", sle_omr=" + sle_omr + ", sle_sub=" + sle_sub
			+ ", tlh_omr=" + tlh_omr + ", tlh_sub=" + tlh_sub + ", mth_omr=" + mth_omr + ", mth_sub=" + mth_sub
			+ ", gsc_omr=" + gsc_omr + ", gsc_sub=" + gsc_sub + ", ssc_omr=" + ssc_omr + ", ssc_sub=" + ssc_sub + "]";
}
   
   
}
