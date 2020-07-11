package guru.springframework.sbmbeerinventoryservice.services;

import guru.springframework.sbmbeerinventoryservice.config.JmsConfig;
import guru.springframework.sbmbeerinventoryservice.domain.BeerInventory;
import guru.springframework.sbmbeerinventoryservice.events.NewInventoryEvent;
import guru.springframework.sbmbeerinventoryservice.repositories.BeerInventoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Component
public class NewInventoryListener {

    private final BeerInventoryRepository beerInventoryRepository;

    @Transactional
    @JmsListener(destination = JmsConfig.NEW_INVENTORY_QUEUE)
    public void listen(NewInventoryEvent event) {
        log.debug("Getting request for a new inventory - " + event);

        BeerInventory newBeerInventory = BeerInventory.builder()
                .beerId(event.getBeerDto().getId())
                .upc(event.getBeerDto().getUpc())
                .quantityOnHand(event.getBeerDto().getQuantityOnHand())
                .build();
        beerInventoryRepository.save(newBeerInventory);
    }
}
