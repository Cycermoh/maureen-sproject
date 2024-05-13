package com.maureen.Maurensproject.ui.theme.screens.Booking


import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.maureen.Maurensproject.navigation.ROUTE_BOOKING
import com.maureen.Maurensproject.navigation.ROUTE_HOME
import com.maureen.Maurensproject.navigation.ROUTE_LOGIN
import com.maureen.Maurensproject.navigation.ROUTE_REGISTER
import com.maureen.maurensproject.R

@Composable
fun Bookingscreen(navController: NavController){
    Column {
        TopBar()
        RoomsList(roomsList,navController)
        BottomAppBarWork()
    }
}
@Preview
@Composable
fun Bookingprev(){
    Bookingscreen(rememberNavController())
}
@Composable
fun BottomAppBarWork() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(Icons.Filled.Search, contentDescription = "search")

                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Filled.FavoriteBorder,
                            contentDescription = "Localized description",
                        )
                    }
//
//
                    Spacer(modifier = Modifier.width(40.dp))
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            Icons.Filled.MailOutline,
                            contentDescription = "Localized description",
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { /* do something */ },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.AccountCircle, "Localized description")
                    }
                }
            )
        },
    ) { innerPadding ->
        Text(modifier = Modifier.padding(innerPadding), text = "")

    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){

    val context = LocalContext.current.applicationContext
    TopAppBar(title = {Text(text = "Kempiski", fontFamily = FontFamily.Cursive, fontSize = 50.sp,
        fontWeight = FontWeight.Bold)},
        navigationIcon ={
            IconButton(onClick ={ }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription ="Home", tint = Color.Blue )

            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Cyan ,
            titleContentColor = Color.Black ,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = { Toast.makeText(context,"You have clicked the search icon",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Notifications, contentDescription = "notification", tint = Color.DarkGray)
            }
//            IconButton(onClick = {Toast.makeText(context,"You can share using",Toast.LENGTH_SHORT).show()}) {
//                Icon(imageVector = Icons.Filled.Share, contentDescription = "Share")
//            }
            IconButton(onClick = {Toast.makeText(context,"Choose from the given options",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "menu")
            }
        }

    )

}
data class Rooms(val name: String,val image: Int,val price: String,val button:String)
private val roomsList= listOf(
    Rooms("Acacia ", R.drawable.room1,"2500","Book"),
    Rooms("Bamboo ",R.drawable.room2,"3000","Book"),
    Rooms("Hilton ",R.drawable.room3,"3500","Book"),
    Rooms("Acampo ",R.drawable.room4,"3000","Book"),
    Rooms("kempiski",R.drawable.room5,"3500","Book"),
    Rooms("Massai",R.drawable.room6,"4500","Book"),
    Rooms("Panari", R.drawable.room7,"5000","Book"),
    Rooms("Farisi",R.drawable.room8,"4000","Book"),
    Rooms("Parkinn ",R.drawable.room9,"4500","Book"),
    Rooms("Sarova ",R.drawable.room10,"4500","Book"),
    Rooms("Eka ",R.drawable.room11,"5000","Book"),
)
@Composable
fun RoomsList(roomsList: List<Rooms>,navController: NavController) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 18.dp),
        modifier = Modifier.background(Color.White)
    ) {
        items(roomsList) { rooms ->
            ListAppear( model = rooms,navController)
        }
    }
}
@Composable
fun ListAppear(model:Rooms,navController: NavController) {
    Card(
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .size(400.dp, 400.dp)
            .padding(10.dp),
    ) {
        Column(modifier = Modifier.clickable {}) {
            Image(
                painter = painterResource(id = model.image),
                contentDescription = model.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(400.dp, 300.dp)
                    //.padding(5.dp)
                    .background(Color.Cyan)
            )
            Row {
                Text(
                    text = model.name,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Black
                )
                Spacer(modifier = Modifier.width(100.dp))

                Button(
                    onClick = { navController.navigate(ROUTE_BOOKING) },
                    colors = ButtonDefaults.buttonColors(Color.Blue)
                ) {
                    Text(
                        text = model.button, fontSize = 15.sp
                    )
                }

            }
            Text(
                text = model.price,
                fontSize = 24.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(navController: NavController){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = {
//            Text(
//                text = "Kempiski",
//                fontFamily = FontFamily.Cursive,
//                fontSize = 50.sp,
//                fontWeight = FontWeight.Bold
//            )
                Text(modifier = Modifier, text = "Kempiski",
                fontFamily = FontFamily.Cursive,
                fontSize = 50.sp,
                fontWeight = FontWeight.Bold)
        },
        navigationIcon = {
            IconButton(onClick = { ROUTE_HOME }) {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = "Home",
                    tint = Color.Blue
                )
            }
        },
        actions = {
            IconButton(
                onClick = {
                    Toast.makeText(
                        context,
                        "You have clicked the login button",
                        Toast.LENGTH_SHORT
                    ).show()
                    navController.navigate(ROUTE_LOGIN)
                }
            ) {
                Icon(
                    imageVector = Icons.Filled.AccountCircle,
                    contentDescription = "Login",
                    tint = Color.White
                )
            }
            IconButton(
                onClick = {
                    Toast.makeText(
                        context,
                        "You have clicked the register button",
                        Toast.LENGTH_SHORT
                    ).show()

                    navController.navigate(ROUTE_REGISTER)
                }
            ) {
                Icon(
                    imageVector =  Icons.Filled.MailOutline,
                    contentDescription = "Register",
                    tint = Color.White
                )
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Cyan,
            titleContentColor = Color.Black,
            navigationIconContentColor = Color.White
        )
    )
}
