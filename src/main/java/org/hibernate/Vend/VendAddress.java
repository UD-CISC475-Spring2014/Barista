package org.hibernate.Vend;

import java.util.HashSet;
import java.util.Set;

public class VendAddress {
	private int AddrID;
	private String AddrLine1;
	private String AddrLine2;
	private String AddrLine3;
	private String City;
	private String St;
	private int Zip;
	private int Zip4;
	private boolean ActiveFlg;
	
	public VendAddress(){}

	public int getAddrID() {
		return AddrID;
	}

	public void setAddrID(int addrID) {
		AddrID = addrID;
	}

	public String getAddrLine1() {
		return AddrLine1;
	}

	public void setAddrLine1(String addrLine1) {
		AddrLine1 = addrLine1;
	}

	public String getAddrLine2() {
		return AddrLine2;
	}

	public void setAddrLine2(String addrLine2) {
		AddrLine2 = addrLine2;
	}

	public String getAddrLine3() {
		return AddrLine3;
	}

	public void setAddrLine3(String addrLine3) {
		AddrLine3 = addrLine3;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getSt() {
		return St;
	}

	public void setSt(String st) {
		St = st;
	}

	public int getZip() {
		return Zip;
	}

	public void setZip(int zip) {
		Zip = zip;
	}

	public int getZip4() {
		return Zip4;
	}

	public void setZip4(int zip4) {
		Zip4 = zip4;
	}

	public boolean isActiveFlg() {
		return ActiveFlg;
	}

	public void setActiveFlg(boolean activeFlg) {
		ActiveFlg = activeFlg;
	}
	
}
