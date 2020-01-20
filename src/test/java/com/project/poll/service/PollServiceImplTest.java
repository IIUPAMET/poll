package com.project.poll.service;

import com.project.poll.dto.Poll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PollServiceImplTest {

    @Autowired
    PollService pollService;

    @Test
    void createPoll() {
        Poll poll = new Poll();
        poll.setSubject("testSubject");
        poll.setText("testText");
        this.pollService.create(poll);
    }

}