package com.example.cupcake.data

import com.example.cupcake.R

object DataSource {
    val flavors = listOf(
        R.string.vanilla,
        R.string.chocolate,
        R.string.red_velvet,
        R.string.salted_caramel,
        R.string.coffee
    )

    val quantityOptions = listOf(
        Pair(R.string.quantity_1, 1),
        Pair(R.string.quantity_6, 6),
        Pair(R.string.quantity_12, 12)
    )
}
