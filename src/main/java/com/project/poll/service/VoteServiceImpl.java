package com.project.poll.service;

import com.project.poll.model.Vote;
import com.project.poll.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServiceImpl implements VoteService {

    @Autowired
    VoteRepository voteRepository;

    @Override
    public Vote vote(Vote vote) {
        return voteRepository.save(vote);
    }

    @Override
    public List<Vote> getVotesByOptionId(Integer optionId) {
        return null;
    }

    @Override
    public List<Vote> getVotesByUserId(Integer userId) {
        return null;
    }
}
