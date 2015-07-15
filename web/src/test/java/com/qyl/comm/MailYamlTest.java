package com.qyl.comm;

import org.ho.yaml.Yaml;
import org.junit.Test;
import java.util.HashMap;
import static org.junit.Assert.*;

/**
 * Created by qinyuanlong on 15/7/14.
 */
public class MailYamlTest {

	@Test
	public void readYamlTest() throws Exception{
		HashMap map = Yaml.loadType(getClass().getResourceAsStream("/config/mail.yaml"),HashMap.class);
		System.out.println(map.size());
		assertNotEquals(map, null);
	}

}
