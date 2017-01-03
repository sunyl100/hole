package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseRecords<M extends BaseRecords<M>> extends Model<M> implements IBean {

	public void setFid(Integer fid) {
		set("fid", fid);
	}

	public Integer getFid() {
		return get("fid");
	}

	public void setFcreateTime(java.util.Date fcreateTime) {
		set("fcreate_time", fcreateTime);
	}

	public java.util.Date getFcreateTime() {
		return get("fcreate_time");
	}

	public void setFcreater(String fcreater) {
		set("fcreater", fcreater);
	}

	public String getFcreater() {
		return get("fcreater");
	}

	public void setFtype(Integer ftype) {
		set("ftype", ftype);
	}

	public Integer getFtype() {
		return get("ftype");
	}

}
