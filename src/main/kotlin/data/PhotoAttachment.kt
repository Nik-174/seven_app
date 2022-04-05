package data


class PhotoAttachment(val photo : Photo) : Attachment {
    override val type: String = "photo"

    override fun toString() : String{
        return "\n  $photo"
    }
}
