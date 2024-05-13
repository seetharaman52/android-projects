package com.seetharaman.loginpage

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Header_text(){
    val annotatedString = buildAnnotatedString {
        withStyle(style = SpanStyle(color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)){
            append("Mount")
        }
        withStyle(style = SpanStyle(color = Color.Red , fontSize = 24.sp, fontWeight = FontWeight.ExtraBold)){
            append(" X ")
        }
        withStyle(style = SpanStyle(color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)){
            append("Everest")
        }
    }
    Text(text = annotatedString)
}

@Composable
fun Login(){
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.depth8),
            contentDescription = "Login Page BG",
            modifier = Modifier.matchParentSize(),
            contentScale = ContentScale.FillBounds,
        )
        Spacer(modifier = Modifier.height(100.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header_text()
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = "Login to your Account",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(20.dp))
            TextField(
                value = email,
                onValueChange = {
                    email = it
                },
                label = { Text(text = "Email Address")},
                shape = RoundedCornerShape(50),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.Email, contentDescription = "Email Content")
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = password,
                onValueChange = {
                    password = it
                },
                label = { Text(text = "Password")},
                visualTransformation = PasswordVisualTransformation(),
                shape = RoundedCornerShape(50),
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent
                ),
                leadingIcon = {
                    Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Password Content")
                }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(
                onClick = {},
                shape = RoundedCornerShape(20),
                border = BorderStroke(1.dp, Color.White)
            ) {
                Text(text = "Login")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Forgot your Password?",
                color = Color.White,
                modifier = Modifier.clickable {  }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Text(
                text = "Or Sign in with",
                color = Color.White,
            )
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ){
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "Twitter",
                    modifier = Modifier
                        .clickable { }
                        .size(42.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook",
                    modifier = Modifier
                        .clickable { }
                        .size(40.dp)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Image(painter = painterResource(
                    id = R.drawable.google),
                    contentDescription = "Google",
                    modifier = Modifier
                        .clickable { }
                        .size(40.dp)
                )
            }
        }
    }
}
