/*
 * Copyright 2007-2020 Thomson Reuters Global Resources. All rights reserved. Proprietary and confidential information of TRGR.
 * Disclosure, use, or reproduction without the written authorisation of TRGR is prohibited. : PollServiceImpl.java 100473
 * 1/20/2020 10:20 AM:57Z Mykola_Filimonov $
 */

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
