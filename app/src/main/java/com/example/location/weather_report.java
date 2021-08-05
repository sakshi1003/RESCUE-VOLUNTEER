package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.location.Retrofit.ApiClient;
import com.example.location.Retrofit.ApiInterface;
import com.example.location.Retrofit.Example;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class weather_report extends AppCompatActivity {
    ImageView search;
    EditText textField;
    TextView tempText,descText,humidityText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_report);

        search=findViewById (R.id.search);

        tempText=findViewById (R.id.tempText);
        descText=findViewById (R.id.descText);
        humidityText=findViewById (R.id.humidityText);
        textField=findViewById (R.id.textField);

        search.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                getWeatherData (textField.getText ().toString ().trim ());
            }
        });

    }
    private void getWeatherData(String name){
        ApiInterface apiInterface= ApiClient.getClient ().create (ApiInterface.class);
        Call<Example> call = apiInterface.getWeatherData(name);
        call.enqueue(new Callback<Example>(){
            public void onResponse(Call<Example> call, Response<Example> response){
                tempText.setText ("Temp"+" "+response.body().getMain().getTemp()+"C");

                descText.setText ("Feels Like "+" "+response.body ().getMain ().getFeels_like ());
                humidityText.setText ("Humidity"+" " +response.body ().getMain ().getHumidity ());
            }
            public void  onFailure(Call<Example> call,Throwable t){

            }
        });

    }
}