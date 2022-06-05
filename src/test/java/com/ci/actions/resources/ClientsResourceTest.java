package com.ci.actions.resources;

import com.ci.actions.service.ClientsService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ClientsResource.class)
public class ClientsResourceTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ClientsService clientsService;

    @Test
    @DisplayName("Should Response status 200 ok")
    void shouldResponseStatus200() throws Exception {
        mockMvc.perform(get("/clients"))
                .andExpect(status().isOk());
    }

    @TestConfiguration
    static class ClientsServiceTestConfiguration {

        @Bean
        public ClientsService clientsService() {

            return new ClientsService();
        }
    }
}
