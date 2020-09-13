package com.worldpay.tmd.service;

import com.worldpay.tmd.model.Release;

public interface ReleaseService {
    Release getNextRelease();
}
