package com.example.madlevel4task1

import android.content.Context

public class ProductRepository(context: Context) {

    private var productDao: ProductDao

    init {
        val shoppingListRoomDatabase = ShoppingListRoomDatabase.getDatabase(context)
        productDao = shoppingListRoomDatabase!!.productDao()
    }

    suspend fun getAllProducts(): List<Product> {
        return productDao.getAllProducts()
    }

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    suspend fun deleteProduct(product: Product) {
        productDao.deleteProduct(product)
    }

    suspend fun updateProduct(product: Product) {
        productDao.updateProduct(product)
    }

    suspend fun deleteAllProducts() {
        productDao.deleteAllProducts()
    }

}
