package com.spring.study.third;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021/11/4 9:03
 */
public class ConsumerFastStart {
    public static final String brokerList = "172.171.15.100:9092";
    public static final String topic = "quickstart-events";
    public static final String groupId = "group.demo1";

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        properties.put("bootstrap.servers", brokerList);
        // 设置消费者组的名称，具体的释义---
        properties.put("group.id", groupId);

        // 创建一个消费者客户端实例
        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(properties);
        // 订阅主题
        consumer.subscribe(Collections.singletonList(topic));
        // 循环消费消息
        while (true) {
            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000).toMillis());
            for (ConsumerRecord<String, String> record : records) {
                System.out.println(record.value());
            }
        }
    }

}
