package com.doctalk.assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.doctalk.assignment.adapter.MyRecyclerViewAdapter;
import com.doctalk.assignment.api.APIClient;
import com.doctalk.assignment.api.APIInterface;
import com.doctalk.assignment.model.GitUsersList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        APIInterface apiInterface = APIClient.getInstance().getClient().create(APIInterface.class);
        Call<GitUsersList> getCall = apiInterface.getGitUsers("jake+followers:>1000");
        getCall.enqueue(new Callback<GitUsersList>() {
            @Override
            public void onResponse(Call<GitUsersList> call, Response<GitUsersList> response) {
                MyRecyclerViewAdapter adapter  = new MyRecyclerViewAdapter(MainActivity.this,response.body().getItemsList());
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<GitUsersList> call, Throwable t) {

            }
        });
    }
}
