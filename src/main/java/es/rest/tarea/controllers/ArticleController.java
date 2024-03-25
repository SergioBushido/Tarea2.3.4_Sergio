package es.rest.tarea.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


@Tag(name = "ArticleController", description = "Controlador para operaciones relacionadas con artículos")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1")
public class ArticleController {


    @Operation(summary = "Obtiene todos los artículos")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Lista de artículos encontrada exitosamente",
                    content = @Content(schema = @Schema(implementation = String.class)))
    })
    @GetMapping("/articles")
    public String getArticles() {
        return "List of articles";
    }

    @Operation(summary = "Obtiene un artículo por su ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artículo encontrado exitosamente",
                    content = @Content(schema = @Schema(implementation = String.class))),
            @ApiResponse(responseCode = "404", description = "Artículo no encontrado")
    })
    @GetMapping("/articles/{id}")
    public String getArticle(@PathVariable Long id) {
        return "Article";
    }

    @Operation(summary = "Crea un nuevo artículo")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Artículo creado exitosamente",
                    content = @Content(schema = @Schema(implementation = String.class)))
    })
    @PostMapping("/articles")
    public String createArticle(@RequestBody String article) {
        return article;
    }

    @Operation(summary = "Actualiza un artículo por su ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artículo actualizado exitosamente",
                    content = @Content(schema = @Schema(implementation = String.class)))
    })
    @PutMapping("/articles/{id}")
    public String updateArticle(@PathVariable Long id) {
        return "Article updated";
    }

    @Operation(summary = "Elimina un artículo por su ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Artículo eliminado exitosamente"),
            @ApiResponse(responseCode = "404", description = "Artículo no encontrado")
    })
    @DeleteMapping("/articles/{id}")
    public String deleteArticle(@PathVariable Long id) {
        return "Article deleted";
    }

}
