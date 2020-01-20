package com.project.poll.service;

import com.project.poll.dto.Option;

import java.util.List;

public interface OptionService {

    Option createOption(Option option);

    List<Option> getAllOptionsByPollId(Integer pollId);

    Integer getResultByOptionId(Integer optionId);
}
