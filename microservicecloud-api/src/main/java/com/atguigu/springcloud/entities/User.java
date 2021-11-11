package com.atguigu.springcloud.entities;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * desc 部门
 *
 * @author lml
 * @date 2020/01/09 10:20
 */
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private int id;
    private String username;
    private String password;
    private String nickname;
}
