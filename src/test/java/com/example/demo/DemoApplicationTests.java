package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }
//
//    @Test
//    public void status() throws Exception{
//        String[] cmds = {"/bin/sh","-c","ps -ef|grep java"};
//        Process pro = Runtime.getRuntime().exec(cmds);
//        pro.waitFor();
//        InputStream in = pro.getInputStream();
//        BufferedReader read = new BufferedReader(new InputStreamReader(in));
//        String line = null;
//        while((line = read.readLine())!=null){
//            System.out.println(line);
//        }
//    }

}
