package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

import androidx.room.Index.Order


sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
