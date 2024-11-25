```
cocktaile-prorotype/
├── src/main/java/com/example/cocktailapp/
│   ├── CocktailAppApplication.java  (точка входа)
│   ├── controller/                  (контроллеры)
│   │   ├── CocktailController.java
│   ├── model/                       (модели данных)
│   │   ├── Cocktail.java
│   │   ├── Ingredient.java
│   ├── service/                     (логика приложения)
│   │   ├── CocktailService.java
│   └── repository/                  (данные о коктейлях)
│       ├── CocktailRepository.java
└── src/main/resources/
    ├── templates/                   (шаблоны HTML)
    │   ├── index.html
    │   ├── cocktails.html
    └── application.properties       (настройки)
```