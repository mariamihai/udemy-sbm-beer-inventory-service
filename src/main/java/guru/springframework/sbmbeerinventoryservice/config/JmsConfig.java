package guru.springframework.sbmbeerinventoryservice.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.sbmbeerinventoryservice.events.NewInventoryEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JmsConfig {

    public static final String NEW_INVENTORY_QUEUE = "new-inventory";

    @Bean
    public MessageConverter messageConverter(ObjectMapper objectMapper) {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        converter.setTypeIdMappings(setClassMappings());

        converter.setObjectMapper(objectMapper);

        return converter;
    }

    private Map<String,Class<?>> setClassMappings() {
        Map<String,Class<?>> typeIdMappings = new HashMap<>();
        typeIdMappings.put(NewInventoryEvent.class.getSimpleName(), NewInventoryEvent.class);

        return typeIdMappings;
    }
}