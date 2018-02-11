package com.example.jadefung.fridgiebuddie;

/**
 * Created by yuqisu on 4/13/17.
 */

public class Schema {
    public static final String DATABASE_NAME = "fridge.db";
    public static final int VERSION = 1;

    public static class User{
        public static final String USERS_NAME = "users";

        public static class Column{
            public static final String EMAIL = "email";
            public static final String FULL_NAME ="fullName";
            public static final String BIRTHDAY ="birthday";
            public static final String PASSWORD = "password";
            public static final String PICTURE_PATH = "picturePath";
            public static final String BIO = "bio";
        }




    }

    public static class Food{
        public static final String FOOD_NAME = "foods";

        public static class Column{
            public static final String USER = "user";
            public static final String NAME = "name";
            public static final String EXPIRE = "expire";
            public static final String KIND = "kind";
        }
    }

    public static class Ingredient{
        public static final String INGREDIENT = "ingredient";
        public static class Column{
            public static final String ING_NAME = "ingredient_name";
            public static final String RECIPE_ID = "recipe_id";
        }
    }

    public static class Recipe{
        public static final String RECIPE = "recipe";
        public static class Column{
            public static final String RECIPE_ID = "recipe_id";
            public static final String RECIPE_NAME = "recipe_name";
            public static final String INGREDIENT_NAME = "ingredient_name";
        }
    }


}