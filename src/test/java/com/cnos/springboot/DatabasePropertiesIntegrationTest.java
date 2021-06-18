package com.cnos.springboot;

import com.cnos.springboot.bean.config.DatabaseProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
@TestPropertySource("classpath:database-properties-test.properties")
public class DatabasePropertiesIntegrationTest {

//    @Autowired
    @Resource
    private DatabaseProperties databaseProperties;

    @Test
    public void whenSimplePropertyQueriedThenReturnsPropertyValue() throws Exception {
        Assert.assertEquals("Incorrectly bound Username property",
                "baeldung", databaseProperties.getUsername());
        Assert.assertEquals("Incorrectly bound Password property",
                "password", databaseProperties.getPassword());
    }
}
