package cn.ekgc.show;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.ekgc.show.dao")
@SpringBootApplication
public class HotEventsStarter {
	public static void main(String[] args) {
		SpringApplication.run(HotEventsStarter.class,args);
	}
}
