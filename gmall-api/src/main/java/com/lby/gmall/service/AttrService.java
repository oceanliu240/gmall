package com.lby.gmall.service;

import com.lby.gmall.bean.BaseAttrInfo;
import com.lby.gmall.bean.BaseCatalog1;
import com.lby.gmall.bean.BaseCatalog2;
import com.lby.gmall.bean.BaseCatalog3;

import java.util.List;

public interface AttrService {
    List<BaseCatalog1> getCatalog1();

    List<BaseCatalog2> getCatalog2(String catalog1Id);
    List<BaseCatalog3> getCatalog3(String catalog2Id);

    List<BaseAttrInfo> getAttrList(String catalog3Id);

    void saveAttr(BaseAttrInfo baseAttrInfo);

    List<BaseAttrInfo> getAttrListByValueIds(String join);
}
