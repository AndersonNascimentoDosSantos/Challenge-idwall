package com.idwall.challengeapi;

import org.springframework.util.StringUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EnumValidator<T extends Enum<T>> {

    private final Class<T> enumClass;

    public EnumValidator(Class<T> enumClass) {
        this.enumClass = enumClass;
    }

    public boolean isValid(String value) {
        if (StringUtils.isEmpty(value)) {
            return false; // Valor vazio não é válido
        }

        try {
            Method valuesMethod = enumClass.getMethod("values");
            Enum<?>[] enumValues = (Enum<?>[]) valuesMethod.invoke(null);

            for (Enum<?> enumValue : enumValues) {
                if (enumValue.name().equalsIgnoreCase(value)) {
                    return true; // Valor encontrado no enum
                }
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace(); // Lidar com exceções conforme necessário
        }

        return false; // Valor não encontrado no enum
    }
}
