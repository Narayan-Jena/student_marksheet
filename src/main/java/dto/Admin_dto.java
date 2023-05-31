package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Admin_dto {
	@Id
   private String e_id;
   private String e_name;
   private long phno;
   private String e_pwd;
   
public String getE_id() {
	return e_id;
}
public void setE_id(String e_id) {
	this.e_id = e_id;
}
public String getE_name() {
	return e_name;
}
public void setE_name(String e_name) {
	this.e_name = e_name;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public String getE_pwd() {
	return e_pwd;
}
public void setE_pwd(String e_pwd) {
	this.e_pwd = e_pwd;
}
}
