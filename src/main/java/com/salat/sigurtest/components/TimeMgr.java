package com.salat.sigurtest.components;

import com.salat.sigurtest.util.TimeConstants;
import lombok.Getter;
import lombok.NonNull;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class TimeMgr implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;
    private OffsetDateTime time = TimeConstants.START_TIME;

    @Override
    public void setApplicationEventPublisher(@NonNull ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    // каждую 1/10 секунды добавляет 8640 секунд к виртуальному дню
    // 1 виртуальный день = 1 реальная секунда
    // 1/10 виртуального дня = 1/10 реальной секунды
    @Scheduled(fixedRate = 100)
    public void publishTimeChange() {
        if (time.isAfter(TimeConstants.END_TIME)) {
            // subscriber'ы будут падать с IllegalArgumentException
            applicationEventPublisher.publishEvent(null);
            return;
        }

        applicationEventPublisher.publishEvent(new TimeEvent(this, time));
        time = time.plusSeconds(24 * 60 * 60 / 10);

        // По идее, можно использовать Kafka, Rabbit или любой другой брокер сообщений, но
        // 1. Не знаю, сколько времени занимает считывание сообщений.
        //    Тут данные обновляются 10 раз в секунду и подписчики получают сообщения мгновенно (примерно)
        // 2. Всё сделано внутри Spring, без использования сторонних решений и тонны конфигурации
        // 3. Нет взаимодействия с другими сервисами, так что использование средств Spring вполне достаточно.
        //    Однако, если понадобиться масштабировать, то нужно будет поменять только способ отправки и считывания сообщений
    }
}

@Getter
class TimeEvent extends ApplicationEvent {
    private final OffsetDateTime time;

    public TimeEvent(Object source, OffsetDateTime timePayload) {
        super(source);
        this.time = timePayload;
    }

    public boolean isStartOfTheNewDay() {
        return time.getHour() == 0 && time.getMinute() == 0;
    }
}