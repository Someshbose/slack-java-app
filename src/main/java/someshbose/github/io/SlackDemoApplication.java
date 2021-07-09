package someshbose.github.io;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SlackDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackDemoApplication.class, args);
	}

}
