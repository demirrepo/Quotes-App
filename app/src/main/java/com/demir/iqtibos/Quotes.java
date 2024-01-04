package com.demir.iqtibos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Quotes extends AppCompatActivity {

    private TextView quoteTxt, writerName;

    private final List<QuotesList> quotesLists = new ArrayList<>();

    /*quote position in quoteLists
    * increment when user click on next button
    * decrement when user click on prev button*/
    private int currentQuotePosition = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotes);

        final TextView categoryName = findViewById(R.id.categoryName);
        quoteTxt = findViewById(R.id.quoteTxt);
        writerName = findViewById(R.id.writerName);

        final Button prevBtn = findViewById(R.id.prevBtn);
        final Button nextBtn = findViewById(R.id.nextBtn);
        final ImageView copyBtn = findViewById(R.id.copyBtn);

        //get category name from CategoriesAdapter class
        final String getName = getIntent().getStringExtra("name");

        //set Category name to TexTView
        categoryName.setText(getName);

        //check category name and get quotes corresponds to the category name
        if (getName.equals("Hayot")){

            //get life quotes from QuotesData class
            quotesLists.addAll(QuotesData.getLifeQuotes());
            quoteTxt.setText(quotesLists.get(0).getQuote());
            writerName.setText(quotesLists.get(0).getWriter());
        }else if (getName.equals("Muvaffaqiyat")){

            //get success quotes from QuotesData class
            quotesLists.addAll(QuotesData.getSuccessQuotes());
            quoteTxt.setText(quotesLists.get(0).getQuote());
            writerName.setText(quotesLists.get(0).getWriter());
        }else if (getName.equals("Motivatsiya")){

            //get motivation quotes from QuotesData class
            quotesLists.addAll(QuotesData.getMotivationQuotes());
            quoteTxt.setText(quotesLists.get(0).getQuote());
            writerName.setText(quotesLists.get(0).getWriter());
        }else if (getName.equals("English")){

            //get english quotes from QuotesData class
            quotesLists.addAll(QuotesData.getEnglishQuotes());
            quoteTxt.setText(quotesLists.get(0).getQuote());
            writerName.setText(quotesLists.get(0).getWriter());
        }

        //get first quote from quoteLists and set to TextView


        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //decrement currentQuotePosition to get previous quote from quoteLists
                currentQuotePosition--;

                // if currentQuotePosition smaller than 0 then get last quote from quoteLists
                if (currentQuotePosition < 0){
                    currentQuotePosition = quotesLists.size() - 1;

                }

                setQuoteToTextView();
            }
        });


        copyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //copy quote and write to clipboard
                ClipboardManager clipboardManager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("quote", quotesLists.get(currentQuotePosition).getQuote());
                clipboardManager.setPrimaryClip(clipData);

                Toast.makeText(Quotes.this, "Nusxalandi!", Toast.LENGTH_SHORT).show();

            }
        });

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //increment currentQuotePosition to get next quote from quotesLists
                currentQuotePosition++;

                //check if more quotes are available if the quoteLists, if no available then set currentQuotePosition to 0 (to get again first quote)
                if (currentQuotePosition >= quotesLists.size()){
                    currentQuotePosition = 0;
                }

                setQuoteToTextView();
            }
        });
    }


    private void setQuoteToTextView(){

        //get quote from list from currentQuotePosition
        quoteTxt.setText(quotesLists.get(currentQuotePosition).getQuote());

        //get writer from list from currentQuotePosition
        writerName.setText(quotesLists.get(currentQuotePosition).getWriter());

    }




}