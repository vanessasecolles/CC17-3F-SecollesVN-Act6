package com.example.cc17_3f_secollesvn_act6

import FitnessTipAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FitnessTipAdapter
    private lateinit var fitnessTipList: MutableList<FitnessTip>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Initialize the list with 30 different fitness tips, images, and descriptions
        fitnessTipList = mutableListOf()

        fitnessTipList.add(
            FitnessTip(
                R.drawable.image_day1, // Replace with your actual image resource
                "Spend 15 minutes outdoors",
                "Put some time on your calendar to take a walk outside or maybe even take a meeting while you're strolling through your neighborhood."
            )
        )

        fitnessTipList.add(
            FitnessTip(
                R.drawable.image_day2,
                "Listen to a new podcast or audiobook",
                "Listen to a podcast and explore a topic you've been itching to learn more about."
            )
        )

        fitnessTipList.add(
            FitnessTip(
                R.drawable.image_day3,
                "Try a new workout routine",
                "Switch up your workout routine today with something new like yoga or bodyweight exercises."
            )
        )

        // Add more tips up to 30 for a 30-day challenge.
        for (i in 4..30) {
            fitnessTipList.add(
                FitnessTip(
                    R.drawable.default_image,  // A default image for uninitialized days
                    "Fitness Tip $i: Keep moving!",
                    "Engage in a fun activity today that keeps you active, whether it's dancing, walking, or anything you enjoy."
                )
            )
        }

        // Set the adapter with the list of fitness tips
        adapter = FitnessTipAdapter(fitnessTipList)
        recyclerView.adapter = adapter
    }
}
