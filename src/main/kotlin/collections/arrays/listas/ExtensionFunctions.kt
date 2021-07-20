package collections.arrays.listas

import java.math.BigDecimal

//Temos 2 funções extendidas de um tipo Array que possui valores em tipo BigDecimal

fun Array<BigDecimal>.somar() = this.reduce {
    acc, valor -> acc + valor
}

fun Array<BigDecimal>.media() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.somar() / this.size.toBigDecimal()