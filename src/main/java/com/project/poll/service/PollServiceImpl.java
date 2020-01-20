package com.project.poll.service;

import com.project.poll.dto.Option;
import com.project.poll.dto.Poll;
import com.project.poll.repository.PollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class PollServiceImpl implements PollService {

    @Autowired
    private PollRepository pollRepository;


    @Override
    public Poll create(Poll poll) {
        return this.pollRepository.save(poll);
    }

    @Override
    public List<Poll> findAllPoll() {
        return this.pollRepository.findAll();
    }

    @Override
    public Map<Option, Integer> getPollResult(Integer pollId) {
        return null;
    }


}
