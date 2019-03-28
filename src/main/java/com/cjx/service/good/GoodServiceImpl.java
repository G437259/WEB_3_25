package com.cjx.service.good;

import com.cjx.dao.GoodDao;
import com.cjx.pojo.Good;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class GoodServiceImpl implements  GoodService {
    @Resource
    GoodDao goodDao;
    @Override
    public List<Good> list() {
        return goodDao.list();
    }
}
