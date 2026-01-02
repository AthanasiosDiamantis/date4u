package com.saki.date4u;

import com.saki.date4u.core.FileSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.unit.DataSize;

import java.util.Arrays;

@SpringBootApplication
public class Date4uApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Date4uApplication.class, args);
        FileSystem fs = ctx.getBean(FileSystem.class);
        System.out.println(DataSize.ofBytes(fs.getFreeDiskSpace() ).toGigabytes() + " GB" );
//        Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(System.out::println);


    }

}
