package com.example.cocktailapp.repository;

import com.example.cocktailapp.model.Cocktail;
import com.example.cocktailapp.model.Ingredient;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class CocktailRepository {

    public List<Cocktail> findAll() {
        return Arrays.asList(
                new Cocktail("Mojito", Arrays.asList(new Ingredient("Mint"), new Ingredient("Rum"), new Ingredient("Soda"))),
                new Cocktail("Margarita", Arrays.asList(new Ingredient("Tequila"), new Ingredient("Lime Juice"), new Ingredient("Triple Sec"))),
                new Cocktail("Old Fashioned", Arrays.asList(new Ingredient("Whiskey"), new Ingredient("Sugar"), new Ingredient("Bitters")))
        );
    }
}