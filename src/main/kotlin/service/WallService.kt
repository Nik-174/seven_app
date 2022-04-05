package service

import data.Post
import data.data.Comment
import data.data.PostNotFoundException

object WallService {
    private var posts: Array<Post> = emptyArray()
    private var nextId: Int = 1
    private var comments = emptyArray<Comment>()

    fun add(post: Post) : Post {
        val postNew = post.copy(id = nextId)
        posts += postNew
        nextId += 1
        return posts.last()
    }

    fun update(postFind: Post) : Boolean {
        for ((index, post) in posts.withIndex()){
            if (post.id == postFind.id) {
                posts[index] = postFind.copy(ownerId = post.ownerId, date = post.date)
                return true
            }
        }
        return false
    }

    fun print(){
        for (post in posts){
            println(post)
        }
    }

    fun createComment(comment: Comment) : Boolean {
        for (post in posts){
            if (comment.postId == post.id) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("Пост не найден")
    }
}