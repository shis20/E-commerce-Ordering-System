package com.imooc.service;

import com.imooc.dataobject.ProductCategory;

import java.util.List;

/**
 * shuting shi
 * 2024/07/05
 */
public interface CategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
