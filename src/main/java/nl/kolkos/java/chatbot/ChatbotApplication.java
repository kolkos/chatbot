package nl.kolkos.java.chatbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class ChatbotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(ChatbotApplication.class, args);
	}

}
