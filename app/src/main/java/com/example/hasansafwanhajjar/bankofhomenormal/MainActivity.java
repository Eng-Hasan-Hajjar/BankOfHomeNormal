package com.example.hasansafwanhajjar.bankofhomenormal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listviewItem;
    Button btn_Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listviewItem=(ListView) findViewById(R.id.listview_Item);
        btn_Add=(Button) findViewById(R.id.add_btn);

        ArrayList<Item> items =new ArrayList<>();
        items.add(new Item("pen",50,"others","2/3/2018"));
        items.add(new Item("notbook",200,"others","2/3/2018"));
        items.add(new Item("rice",450,"food","2/3/2018"));
        items.add(new Item("tea",50,"drink","2/3/2018"));
        ItemAdapter itemAdapter= new ItemAdapter(this,R.layout.list_item_my_item, items);

        listviewItem.setAdapter(itemAdapter);

btn_Add.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View view) {
        Intent intent =new Intent(MainActivity.this,Main2ActivityADDitem.class);
        startActivity(intent);
    }
});

    }
}
