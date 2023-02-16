package com.example.formsubmit.Util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author CoderXshuai
 * @date 2023/2/15 20:48
 */
@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    boolean success;
    String msg;
    Map<String, String> info;
}
