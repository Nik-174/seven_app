package data

data class GiftAttachment(val gift : Gift) : Attachment {
    override val type: String = "gift"


    override fun toString() : String{
        return "\n  $gift"
    }
}

