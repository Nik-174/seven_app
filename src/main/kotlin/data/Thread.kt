package data.data

data class Thread(
    val count : Int,
    val items : Array<Int>? = emptyArray(),
    val canPost : Boolean,
    val ShowReplyButton : Boolean,
    val groupsCanPost : Boolean
)
