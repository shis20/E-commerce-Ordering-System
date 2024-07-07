package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * shuting shi
 * 2024/07/05
 */
public interface CategoryService {
    /*
    后台管理
     */
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    /*
    买家端使用
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
