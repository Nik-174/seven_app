package data

class VideoAttachment(val video : Video) : Attachment {
    override val type: String = "video"

    override fun toString() : String{
        return "\n  $video"
    }

}
