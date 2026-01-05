package cn.usst.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PasswordDTO {
    private Long id;
    private String oldPassword;
    private String newPassword;
}
