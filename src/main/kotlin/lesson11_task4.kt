data class CategoryReceipt(val title: String, val receipts: List<Receipt>)

data class Receipt(val ingredients: List<Ingredients>)

data class Ingredients(val name: String, val quantity: Integer)