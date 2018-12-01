package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_tab")
public class Admin {
	@Id
	@Column(name="id",length=20)
private int adminId;
	@Column(name="name",length=20)
private String adminName;
	@Column(name="sal",length=20)
private double adminSal;
public Admin() {
	super();
}
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
public double getAdminSal() {
	return adminSal;
}
public void setAdminSal(double adminSal) {
	this.adminSal = adminSal;
}
@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminSal=" + adminSal + "]";
}
}
