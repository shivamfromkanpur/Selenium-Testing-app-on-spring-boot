package com.selenium.model;

public class CompanyDetails {
	
	String fileNo;
	String name;
	String category;
	String type;
	String registerOfficeAddress;
	String dataIncorporated;
	String nature;
	String subCategory;
	String status;
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRegisterOfficeAddress() {
		return registerOfficeAddress;
	}
	public void setRegisterOfficeAddress(String registerOfficeAddress) {
		this.registerOfficeAddress = registerOfficeAddress;
	}
	public String getDataIncorporated() {
		return dataIncorporated;
	}
	public void setDataIncorporated(String dataIncorporated) {
		this.dataIncorporated = dataIncorporated;
	}
	public String getNature() {
		return nature;
	}
	public void setNature(String nature) {
		this.nature = nature;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "CompanyDetails [fileNo=" + fileNo + ", name=" + name + ", category=" + category + ", type=" + type
				+ ", registerOfficeAddress=" + registerOfficeAddress + ", dataIncorporated=" + dataIncorporated
				+ ", nature=" + nature + ", subCategory=" + subCategory + ", status=" + status + ", getFileNo()="
				+ getFileNo() + ", getName()=" + getName() + ", getCategory()=" + getCategory() + ", getType()="
				+ getType() + ", getRegisterOfficeAddress()=" + getRegisterOfficeAddress() + ", getDataIncorporated()="
				+ getDataIncorporated() + ", getNature()=" + getNature() + ", getSubCategory()=" + getSubCategory()
				+ ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
