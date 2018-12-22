package server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws Exception{
		Logger logger = LoggerFactory.getLogger(GreetingController.class);
		String ip = InetAddress.getLocalHost().getHostAddress();
		logger.info("IP IS %s\n".format(ip));;
        SpringApplication.run(Application.class, args);
    }
}