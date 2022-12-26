package com.gmiller.cafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailActivity extends AppCompatActivity {
    private static final String EXTRA_USER_NAME = "userName";
    private static final String EXTRA_DRINK = "drink";
    private static final String EXTRA_ADDITIVES = "additivesList";
    private static final String EXTRA_DRINK_TYPE = "drinkType";

    private TextView textViewName;
    private TextView textViewDrink;
    private TextView textViewDrinkType;
    private TextView textViewAdditives;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        initViews();
        setValues();
    }

    private void initViews(){
        textViewName = findViewById(R.id.textViewName);
        textViewDrink = findViewById(R.id.textViewDrink);
        textViewDrinkType = findViewById(R.id.textViewDrinkType);
        textViewAdditives = findViewById(R.id.textViewAdditives);

    }

    private void setValues(){
        textViewName.setText(getIntent().getStringExtra(EXTRA_USER_NAME));
        textViewDrink.setText(getIntent().getStringExtra(EXTRA_DRINK));
        textViewDrinkType.setText(getIntent().getStringExtra(EXTRA_DRINK_TYPE));
        textViewAdditives.setText(getIntent().getStringExtra(EXTRA_ADDITIVES));
    }

    public static Intent newIntent(
            Context context,
            String userName,
            String drink,
            String additivesList,
            String drinkType
    ){
        Intent intent = new Intent(context, OrderDetailActivity.class);
        intent.putExtra(EXTRA_USER_NAME, userName);
        intent.putExtra(EXTRA_DRINK, drink);
        intent.putExtra(EXTRA_ADDITIVES, additivesList);
        intent.putExtra(EXTRA_DRINK_TYPE, drinkType);
        return intent;
    }
}