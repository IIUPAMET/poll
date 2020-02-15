package com.project.poll.service;

import com.project.poll.model.Vote;

import java.util.List;

public interface VoteService {
    Vote vote(Vote vote);

    List<Vote> getVotesByOptionId(Integer optionId);

    List<Vote> getVotesByUserId(Integer userId);
}
