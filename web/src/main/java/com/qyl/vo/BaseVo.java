package com.qyl.vo;

import java.util.UUID;

/**
 * Created by qinyuanlong on 15/7/15.
 */
public class BaseVo {
	private String id;

	public String  getId() {
		if(this.id == null){
			this.id = UUID.randomUUID().toString();
		}
		return this.id;
	}
}
