package data

data class Video(
    val id : Int,
    val owneId : Int,
    val title : String,
    val description : String,
    val duration : Int,
    val image : Array<Image>? = emptyArray<Image>(),
    val firstFrame : Array<Image>? = emptyArray<Image>(),
    val date : Int,
    val adding_date : Int,
    val views : Int,
    val localViews : Int,
    val comments : Int,
    val player : String,
    val platform : String,
    val canAdd : Boolean,
    val isPrivate : Boolean = true,
    val accessKey : String,
    val processing : Boolean,
    val isFavorite : Boolean,
    val canComment : Boolean,
    val canEdit : Boolean,
    val canLike : Boolean,
    val canRepost : Boolean,
    val canSubscribe : Boolean,
    val canAddToFaves : Boolean,
    val canAttachLink : Boolean,
    val width : Int,
    val height : Int,
    val userId : Int,
    val converting : Boolean,
    val added : Boolean,
    val isSubscribed : Boolean,
    val repeat : Int,
    val type : String,
    val balance : Int,
    val live_status : String,
    val live : Boolean,
    val upcoming : Boolean,
    val spectators : Int,
    val likes : VideoLikes,
    val repostst : VideoReposts
)
