package com.springboot.blog.payload;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import java.util.Set;

@Data
@Schema(
        name= "PostDto Model information"
)
public class PostDto {
    private long id;

    @Schema(
            description ="Blog post title "
    )
    @NotEmpty
    @Size(min = 2, message = "Post title must be at least 2 characters")
    private String title;


    @Schema(
            description = "Blog post description "
    )
    @NotEmpty
    @Size(min = 10, message = "Post description must be at least 2 characters")
    private String description;

    @Schema(
            description = "Blog post content "
    )
    @NotEmpty
    private String content;

    @Schema(
            description = "Blog post comment "
    )
    private Set<CommentDto> comments;

    @Schema(
            description = "Blog post category "
    )
    private Long categoryId;
}
