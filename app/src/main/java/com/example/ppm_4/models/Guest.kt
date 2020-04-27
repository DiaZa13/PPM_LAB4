package com.example.ppm_4.models

data class Guest(var index: Int, var name:String = "", var phone:String = "1234-5678", var email:String = "", var registered:Boolean = false){
    init {
        name = when(index){
            1 -> "María Mireya Manríquez Acevedo"
            2 -> "Ofelia Marcela Aguilar Lemus"
            3 -> "Francisco Eduardo López Alarcón"
            4 -> "José Israel Camacho porras"
            5 -> "Veronica Marcela Lemuas Aguirre"
            6 -> "Víctor Hugo Adolfo Guerrero"
            7 -> "Martha Concepción Anzures Valladares"
            else -> "Oscar Alvarado Méndoza"}
        phone = when(index){
            1 -> "1234-5678"
            2 -> "3595-6596"
            3 -> "3575-9845"
            4 -> "4859-3324"
            5 -> "4950-3127"
            6 -> "9865-4583"
            7 -> "1254-8599"
            else -> "4596-7852" }
        email = when(index){
            1 -> "mariamanriquez@gmail.com"
            2 -> "ofelialemus12@hotmail.com"
            3 -> "francisalarcon@hotmail.com"
            4 -> "israelcamacho@gmail.com"
            5 -> "Veroeaguirre_52@hotmail.com"
            6 -> "victoradolfo@gmail.com"
            7 -> "concepcionanzures@gmail.com"
            else -> "oscarmen17@hotmail.com"}





    }
}


