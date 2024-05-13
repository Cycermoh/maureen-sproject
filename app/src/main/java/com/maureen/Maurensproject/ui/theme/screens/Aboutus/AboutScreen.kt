package com.maureen.Maurensproject.ui.theme.screens.Aboutus

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.Maurensproject.navigation.ROUTE_REGISTER
import com.maureen.maurensproject.R


@Composable
fun Aboutscreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.hostel1), contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "ABOUT US SECTION",
                style = MaterialTheme.typography.headlineLarge,
                modifier = Modifier.padding(bottom = 16.dp),
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.W900,
                color = Color.Red

            )
            Spacer(modifier = Modifier.height(10.dp))

            // ABOUT US
            Text(
                text = "ABOUT US",
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Cyan,
                fontSize = 25.sp
            )
            Text(
                text = "Esgrays Hostels is a vibrant and welcoming accommodation option located in the heart of Nikev City offering a unique experience for students seeking comfort and affordability",
                modifier = Modifier.padding(bottom = 16.dp) ,
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W500
            )

            // OUR STORY
            Text(
                text = "OUR STORY",
                //style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Cyan,
                fontSize = 25.sp
            )
            Text(
                text = "Founded in the year 2000, Esgrays Hostels has been a home away from home for thousands of students all over the country. Our journey began with a vision to create a space for students to connect, explore, and create lasting memories.",

                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W500
            )

            // SERVICES AND AMENITIES
            Text(
                text = "SERVICES AND AMENITIES",
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Cyan,
                fontSize = 25.sp
            )
            Text(
                text = "At Esgrays Hostels, we offer a range of accommodation to suit every student's needs from cozy dormitories to private rooms with modern amenities. Our facilities include a spacious common area for socializing and Wi-Fi access throughout the hostel.",
                //style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W500
            )

            // CONTACT US
            Text(
                text = "CONTACT US",
                //style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(vertical = 8.dp),
                fontFamily = FontFamily.Cursive,
                fontWeight = FontWeight.W900,
                color = Color.Cyan,
                fontSize = 25.sp
            )
            Text(
                text = "Ready to experience Esgrays Hostels? Book your stay today and discover the perfect comfort. For more information, contact us at [0703765456] or email us at esgrayshostels123@gmail.com",
                //style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(bottom = 16.dp),
                fontSize = 17.sp,
                color = Color.Black,
                fontWeight = FontWeight.W500
            )

            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = { navController.navigate(ROUTE_REGISTER) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 16.dp)
            ) {
                Text(text = "BOOK NOW")
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AboutUsScreenPreview() {
    Aboutscreen(rememberNavController())
}