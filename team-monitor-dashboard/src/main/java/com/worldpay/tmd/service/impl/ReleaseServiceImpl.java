package com.worldpay.tmd.service.impl;

import com.worldpay.tmd.model.Release;
import com.worldpay.tmd.repository.ReleaseRepository;
import com.worldpay.tmd.service.ReleaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReleaseServiceImpl implements ReleaseService {

    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Release getNextRelease() {
        return releaseRepository.findNextRelease();
    }
}
