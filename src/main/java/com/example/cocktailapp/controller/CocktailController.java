package com.example.cocktailapp.controller;

import com.example.cocktailapp.model.Cocktail;
import com.example.cocktailapp.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CocktailController {

    @Autowired
    private CocktailService cocktailService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("ingredients", List.of("Mint", "Rum", "Soda", "Tequila", "Lime Juice", "Triple Sec", "Whiskey", "Sugar", "Bitters"));
        return "index";
    }

    @PostMapping("/cocktails")
    public String getCocktails(@RequestParam("ingredients") List<String> selectedIngredients, Model model) {
        List<Cocktail> cocktails = cocktailService.findCocktailsByIngredients(selectedIngredients);
        model.addAttribute("cocktails", cocktails);
        return "cocktails";
    }
}
