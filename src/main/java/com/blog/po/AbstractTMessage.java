package com.blog.po;

import java.sql.Timestamp;

/**
 * AbstractTMessage entity provides the base persistence definition of the
 * TMessage entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTMessage implements java.io.Serializable {

	// Fields

	private String FId;
	private String FRootid;
	private String FPid;
	private Timestamp FCreatetime;
	private Timestamp FLastmodifytime;
	private String FOwnerid;
	private Integer FOwnertype;
	private String FPidlist;
	private String FContent;

	// Constructors

	/** default constructor */
	public AbstractTMessage() {
	}

	/** minimal constructor */
	public AbstractTMessage(String FId) {
		this.FId = FId;
	}

	/** full constructor */
	public AbstractTMessage(String FId, String FRootid, String FPid,
			Timestamp FCreatetime, Timestamp FLastmodifytime, String FOwnerid,
			Integer FOwnertype, String FPidlist, String FContent) {
		this.FId = FId;
		this.FRootid = FRootid;
		this.FPid = FPid;
		this.FCreatetime = FCreatetime;
		this.FLastmodifytime = FLastmodifytime;
		this.FOwnerid = FOwnerid;
		this.FOwnertype = FOwnertype;
		this.FPidlist = FPidlist;
		this.FContent = FContent;
	}

	// Property accessors

	public String getFId() {
		return this.FId;
	}

	public void setFId(String FId) {
		this.FId = FId;
	}

	public String getFRootid() {
		return this.FRootid;
	}

	public void setFRootid(String FRootid) {
		this.FRootid = FRootid;
	}

	public String getFPid() {
		return this.FPid;
	}

	public void setFPid(String FPid) {
		this.FPid = FPid;
	}

	public Timestamp getFCreatetime() {
		return this.FCreatetime;
	}

	public void setFCreatetime(Timestamp FCreatetime) {
		this.FCreatetime = FCreatetime;
	}

	public Timestamp getFLastmodifytime() {
		return this.FLastmodifytime;
	}

	public void setFLastmodifytime(Timestamp FLastmodifytime) {
		this.FLastmodifytime = FLastmodifytime;
	}

	public String getFOwnerid() {
		return this.FOwnerid;
	}

	public void setFOwnerid(String FOwnerid) {
		this.FOwnerid = FOwnerid;
	}

	public Integer getFOwnertype() {
		return this.FOwnertype;
	}

	public void setFOwnertype(Integer FOwnertype) {
		this.FOwnertype = FOwnertype;
	}

	public String getFPidlist() {
		return this.FPidlist;
	}

	public void setFPidlist(String FPidlist) {
		this.FPidlist = FPidlist;
	}

	public String getFContent() {
		return this.FContent;
	}

	public void setFContent(String FContent) {
		this.FContent = FContent;
	}

}