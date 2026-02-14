package com.gorbacheva.android_lab_5_gorbacheva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}
@Composable
fun TitleBlock() {
    Column(
        modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text(
            text = "Пример Compose-приложения"
        )
        Text(
            text = "Row, Column, Size, ARGB"
        )
    }

}

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ) {
            TitleBlock()
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            ColorRow()
        }
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentAlignment = Alignment.TopCenter
        ) {
            CombineBlock()
        }
    }
}

@Composable
fun ColorRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        ColorBox(Color(0xFFFF0000))
        ColorBox(Color(0x802FFF00))
        ColorBox(Color(0xFF001AC0))
    }
}

@Composable
fun ColorBox(color: Color) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .background(color)
    )
}

@Composable
fun CombineBlock() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
            .background(Color(0xFFBBBABA))
    ) {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,

            ) {
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = "Левая колонка"
                )
                Text(
                    text = "Текст 1"
                )
            }
            Column(
                modifier = Modifier,
                horizontalAlignment = Alignment.End
            ) {
                Text(
                    text = "Правая колонка"
                )
                Text(
                    text = "Текст 2"
                )
            }

        }
    }
}




//class MainActivity : ComponentActivity() {
//    @OptIn(ExperimentalMaterial3Api::class)
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = { Text(text = "Scaffold example") }
//                    )
//                },
//                floatingActionButton = {
//                    FloatingActionButton(onClick = { }) {
//                        Text(text = "+")
//                    }
//                }
//            ) {
//                paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Основное содержимое экрана")
//                }
//            }
//        }
//    }
//}








//val symbols = "Hello world!".filter { it.isLetter() }
//Column (
//modifier = Modifier
//.fillMaxSize()
//.background(color = Color.Green)
//.padding(8.dp),
//verticalArrangement = Arrangement.SpaceAround,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for(char in symbols) {
//            Text(
//                text = char.toString()
//            )
//        }
//    }
//    Spacer(modifier = Modifier.height(16.dp))
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for(char in symbols.reversed()) {
//            Text(
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Red,
//                letterSpacing = 24.sp
//            )
//        }
//    }
//}







//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(Color.White)
//.padding(16.dp),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0xFFFF0000))
//    )
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0x80FF0000))
//    )
//}