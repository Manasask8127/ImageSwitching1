package com.example.imageswitching;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{

    ImageView img,next,prev;
    int images[]={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,
            R.drawable.img9,R.drawable.img10,R.drawable.img11,R.drawable.img12,R.drawable.img13,R.drawable.img14,R.drawable.img15};//array of 3 images
    int curimg=0;//current image at 0th position
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.right);
        prev=findViewById(R.id.left);
        img = findViewById(R.id.image);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                curimg++;
                curimg=curimg%images.length;//mod  operation to print 3 images iteratively
                img.setImageResource(images[curimg]);
            }
        });

        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(curimg==0){
                    curimg=images.length;
                }
                curimg--;
                curimg=curimg%images.length;//mod operation to print 3 images iteratively
                img.setImageResource(images[curimg]);
            }
        });

    }
}

