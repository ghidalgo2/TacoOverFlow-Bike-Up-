package com.example.mapapps;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class LeaderboardActivity extends AppCompatActivity {

    RecyclerView leaderboardRecyclerView, friendsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        leaderboardRecyclerView = findViewById(R.id.leaderboardRecyclerView);
        friendsRecyclerView = findViewById(R.id.friendsRecyclerView);

        // 🏆 Dummy leaderboard
        List<String> leaderboard = Arrays.asList(
                "Alice - 52 miles",
                "Bob - 48 miles",
                "Charlie - 37 miles"
        );

        leaderboardRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        leaderboardRecyclerView.setAdapter(new SimpleListAdapter(leaderboard));

        // 👥 Dummy friend suggestions
        List<String> friends = Arrays.asList("Add Emma", "Add Daniel", "Add Lila");

        friendsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        friendsRecyclerView.setAdapter(new SimpleListAdapter(friends));
    }
}
