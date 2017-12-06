package com.blog.po;

import java.sql.Timestamp;

/**
 * TMessage entity. @author MyEclipse Persistence Tools
 */
public class TMessage extends AbstractTMessage implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TMessage() {
	}

	/** minimal constructor */
	public TMessage(String FId) {
		super(FId);
	}

	/** full constructor */
	public TMessage(String FId, String FRootid, String FPid,
			Timestamp FCreatetime, Timestamp FLastmodifytime, String FOwnerid,
			Integer FOwnertype, String FPidlist, String FContent) {
		super(FId, FRootid, FPid, FCreatetime, FLastmodifytime, FOwnerid,
				FOwnertype, FPidlist, FContent);
	}

}
