package com.example.test

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.FloatRange
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.Transformations.map
import com.example.test.ui.theme.TestTheme
import com.google.android.libraries.maps.CameraUpdateFactory
import com.google.android.libraries.maps.GoogleMap
import com.google.android.libraries.maps.MapView
import com.google.android.libraries.maps.model.LatLng
import com.google.maps.android.ktx.addMarker
import com.google.maps.android.ktx.awaitMap
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.Red)
                    .verticalScroll(rememberScrollState())) {
                Box(
                    Modifier
                        .background(Color.Blue)
                        .height(200.dp)
                        .fillMaxWidth())
                // The MapView lifecycle is handled by this composable. As the MapView also needs to be updated
                // with input from Compose UI, those updates are encapsulated into the MapViewContainer
                // composable. In this way, when an update to the MapView happens, this composable won't
                // recompose and the MapView won't need to be recreated.
                Box(
                    Modifier
                        .background(Color.Green)
                        .height(200.dp)
                        .fillMaxWidth()) {
                    AndroidView({
                        val button = Button(it)
                        button.text = "Test button inside scrollable container"
                        button
                    })
                }

                Box(
                    Modifier
                        .background(Color.Green)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Blue)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Green)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Blue)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Green)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Blue)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Green)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Blue)
                        .height(200.dp)
                        .fillMaxWidth())
                Box(
                    Modifier
                        .background(Color.Green)
                        .height(200.dp)
                        .fillMaxWidth())

            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TestTheme {
        Greeting("Android")
    }
}
