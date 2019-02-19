package com.springinaction.second.five_one_two.test;

import com.springinaction.second.five_one_two.web.HomeController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.Assert.assertEquals;

/**
 * @Auther: eros
 * @Date: 2019/2/15 14:00
 * @Description:
 */
public class HomeControllerTest {

    @Test
    public void testHomePage(){
        try {
            HomeController controller = new HomeController();
            // 搭建MockMvc
            MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
            // 对 "/"执行GET请求，预期得到home视图
            mockMvc.perform(MockMvcRequestBuilders.get("/"))
                    .andExpect(MockMvcResultMatchers.view().name("home"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
