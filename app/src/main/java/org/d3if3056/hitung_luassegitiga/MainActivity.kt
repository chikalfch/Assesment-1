package org.d3if3056.hitung_luassegitiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.d3if3056.hitung_luassegitiga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}