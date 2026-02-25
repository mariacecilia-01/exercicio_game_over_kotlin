package com.aulasandroid.exerccio_game_over

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aulasandroid.exerccio_game_over.ui.theme.Exercício_game_overTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercício_game_overTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    BasicComponentsScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .background(Color(0, 0, 0, 255))
        .fillMaxSize()
    )
    {
        Header()
        Main()
    }

}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
        ) {
        Score()
        Lives()
    }
}

@Composable
fun Score(modifier: Modifier = Modifier) {
    Row(modifier = Modifier) {
        Text(text = "SCORE: ",
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            color = Color(255,255,255)
        )
        Text(text = "0050",
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            color = Color(255,255,255)
        )
    }
}

@Composable
fun Lives(modifier: Modifier = Modifier) {
    Row(modifier = Modifier) {
        Text(text = "LIVES: ",
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            color = Color(255,255,255)
        )
        AndroidLives(modifier = Modifier, color = Color(123, 255, 123))
        AndroidLives(modifier = Modifier, color = Color(123, 255, 123))
        AndroidLives(modifier = Modifier, color = Color(123, 255, 123))
    }
}

@Composable
fun AndroidLives(modifier: Modifier = Modifier, color: Color) {
        Image(
            modifier = modifier
                .padding(2.dp, 0.dp),
            painter = painterResource(R.drawable.ic_android_black_24dp),
            contentDescription = "livesIcon",
            colorFilter = ColorFilter.tint(color = color)
        )
}

@Composable
fun Main(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .background(Color.Red),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        IconesAndroidMain()
    }
}

@Composable
fun IconesAndroidMain(modifier: Modifier = Modifier) {
    Row(modifier) {
        AndroidIcon(
            modifier = Modifier
                .size(80.dp),
            color = Color(255, 200, 0, 255)
        )
        AndroidIcon(
            modifier = Modifier
                .size(80.dp),
            color = Color(0, 34, 255, 255)
        )
        AndroidIcon(
            modifier = Modifier
                .size(80.dp),
            color = Color(255, 48, 179, 255)
        )
        AndroidIcon(
            modifier = Modifier
                .size(80.dp),
            color = Color(72, 255, 21, 255)
        )
        AndroidIcon(
            modifier = Modifier
                .size(80.dp),
            color = Color(102, 0, 255, 255)
        )
    }


}

@Composable
fun AndroidIcon(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier
            .padding(2.dp, 0.dp),
        painter = painterResource(R.drawable.ic_android_black_24dp),
        contentDescription = "livesIcon",
        colorFilter = ColorFilter.tint(color = color)
    )
}

