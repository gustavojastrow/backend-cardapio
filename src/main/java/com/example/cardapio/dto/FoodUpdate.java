package com.example.cardapio.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record FoodUpdate(@NotNull Long id, String title, String image, Float price, String description) {
}
