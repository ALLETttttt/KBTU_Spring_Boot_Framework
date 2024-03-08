package kz.project.Kafka.listener;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaListeners {

    @KafkaListener(topics = "topic", groupId = "foo")
    public void listenGroupFoo(String message) {
        System.out.println("Received Message in group foo: " + message);
    }
}
