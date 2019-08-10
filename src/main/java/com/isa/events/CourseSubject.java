package com.isa.events;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CourseSubject {
    private List<String> events = Arrays.asList("Java", "Front-end", "NOTHING", "Java", "Python");

    public Stream<String> subscribe() {
        return events.stream()
                .peek(message -> {
                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        throw new RuntimeException("Thread doesn't want to sleep", e);
                    }
                });
    }

    public Stream<String> simulateInternet() {
        Collections.shuffle(events);
        return subscribe();
    }
}
