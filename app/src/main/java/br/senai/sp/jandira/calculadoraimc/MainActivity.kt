package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(){
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(240.dp)
                .background(Color(0xFFEA1450))
                .padding(24.dp),
            horizontalArrangement = Arrangement.Center
        ){
            //Icone e titulo
            Column(
                modifier = Modifier
                    .height(140.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ){
                Image(
                    painter = painterResource(id = R.drawable.img_imc),
                    contentDescription = "",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                )
                Text(
                    text = "Calculadora IMC",
                    fontSize = 38.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }//Tela de dados
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .offset(y = (-40).dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ){
            Card(
                modifier = Modifier
                    .width(340.dp)
                    .height(400.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFF9F6F6)),
                elevation = CardDefaults.cardElevation(4.dp)
            ){
                Column{
                    Row(
                        modifier = Modifier
                            .padding(40.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Text(
                            text = "Seus dados",
                            fontSize = 24.sp,
                            color = Color(0xFFEA1450),
                            fontWeight = FontWeight.Black
                            )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween

                    ){
                        Column{
                            Text(
                                text = "Seu peso:",
                                color = Color(0xFFEA1450)
                            )
                            OutlinedTextField(
                                value = "",
                                onValueChange = {},
                                placeholder = {
                                    Text(
                                        text = "Seu peso em Kg",
                                        color = Color(0xFFAFA9A9)
                                    )
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFEA1450))
                            )
                        }
                        Column{
                            Text(
                                text = "Sua altura:",
                                color = Color(0xFFEA1450)
                            )
                            OutlinedTextField(
                                value = "",
                                onValueChange = {},
                                placeholder = {
                                    Text(
                                        text = "Sua altura em cm",
                                        color = Color(0xFFAFA9A9)
                                    )
                                },
                                shape = RoundedCornerShape(8.dp),
                                colors = OutlinedTextFieldDefaults.colors(unfocusedBorderColor = Color(0xFFEA1450))
                            )
                        }
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 24.dp)
                                .padding(bottom = 20.dp)
                                .height(50.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFFEA1450)
                            ),
                            shape = RoundedCornerShape(8.dp)
                        ) {
                            Text(
                                text = "CALCULAR",
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        }
                    }
                }
            }
            Card(
                modifier = Modifier
                    .height(120.dp)
                    .width(340.dp),
                colors = CardDefaults.cardColors(Color(0xFF329F6B)),
                border = BorderStroke(1.dp, Color(0xFFAE1450))
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Column(
                        modifier = Modifier
                            .height(70.dp),
                        verticalArrangement = Arrangement.SpaceAround,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "Resultado",
                            color = Color.White,
                            fontSize = 14.sp
                        )
                        Text(
                            text = "Peso ideal",
                            color = Color.White,
                            fontSize = 20.sp
                        )
                    }
                    Text(
                        text = "21.3",
                        fontSize = 36.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Greeting()
    }
}