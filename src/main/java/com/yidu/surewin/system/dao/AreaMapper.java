package com.yidu.surewin.system.dao;

import com.yidu.surewin.system.domain.Area;
import com.yidu.surewin.system.domain.AreaExample;
import java.util.List;

public interface AreaMapper {

    List<Area> selectByExample(AreaExample example);

}