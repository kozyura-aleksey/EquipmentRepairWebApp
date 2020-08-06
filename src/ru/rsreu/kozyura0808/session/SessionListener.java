package ru.rsreu.kozyura0808.session;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


public class SessionListener implements HttpSessionListener
{
	
	@Override
	public void sessionCreated(HttpSessionEvent sessionEvent) {
		
	}

	//sessionEvent - Это класс, представляющий уведомления о событиях для изменения сеансов в веб-приложении.
	//javax.servlet.http.HttpSessionListener — обрабатывает события создания удаления HTTP-сессии;
	@Override
	public void sessionDestroyed(HttpSessionEvent sessionEvent) {
		OFFStatusSetter status = new OFFStatusSetter();
		status.setOnlineStatus("OFF", sessionEvent);
	}

}
