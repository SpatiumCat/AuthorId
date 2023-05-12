package dto

data class PostWithCommentsAndAuthors(
    val post: Post,
    val comments: List<CommentWithAuthor>,
    val author: Author
)
