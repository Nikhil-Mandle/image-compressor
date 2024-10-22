package com.nikhilproject.image_compressor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.nikhilproject.image_compressor.ui.theme.ImagecompressorTheme
import com.nikhilproject.image_compressor_library.FileManager
import com.nikhilproject.image_compressor_library.ImageCompressor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ImagecompressorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    PhotoPickerScreen(
                        imageCompressor = remember {
                            ImageCompressor(applicationContext)
                        },
                        fileManager =
                        remember {
                            FileManager(applicationContext)
                        },
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}