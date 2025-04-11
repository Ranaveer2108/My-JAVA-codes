package com.collection;

import java.util.Set;

public class Department {
private Integer did;
private String dname;
private Set<Employeee>empSet;
public Department(Integer did, String dname, Set<Employeee> empSet) {
	super();
	this.did = did;
	this.dname = dname;
	this.empSet = empSet;
}
public Integer getDid() {
	return did;
}
public void setDid(Integer did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Set<Employeee> getEmpSet() {
	return empSet;
}
public void setEmpSet(Set<Employeee> empSet) {
	this.empSet = empSet;
}
@Override
public String toString() {
	return "Department [did=" + did + ", dname=" + dname + ", empSet=" + empSet + "]";
}

}
