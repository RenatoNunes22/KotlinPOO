package digonebank


import java.math.BigDecimal


class Conta(
    val agencia: String,
    val numacao: String,
    val saldo: BigDecimal
) {
    fun deposito(valor: BigDecimal){

    }
    fun saque(valor: BigDecimal){

    }
}