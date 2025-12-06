package lesson_22

class MainScreenViewModel() {

    var mainScreenState = MainScreenState("something data")

    fun loadData() {
        mainScreenState.data = null
        mainScreenState.data = "something data"
        mainScreenState = mainScreenState.copy(data = mainScreenState.data, isLoading = true)
    }
}

data class MainScreenState(var data: String?, var isLoading: Boolean = false)