package com.example.cocktailapp.service;

import com.example.cocktailapp.model.Cocktail;
import com.example.cocktailapp.model.Ingredient;
import com.example.cocktailapp.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CocktailService {

    @Autowired
    private CocktailRepository cocktailRepository;

    public List<Cocktail> findCocktailsByIngredients(List<String> selectedIngredients) {
        List<Cocktail> allCocktails = cocktailRepository.findAll();
        return allCocktails.stream()
                .filter(cocktail -> selectedIngredients.containsAll(
                        cocktail.getIngredients().stream()
                                .map(Ingredient::getName)
                                .collect(Collectors.toList())
                ))
                .collect(Collectors.toList());
    }
}
