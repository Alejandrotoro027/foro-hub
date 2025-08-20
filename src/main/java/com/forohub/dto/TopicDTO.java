package com.forohub.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TopicDTO {
    @NotBlank(message = "El título es obligatorio")
    private String title;

    @NotBlank(message = "La descripción es obligatoria")
    private String description;
}
