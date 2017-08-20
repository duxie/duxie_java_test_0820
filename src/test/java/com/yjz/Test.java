package com.yjz;

import com.bean.PersonI;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by zyjzy on 2017/8/20.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:META-INF/application.xml"})

public class Test {
    @Autowired
    private PersonI personI;

    @org.junit.Test
    public void test() {
        personI.say();
    }
}
