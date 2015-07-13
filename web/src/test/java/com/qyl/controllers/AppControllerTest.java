package com.qyl.controllers;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by qinyuanlong on 15/7/7.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"/config/mvc-dispatcher-servlet.xml"})
public class AppControllerTest {
    private MockMvc mockMvc;

    @InjectMocks
    UserController appTest;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(appTest).build();
    }

    @Test
    public void should_return_status_success_when_send_mail_success() throws Exception {
//        when(mailService.send("test@test.com", "test", "test")).thenReturn(new Result("成功"));

        mockMvc.perform(post("/list")
                .param("content", "test"))
                .andDo(print())
                .andExpect(status().isOk()).andExpect(content().string(containsString("id")));

//        verify(mailService).send("test@test.com", "test", "test");
    }
}
