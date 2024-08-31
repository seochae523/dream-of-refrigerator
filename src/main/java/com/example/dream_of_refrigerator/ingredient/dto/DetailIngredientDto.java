package com.example.dream_of_refrigerator.ingredient.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class DetailIngredientDto {
    private String name;    //재료 이름
    private String categoryName; // 카테고리 이름
    private boolean isRefrigerated; // 보관 방법
    private boolean isFrozen; // 냉동 여부
}