package com.FEMA.DirBack.Repositories;

import com.FEMA.DirBack.Entities.HomeInfo;
import com.FEMA.DirBack.Entities.Noticia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeInfoRepository extends CrudRepository<HomeInfo,Integer> {
    HomeInfo findHomeInfoById(int id);
}
