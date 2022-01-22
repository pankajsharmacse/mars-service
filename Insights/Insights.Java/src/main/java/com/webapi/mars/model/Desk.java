package com.webapi.mars.model;

import java.io.Serializable;

public class Desk implements Serializable{

	/**
	 * 
	 */
	private String tcid;

	private String cutoffTime;

	private String deskName;

	public String getTcid() {
		return tcid;
	}

	public void setTcid(String tCID) {
		tcid = tCID;
	}

	public String getCutoffTime() {
		return cutoffTime;
	}

	public void setCutoffTime(String cutoffTime) {
		this.cutoffTime = cutoffTime;
	}

	public String getDeskName() {
		return deskName;
	}

	public void setDeskName(String deskName) {
		this.deskName = deskName;
	}

	@Override
	public String toString() {
		return "Desk{" + "tcid='" + tcid + '\'' + ", cutoffTime='" + cutoffTime + '\'' + ", deskName='" + deskName
				+ '\'' + '}';
	}
}