package com.example.retrofitdemo;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.JsonObject;

import org.json.JSONException;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    APIInterface apiInterface;
    TextView deliver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sendPost("Home Delivery",25.5955084,85.2086829,0.0,"Indore","Madhya Pradesh",false,false);
        deliver=findViewById(R.id.deliver);
    }

/*
    private void sendPost(String deliveryOption, Double latitude, Double longitude, Double rating, String district, String state, Boolean isGiveaway, Boolean isNearest)
    {
        apiInterface.getDashboardGeneralProduct(deliveryOption,latitude,longitude,rating,district,state,isGiveaway,isNearest).enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response)
            {
                if(response.isSuccessful())
                {
                    Toast.makeText(getApplicationContext(), ""+response.body().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t)
            {
                    call.cancel();
            }
        });
    }
*/


    private void sendPost(String deliveryOption, Double latitude, Double longitude, Double rating, String district, String state, Boolean isGiveaway, Boolean isNearest){

        try {

            Call<JsonObject> call;
            apiInterface = APIClient.getClient().create(APIInterface.class);
            call=apiInterface.getDashboardGeneralProduct(latitude,longitude,rating,district,state,isGiveaway,isNearest);

            call.enqueue(new Callback<JsonObject>() {
                @Override
                public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                    try {
                        JSONObject api = new JSONObject(String.valueOf(response.body()));
                        JSONObject json = api.getJSONObject("data");

                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<JsonObject> call, Throwable t) {
                }
            });
        }
        catch (Exception e) {

        }
    }


}