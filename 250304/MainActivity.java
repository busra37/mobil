package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    ArrayList<Gorsel> gorselArrayList;

    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



        gorselArrayList = new ArrayList<>();
        Gorsel cilek = new Gorsel("Çilek", 1, R.drawable.cilek);
        Gorsel coconut = new Gorsel("Kokanat", 2, R.drawable.coconut);
        Gorsel elma = new Gorsel("Elma", 3, R.drawable.elma);
        Gorsel karpuz = new Gorsel("Karpuz", 4, R.drawable.karpuz);
        Gorsel kiraz = new Gorsel("Kiraz", 5, R.drawable.kiraz);
        Gorsel kivi = new Gorsel("Kivi", 6, R.drawable.kivi);
        Gorsel muz = new Gorsel("Muz", 7, R.drawable.muz);

        gorselArrayList.add(cilek);
        gorselArrayList.add(coconut);
        gorselArrayList.add(elma);
        gorselArrayList.add(karpuz);
        gorselArrayList.add(kiraz);
        gorselArrayList.add(kivi);
        gorselArrayList.add(muz);

        binding.imageButton.setImageResource(gorselArrayList.get(0).foto);
        binding.textView.setText("Bilgi:" + gorselArrayList.get(0).bilgi);
        seciliSiraNo = 0;


    }
    public void geriGelme(View view){
        if(seciliSiraNo>0){
            seciliSiraNo--;
            binding.imageButton.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText("Bilgi: "+gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

    public void ileriGitme(View view){
        if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageButton.setImageResource(gorselArrayList.get(seciliSiraNo).foto);
            binding.textView.setText("Bilgi: "+gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }

}



