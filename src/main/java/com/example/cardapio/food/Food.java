package com.example.cardapio.food;

import com.example.cardapio.dto.FoodRegister;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="foods")
@Entity(name="foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
    private String description;
    public Food(FoodRegister data) {
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
        this.description = data.description();
    }
}
