package com.dboy.demo.chipslayoutmanagerx;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.dboy.chips.ChipsLayoutManager;
import com.dboy.chips.SpacingItemDecoration;
import com.dboy.demo.chipslayoutmanagerx.adapter.ChipsAdapter;
import com.dboy.demo.chipslayoutmanagerx.im.OnRemoveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        ChipsLayoutManager build = ChipsLayoutManager.newBuilder(this)
                .setOrientation(ChipsLayoutManager.HORIZONTAL)
                .build();
        recyclerView.setLayoutManager(build);
        ChipsFactory chipsFactory = new ChipsFactory();
        ChipsAdapter adapter = new ChipsAdapter(chipsFactory.getItems(), new OnRemoveListener() {
            @Override
            public void onItemRemoved(int position) {

            }
        });
        recyclerView.addItemDecoration(new SpacingItemDecoration(getResources().getDimensionPixelOffset(R.dimen.item_space),
                getResources().getDimensionPixelOffset(R.dimen.item_space)));
        recyclerView.setAdapter(adapter);

    }
}