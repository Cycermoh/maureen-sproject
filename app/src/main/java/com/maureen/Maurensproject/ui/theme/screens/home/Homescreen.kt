package com.maureen.Maurensproject.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.maureen.Maurensproject.navigation.ROUTE_LOGIN
import com.maureen.Maurensproject.navigation.ROUTE_REGISTER
import com.maureen.maurensproject.R

data class Room(val number: String, val price: String)

val sampleRooms = listOf(
    Room("101", "ksh 5500"),
    Room("102", "ksh 6200"),
    Room("103", "ksh 7000"),
    Room("201", "ksh 9000"),
    Room("202", "ksh 4500")
)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Homescreen(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(painter = painterResource(id = R.drawable.hostel1), contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "ESGRAYS HOSTELS", style = MaterialTheme.typography.headlineLarge,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Available Rooms", style = MaterialTheme.typography.headlineLarge,
                fontFamily = FontFamily.Cursive,
                color = Color.Magenta)
            Spacer(modifier = Modifier.height(16.dp))
            RoomList(rooms = sampleRooms)
            Spacer(modifier = Modifier.height(32.dp))
            Button(onClick = { navController.navigate(ROUTE_REGISTER) }) {
                Text(text = "Register")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate(ROUTE_LOGIN) }) {
                Text(text = "Login")
            }
        }
    }
}
@Composable
fun RoomList(rooms: List<Room>) {
    LazyColumn {
        items(rooms) { room ->
            RoomItem(room)
        }
    }
}

@Composable
fun RoomItem(room: Room) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(text = "Room Number: ${room.number}")
        Text(text = "Price: ${room.price}")
        // You can add more details or customize the room item layout as needed
    }
}

@Preview
@Composable
fun HomePagePreview() {
    Homescreen(rememberNavController())
}


