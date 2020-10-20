package scheduler.vn.com.ids.springbootscheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Schedulerapplication {
	public static void main(String[] args) {
		SpringApplication.run(Schedulerapplication.class, args);
	}
}
