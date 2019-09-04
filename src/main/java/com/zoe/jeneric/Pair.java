package com.zoe.jeneric;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zoe
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pair<T> {
    private T first;
    private T second;

}
