package com.offcn.controller;


import com.offcn.pojo.TbBrand;
import com.offcn.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;


    @PostMapping("/")
    public String add(@RequestBody TbBrand brand){
        try {
            brandService.add(brand);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @GetMapping("/")
    public List<TbBrand> getBrandList(){
        List<TbBrand> brandList = brandService.findAll();
        return brandList;
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id,@RequestBody TbBrand brand){
        try {
            System.out.println(id);
            TbBrand tbBrand = brandService.findOne(id);
            tbBrand.setName(brand.getName());
            tbBrand.setFirstChar(brand.getFirstChar());
            brandService.update(tbBrand);
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        try {
            brandService.delete(id);
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "删除失败";
        }
    }

    @GetMapping("/{id}")
    public TbBrand findOne(@PathVariable("id") Long id){
        TbBrand brand = brandService.findOne(id);
        return brand;
    }
}
