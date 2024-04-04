package com.FEMA.DirBack.Services;

import com.FEMA.DirBack.Entities.HomeInfo;
import com.FEMA.DirBack.Repositories.HomeInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeInfoService {
    private final HomeInfoRepository homeInfoRepository;

    @Autowired
    public HomeInfoService(HomeInfoRepository homeInfoRepository) {
        this.homeInfoRepository = homeInfoRepository;
    }
    public HomeInfo getHomeInfo(){
        return homeInfoRepository.findHomeInfoById(1);
    }
}
