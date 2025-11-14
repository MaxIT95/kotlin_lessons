data class CategoryReceipt(val title: String, val pictureSource: String, val receipts: List<Receipt>)

data class Receipt(val name: String, val pictureSource: String, val portion: Integer, val ingredients: List<Ingredients>)

data class Ingredients(val name: String, val quantity: Integer)