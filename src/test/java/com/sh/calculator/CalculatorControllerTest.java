package com.sh.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:test.xml")
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@WebAppConfiguration
public class CalculatorControllerTest {


    @Autowired
    WebApplicationContext wac;

    MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).dispatchOptions(true).build();
    }

    @Test
    public void test() throws Exception {
        MockHttpServletRequestBuilder request = get("/test");
        ResultActions result = null;

        result = mockMvc.perform(request);
        result.andExpect(MockMvcResultMatchers.redirectedUrl("test"));
    }

//    @Test
//    public void setOperandTest() throws Exception {
//        MockHttpServletRequestBuilder request = get("/setOperand?arg=5");
//        ResultActions result = null;
//
//        result = mockMvc.perform(request);
//
//    }

    @Test
    public void setOperandTest() throws Exception {
        ResultActions result = null;
        result = mockMvc.perform(MockMvcRequestBuilders.post("/setOperand")
                .param("arg", "1"))
                .andExpect(MockMvcResultMatchers.forwardedUrl("1"));

    }

}
