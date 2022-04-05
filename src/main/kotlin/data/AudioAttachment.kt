package data


class AudioAttachment( private val audio: Audio) : Attachment {
    override val type: String = "audio"

    override fun toString() : String{
        return "\n  $audio"
    }
}
