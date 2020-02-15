package com.project.poll.service;

import com.project.poll.model.Option;
import com.project.poll.repository.OptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionServiceImpl implements OptionService {

    @Autowired
    OptionRepository optionRepository;

    @Override
    public Option createOption(Option option) {
        return optionRepository.save(option);
    }

    @Override
    public List<Option> getAllOptionsByPollId(Integer pollId) {
        return null;
    }

    @Override
    public Integer getResultByOptionId(Integer optionId) {
        return (int) optionRepository.count();
    }
}
