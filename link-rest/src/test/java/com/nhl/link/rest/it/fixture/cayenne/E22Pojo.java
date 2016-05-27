package com.nhl.link.rest.it.fixture.cayenne;

import org.apache.cayenne.ObjectId;

import com.nhl.link.rest.annotation.LrAttribute;
import com.nhl.link.rest.annotation.LrRelationship;

public class E22Pojo {

	private String string;
	private int integer;
	private E22SubPojo subPojo;

	public ObjectId getParentId() {
		return new ObjectId("E22", E22.ID_PK_COLUMN, integer);
	}

	@LrAttribute
	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@LrAttribute
	public int getInteger() {
		return integer;
	}

	public void setInteger(int integer) {
		this.integer = integer;
	}

	@LrRelationship
	public E22SubPojo getSubPojo() {
		return subPojo;
	}

	public void setSubPojo(E22SubPojo subPojo) {
		this.subPojo = subPojo;
	}
}