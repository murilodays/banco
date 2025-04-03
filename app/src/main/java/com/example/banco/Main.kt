package com.example.banco

import java.util.Scanner

class CaixaEletronico {
    var saldo = 0.0
    val scanner = Scanner(System.`in`)

    fun iniciar() {
        while (true) {
            println("======================================")
            println("Bem-vindo ao Caixa Eletronico")
            println("Escolha uma opcao:")
            println("1 -> Sacar")
            println("2 -> Depositar")
            println("3 -> Consultar saldo")
            println("999 -> Encerrar atendimento")
            println("======================================")

            when (scanner.nextLine()) {
                "1" -> sacar()
                "2" -> depositar()
                "3" -> conferirExtrato()
                "999" -> {
                    println("Encerrando atendimento... Obrigado por utilizar nossos servicos!")
                    break
                }
                else -> println("Opcao invalida. Por favor, tente novamente.")
            }
        }
    }

    fun sacar() {
        print("Digite o valor que deseja sacar: ")
        val valor = scanner.nextDouble()
        scanner.nextLine()
        if (saldo == 0.0) {
            println("Seu saldo esta zerado. Deposite primeiro para poder sacar.")
        } else {
            if (valor > saldo) {
                println("Saldo insuficiente para essa operacao.")
            } else {
                saldo -= valor
                println("Saque de R$ ${"%.2f".format(valor)} realizado com sucesso!")
            }
        }
    }

    fun depositar() {
        print("Digite o valor que deseja depositar: ")
        val valor = scanner.nextDouble()
        scanner.nextLine()
        saldo += valor
        println("Deposito de R$ ${"%.2f".format(valor)} efetuado com sucesso!")
    }

    fun conferirExtrato() {
        println("Seu saldo atual e: R$ ${"%.2f".format(saldo)}")
    }
}

fun main() {
    val caixa = CaixaEletronico()
    caixa.iniciar()
}
