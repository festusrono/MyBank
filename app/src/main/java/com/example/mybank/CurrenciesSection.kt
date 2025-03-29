package com.example.mybank

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.material.icons.rounded.CurrencyYen
import com.example.mybank.data.Currency

val currencies = listOf(
     Currency(
         name = "USD",
         buy = 23.35f,
         sell = 23.25f,
         icon = Icons.Rounded.AttachMoney
     ),
     Currency(
         name = "EUR",
         buy = 23.35f,
         sell = 23.25f,
         icon = Icons.Rounded.CurrencyYen
     ),

 )
