package com.salat.sigurtest.components;

import com.salat.sigurtest.services.PassService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class PassEmulator implements ApplicationListener<TimeEvent> {
    private final PassService passService;

    @Override
    public void onApplicationEvent(@NonNull TimeEvent event) {
        byte[] card = isTimeForUnknownCard() ?
                passService.getRandomNotExistingCard() :
                passService.getRandomExistingCard();

        passService.validateCard(event.getTime(), card);

// if (isTimeForUnknownCard()) {
//     byte[] card = passService.getRandomNotExistingCard();
//     passService.validateCard(event.getTime(), card);
// } else {
//     byte[] card = passService.getRandomExistingCard();
//     passService.validateCard(event.getTime(), card);
// }
    }

    private boolean isTimeForUnknownCard() {
        return new Random().nextInt(5) == 0;
    }
}
