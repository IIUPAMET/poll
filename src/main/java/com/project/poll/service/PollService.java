package com.project.poll.service;

import com.project.poll.dto.Option;
import com.project.poll.dto.Poll;

import java.util.List;
import java.util.Map;

public interface PollService {
    Poll create(Poll poll);

    List<Poll> findAllPoll();

    Map<Option, Integer> getPollResult(Integer pollId);
}
