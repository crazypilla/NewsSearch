package com.example.saisriharshitavallurupalli.newssearch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import com.example.saisriharshitavallurupalli.newssearch.R;

import com.example.saisriharshitavallurupalli.newssearch.Retrofit.RetrofitClient;
import com.example.saisriharshitavallurupalli.newssearch.models.News;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SearchRes extends AppCompatActivity {
    // public static TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_res);
        String searchText=getIntent().getStringExtra(MainActivity.searchText);
        // display=(TextView) findViewById(R.id.display);
        // display.setText(searchText);

        getData(searchText);
    }

    private void getData(final String searchText) {

        // final Double amt=amount;
        Map<String,String> parameters=new HashMap<>();

        //parameters.put("access_key","8676171-014b260fab275b497c9fd8142");
        parameters.put("token","a6fe99a5-03fa-4c89-bdcc-5fccc6da3166");
        parameters.put("size","50");


        parameters.put("format","json");
        parameters.put("q",searchText);
        parameters.put("sort","crawled");
        //  parameters.put("currencies","INR");
        //  parameters.put("access_key","8363e0e84a24ed40235f2e03a3818612");
        RetrofitClient
                .getCcApi().baseApiCall(parameters).enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                Log.i("success",response.body().toString());

                // double finalAmt=(response.body().quotes.uSDINR)*amt;
                Log.i("total hits  ",response.body().totalResults+" ");
                // display.setText("total hits on the api for "+searchText+" are : "+response.body().totalResults);
                //displayText.setText("As per current values, the value you entered is:  "+finalAmt+"  INR");

                createRecyclerView(response.body());
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {
                Log.e("error", t.getMessage());

            }
        });


    }

    private void createRecyclerView(News newsList) {
        // Log.i("hits size inside recycler view ",Integer.toString(newsList.posts.size()));

        RecyclerView imagesRecyclerView =findViewById(R.id.news_recycler_view);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        imagesRecyclerView.setLayoutManager(layoutManager);
        RecyclerView.Adapter adapter=new NewsListAdapter(newsList);
        imagesRecyclerView.setAdapter(adapter);


    }
}
