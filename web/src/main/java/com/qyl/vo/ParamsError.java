package com.qyl.vo;

/**
 * Created by qinyuanlong on 15/7/10.
 */
import java.util.HashMap;

public class ParamsError extends BaseResult<HashMap<String,String>> {
	public ParamsError(){
		this.setResultId(BizCode.PARAM_ERROR);
		this.setMessage("参数错误");
	}
}
