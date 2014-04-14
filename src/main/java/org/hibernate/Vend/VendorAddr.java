package org.hibernate.Vend;

public class VendorAddr implements java.io.Serializable {
	private Vendor Vendor;
	private VendAddress VendAddress;
	private boolean HQ;
	
	public VendorAddr(){}

	public Vendor getVendor() {
		return Vendor;
	}

	public void setVendor(Vendor vendor) {
		Vendor = vendor;
	}

	public VendAddress getVendAddress() {
		return VendAddress;
	}

	public void setVendAddress(VendAddress vendAddress) {
		VendAddress = vendAddress;
	}

	public boolean isHQ() {
		return HQ;
	}

	public void setHQ(boolean hQ) {
		HQ = hQ;
	}
	
	
}
