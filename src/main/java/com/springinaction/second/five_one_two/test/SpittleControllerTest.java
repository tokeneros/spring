//package com.springinaction.second.five_one_two.test;
//
//import com.springinaction.second.five_one_two.data.SpittleRepository;
//import com.springinaction.second.five_one_two.entity.Spittle;
//import com.springinaction.second.five_one_two.web.HomeController;
//import com.springinaction.second.five_one_two.web.SpittleController;
//import org.junit.Test;
//import org.mockito.Mockito;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.servlet.view.InternalResourceView;
//import static org.mockito.Mockito.*;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
//import static org.hamcrest.Matchers.*;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
///**
// * @Auther: eros
// * @Date: 2019/2/15 14:00
// * @Description:
// */
//public class SpittleControllerTest {
//
//    @Test
//    public void shouldShowRecentSpittles(){
//        List<Spittle> expectedSpittles = createSpittleList(20);
//        SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
//        Mockito.when(mockRepository.findSpittles(Long.MAX_VALUE, 20))
//                .thenReturn(expectedSpittles);
//
//        SpittleController controller = new SpittleController();
////        SpittleController controller = new SpittleController(mockRepository);
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/spittles"))
//                    .andExpect(MockMvcResultMatchers.view().name("spittles"))
//                    .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
//                    .andExpect(MockMvcResultMatchers.model().attribute("spittleList",hasItems(expectedSpittles.toArray())));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void shouldShowPagedSpittles(){
//        List<Spittle> expectedSpittles = createSpittleList(50);
//        SpittleRepository mockRepository = Mockito.mock(SpittleRepository.class);
//        Mockito.when(mockRepository.findSpittles(238900, 50))
//                .thenReturn(expectedSpittles);
//
////        SpittleController controller = new SpittleController();
//        SpittleController controller = new SpittleController(mockRepository);
//        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller)
//                .setSingleView(new InternalResourceView("/WEB-INF/views/spittles.jsp"))
//                .build();
//        try {
//            mockMvc.perform(MockMvcRequestBuilders.get("/spittles?max=238900&count=50"))
//                    .andExpect(MockMvcResultMatchers.view().name("spittles"))
//                    .andExpect(MockMvcResultMatchers.model().attributeExists("spittleList"))
//                    .andExpect(MockMvcResultMatchers.model().attribute("spittleList",hasItems(expectedSpittles.toArray())));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    private List<Spittle> createSpittleList(int count) {
//        List<Spittle> spittles = new ArrayList<>();
//        for(int i = 0 ; i < count; i++ ){
//            spittles.add(new Spittle("Spittle "+ i,new Date()));
//        }
//        return spittles;
//    }
//
//}