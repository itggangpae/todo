package com.adamsoft.todo.domain;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
public class ResponseDTO <T>{
    private String error;
    private List<T> data;
}
