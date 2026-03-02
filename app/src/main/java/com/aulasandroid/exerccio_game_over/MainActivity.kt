package com.aulasandroid.exerccio_game_over

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.exerccio_game_over.ui.theme.Exercício_game_overTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Exercício_game_overTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    BasicComponentsScreen(modifier = Modifier.padding(innerPadding))
//                    GameOverScreen(modifier = Modifier.padding((innerPadding)))
                }
            }
        }
    }
}

@Composable
fun BasicComponentsScreen(modifier: Modifier = Modifier) {
    Column (modifier = modifier
        .background(Color(0, 0, 0, 255))
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    )
    {
        divDeCima()
        Footer()
    }

}

@Composable
fun divDeCima(modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
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
        .fillMaxWidth(),
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

@Composable
fun Footer(modifier: Modifier = Modifier){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        iconeFooter(color = Color(255, 255, 255),
            modifier = Modifier
            .padding(0.dp,0.dp,0.dp,20.dp)
                .size(60.dp)
        )
        buttonPressStart()
    }

}

@Composable
fun iconeFooter(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier
            .padding(2.dp, 0.dp),
        painter = painterResource(R.drawable.outline_ac_unit_24),
        contentDescription = "livesIcon",
        colorFilter = ColorFilter.tint(color = color),
    )
}

@Composable
fun buttonPressStart(modifier: Modifier = Modifier) {
    Row(modifier = Modifier
        .clip(RoundedCornerShape(8.dp))
        .background(Color(255, 255, 255, 128))
        .fillMaxWidth()
        .padding(10.dp),
        horizontalArrangement = Arrangement.Center

    ) {
        Text(text = "PRESS START",
            modifier = Modifier,
            fontWeight = FontWeight.Bold,
            color = Color(255, 255, 255),
            textAlign = TextAlign.Center,
            fontSize = 32.sp,


            )
    }
}

//SEGUNDA TELA
@Composable
fun GameOverScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            AndroidIcon(color = Color.Red, modifier = Modifier.size(80.dp))
            AndroidIcon(color = Color.Blue, modifier = Modifier.size(80.dp))
            AndroidIcon(color = Color.Yellow, modifier = Modifier.size(80.dp))
            AndroidIcon(color = Color.Green, modifier = Modifier.size(80.dp))
        }
        Row() {
            Text(
                text = "GAME OVER",
                color = Color.White,
                fontSize = 60.sp,
                fontWeight = FontWeight.W600

            )
        }
    }
}