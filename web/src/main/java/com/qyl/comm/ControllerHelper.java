package com.qyl.comm;

import com.qyl.vo.BaseResult;
import com.qyl.vo.ParamsError;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;

/**
 * Created by qinyuanlong on 15/7/12.
 */
public class ControllerHelper {

	public static BaseResult paramsError(BindingResult bindingResult){
		BaseResult result = new ParamsError();
		List<FieldError> errors = bindingResult.getFieldErrors();
		for (FieldError error : errors ) {
			HashMap<String,String> hash = new HashMap<String, String>();
			hash.put(error.getField(), error.getDefaultMessage());
			result.setData(hash);
		}

		return result;
	}
}
