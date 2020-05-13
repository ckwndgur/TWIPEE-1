package com.NSLB.TWIPEE.TripTalkView.Board;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.NSLB.TWIPEE.R;


public class Board_Baggage extends Board_BabyCar {

    private String BoardType = "Baggage";

    public Board_Baggage()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_board__baby_car, container, false);
        setComp(view);

        Adapter(BoardType);

        return view;
    }


   // @Override
    //public void getBoard() {
    //    super.getBoard();
    //}

    @Override
    public void Adapter(String BoardType) {
        super.Adapter(BoardType);

    }

    @Override
    public void setComp(View view) {
        View v = view;
        Writfab = v.findViewById(R.id.fabPost);
        mRecyclerView =v.findViewById(R.id.recycler1);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        Writfab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Board_NewWriteActivity.class);
                intent.putExtra("BoardType","Baggage");
                startActivity(intent);
            }
        });

    }



}
