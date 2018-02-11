package com.example.jadefung.fridgiebuddie;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.jadefung.fridgiebuddie.Schema;

/**
 * Created by yuqisu on 4/28/17.
 */

public class DatabaseHelper extends SQLiteOpenHelper{
    public DatabaseHelper(Context context) {
        super(context, Schema.DATABASE_NAME,null,Schema.VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + Schema.User.USERS_NAME
                + "(_id integer primary key autoincrement, "
                +Schema.User.Column.EMAIL + ", "
                +Schema.User.Column.PASSWORD + ", "
                +Schema.User.Column.FULL_NAME + ", "
                +Schema.User.Column.BIRTHDAY + ", "
                +Schema.User.Column.PICTURE_PATH + ", "
                +Schema.User.Column.BIO + ")"
        );

        db.execSQL("CREATE TABLE " + Schema.Food.FOOD_NAME
                + "(_id integer primary key autoincrement, "
                +Schema.Food.Column.USER + ", "
                +Schema.Food.Column.NAME + ", "
                +Schema.Food.Column.EXPIRE + ", "
                +Schema.Food.Column.KIND + ")"
        );

        db.execSQL("CREATE TABLE " + Schema.Ingredient.INGREDIENT
                + "(_id integer primary key autoincrement, "
                +Schema.Ingredient.Column.ING_NAME + ", "
                +Schema.Ingredient.Column.RECIPE_ID + ")"
        );

        db.execSQL("CREATE TABLE " + Schema.Recipe.RECIPE
                + "(_id integer primary key autoincrement, "
                +Schema.Recipe.Column.RECIPE_ID + ", "
                +Schema.Recipe.Column.RECIPE_NAME + ", "
                +Schema.Recipe.Column.INGREDIENT_NAME + ")"
        );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}