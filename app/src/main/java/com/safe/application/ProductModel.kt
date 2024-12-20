package com.safe.application

class ProductModel {

    var name : String = ""
    var quantity : Int = 0
    var comment : String = ""
    var place : String = ""
    var state : Int = 0
    var seuil : Int = 0

    constructor(name: String, quantity: Int, comment: String, place: String, state: Int, seuil: Int) {
        this.name = name
        this.quantity = quantity
        this.comment = comment
        this.place = place
        this.state = state
        this.seuil = seuil
    }
}