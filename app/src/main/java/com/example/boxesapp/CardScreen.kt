package com.example.boxesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CardScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Card(
            shape = RoundedCornerShape(5.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFE1E1E1),
                contentColor = Color.Black
            ),
            modifier = Modifier
                .width(500.dp)
                .height(250.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 10.dp,
                pressedElevation = 100.dp,
            )
        ) {
            Column {
                Row(modifier = Modifier.height(100.dp)) {
                    Box(
                        modifier = Modifier
                            .padding(10.dp)
                            .height(80.dp)
                            .width(100.dp)
                            .clip(RoundedCornerShape(25.dp))
                            .background(Color.DarkGray),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.doge),
                            contentDescription = null,
                            modifier = Modifier.fillMaxSize()
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(10.dp)
                            .height(80.dp)
                            .width(400.dp)
                    ) {
                        Text(
                            text = "DogeMaster",
                            fontSize = (100.dp * 0.25f).toSp(),
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = "Rarity: Legendary",
                            fontSize = (100.dp * 0.125f).toSp(),
                        )
                        Text(
                            text = "Purchase for only $0.99!",
                            fontSize = (100.dp * 0.125f).toSp(),
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .padding(10.dp)
                        .height(135.dp)
                        .width(480.dp)
                        .clip(RoundedCornerShape(5.dp)),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 20.dp,
                    ),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.LightGray,
                        contentColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(25.dp)
                                .background(Color.DarkGray),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = "Attributes",
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Attributes()
                    }
                }
            }
        }
    }
}

@Composable
fun Attributes() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .padding(start = 6.dp, top = 6.dp)
                .height(25.dp)
                .width(180.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Hitpoints: 4475",
                modifier = Modifier.padding(4.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(end = 6.dp, top = 6.dp)
                .height(25.dp)
                .width(180.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Damage: 276",
                modifier = Modifier.padding(4.dp)
            )
        }
    }
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .padding(start = 6.dp, top = 6.dp)
                .height(25.dp)
                .width(180.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Attack Speed: 1.5s",
                modifier = Modifier.padding(4.dp)
            )
        }
        Box(
            modifier = Modifier
                .padding(end = 6.dp, top = 6.dp)
                .height(25.dp)
                .width(180.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Splash: 0.5",
                modifier = Modifier.padding(4.dp)
            )
        }
    }
}

@Composable
fun PreviewCard() {
    CardScreen()
}

fun Dp.toSp() = this.value.sp

