package com.example.fitness

import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.GridLayout
import android.widget.GridView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.fitness.ui.theme.FitnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    GreetingFitnessImage(
//                        name = stringResource(R.string.signature_text), message = stringResource(
//                            R.string.motivational_quote_text
//                        )
//                    )
//                    ComposeArticle(
//                        title = stringResource(R.string.title_text),
//                        paragraphOne = stringResource(R.string.paragraph_one_text),
//                        paragraphTwo = stringResource(R.string.paragrarph_two_text)
//                    )
//                    TaskDoneIcon()
//                    TextQuadrant()
                    BusinessCard(
                        name = "John Doe",
                        position = "Software dev",
                        email = "jo@gm.xom",
                        socialMediaHandle = "@jojo",
                        phoneNumber = "+255746638905"
                    )

                }
            }
        }
    }
}

@Composable
fun GreetingFitnessText(name: String, message: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier.padding(8.dp), verticalArrangement = Arrangement.Center) {
        Text(
            text = message,
            fontSize = 60.sp,
            lineHeight = 60.sp,
            fontFamily = FontFamily.Serif,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Text(
            text = name,
            fontSize = 30.sp,
            lineHeight = 10.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier
                .padding(14.dp)
                .align(alignment = Alignment.End),
            color = Color.White
        )

    }
}

@Composable
fun GreetingFitnessImage(message: String, name: String) {
    var image = painterResource(id = R.drawable.fitness)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.9F,
            colorFilter = ColorFilter.tint(
                Color(0xffA6000000), blendMode = BlendMode.Darken
            )
        )
        GreetingFitnessText(
            name = name, message = message, modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )

    }
}

@Composable
fun ComposeArticle(
    title: String,
    paragraphOne: String,
    paragraphTwo: String,
    modifier: Modifier = Modifier
) {
    var image = painterResource(id = R.drawable.compose)
    Column(modifier = modifier) {
        Image(painter = image, contentDescription = null, contentScale = ContentScale.FillWidth)
        Text(text = title, fontSize = 24.sp, modifier = modifier.padding(16.dp))
        Text(
            text = paragraphOne,
            modifier = modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = paragraphTwo,
            modifier = modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }

}

@Composable
fun TaskDoneIcon(modifier: Modifier = Modifier) {
    var image = painterResource(id = R.drawable.done)
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = image, contentDescription = null)
        Text(
            text = "All tasks completed",
            fontWeight = FontWeight.Bold,
            modifier = modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(text = "Nice work!", fontSize = 16.sp)
    }

}


@Composable
fun TextQuadrant() {
    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.text_composable_text),
                description = stringResource(R.string.composable_paragraph),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            ComposableInfoCard(
                title = stringResource(R.string.image_composable_text),
                description = stringResource(R.string.image_paragraph),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )

        }
        Row(Modifier.weight(1f)) {
            ComposableInfoCard(
                title = stringResource(R.string.row_composable_text),
                description = stringResource(R.string.row_paragraph),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)

            )
            ComposableInfoCard(
                title = stringResource(R.string.column_composable_text),
                description = stringResource(R.string.column_paragraph),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)

            )
        }
    }

}

@Composable
fun ComposableInfoCard(
    title: String,
    description: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = description, textAlign = TextAlign.Justify)
    }
}


@Composable
fun BusinessCard(
    name: String,
    position: String,
    phoneNumber: String,
    email: String,
    socialMediaHandle: String,
    modifier: Modifier = Modifier
) {
    var image = painterResource(id = R.drawable.android_logo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .background(color = Color(0xFFcfe3d5))


    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = modifier
                .size(width = 100.dp, height = 100.dp)
                .background(
                    color =
                    Color(0xFF06035c)
                )
        )
        Text(text = name, fontWeight = FontWeight.Bold, fontSize = 24.sp, modifier = Modifier.padding(top = 10.dp), fontFamily = FontFamily.Serif)
        Text(
            text = position,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Italic,
            modifier = modifier.padding(bottom = 40.dp)
        )

        ContactInformation(icon = Icons.Rounded.Phone, description = phoneNumber)
        ContactInformation(icon = Icons.Rounded.Share, description = email)
        ContactInformation(icon = Icons.Rounded.Email, description = socialMediaHandle)

    }

}

@Composable
fun ContactInformation(icon: ImageVector, description: String) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(start = 50.dp, bottom = 10.dp)
        ) {
            Icon(
                icon,
                contentDescription = description,
                modifier = Modifier.padding(start = 60.dp),
                tint = Color(0xFF0d5e28)
            )
            Text(text = description, modifier = Modifier.padding(start = 25.dp))
        }
    }

}


@Preview(showBackground = true, name = "jo")
@Composable
fun FitnessPreview() {
    FitnessTheme {
//        GreetingFitnessText(name = "Speedy", message = "You are the champ!!")
//        GreetingFitnessImage(name =  stringResource(R.string.signature_text), message =  stringResource(
//            R.string.motivational_quote_text
//        ))

//        ComposeArticle(
//            title = stringResource(R.string.title_text),
//            paragraphOne = stringResource(R.string.paragraph_one_text),
//            paragraphTwo = stringResource(R.string.paragrarph_two_text)
//        )
//        TaskDoneIcon()
//        TextQuadrant()

        BusinessCard(
            name = "John Doe",
            position = "Software dev",
            email = "jo@gm.xom",
            socialMediaHandle = "@jojo",
            phoneNumber = "+255746638905"
        )
    }
}