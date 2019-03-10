package nl.kolkos.java.chatbot.components;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class Chatbot extends TelegramLongPollingBot {

	@Override
	public void onUpdateReceived(Update update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBotUsername() {
		return "@kolkos_ProbeerselBot";
	}

	@Override
	public String getBotToken() {
		return "348807800:AAGEcj83xpwlAhC69GC8mPj3byha3BwJ8-Y";
	}

}
