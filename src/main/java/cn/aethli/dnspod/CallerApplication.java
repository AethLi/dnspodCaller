package cn.aethli.dnspod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableFeignClients
@SpringBootApplication
@ServletComponentScan
@EnableAsync
public class CallerApplication {

  public static void main(String[] args) {
    SpringApplication.run(CallerApplication.class, args);
  }
}
