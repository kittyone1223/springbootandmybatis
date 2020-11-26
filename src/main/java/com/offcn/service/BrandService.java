package com.offcn.service;

import com.offcn.pojo.TbBrand;
import com.offcn.pojo.User;

import java.util.List;

public interface BrandService {
    public List<TbBrand> findAll();
    public void add(TbBrand brand);
    public TbBrand findOne(Long id);
    public void update(TbBrand brand);
    public void delete(Long id);
}
