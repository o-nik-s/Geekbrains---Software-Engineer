package geekbrains_course.Seminar_3.Task_4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Objects;

@Data
@AllArgsConstructor
public class Cub {
    private Integer size;
    private String colour;
    private String material;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cub cub = (Cub) o;

        if (!Objects.equals(size, cub.size)) return false;
        if (!Objects.equals(colour, cub.colour)) return false;
        return Objects.equals(material, cub.material);
    }

    @Override
    public int hashCode() {
        int result = size != null ? size.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (material != null ? material.hashCode() : 0);
        return result;
    }
}
