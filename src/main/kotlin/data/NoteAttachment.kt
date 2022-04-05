package data


class NoteAttachment(val note : Note) : Attachment {
    override val type: String = "note"

    override fun toString() : String{
        return "\n  $note"
    }
}

